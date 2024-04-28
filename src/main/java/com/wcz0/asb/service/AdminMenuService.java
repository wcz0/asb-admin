package com.wcz0.asb.service;

import com.wcz0.asb.enums.ActionEnum;
import com.wcz0.asb.model.AdminMenu;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.dao.AdminMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author wcz0
 */
@Service
public class AdminMenuService {

    @Autowired
    AdminMenuDao adminMenuDao;


    public Result<?> all(){

        return Result.success(adminMenuDao.list());
    }



    public Result<List<Map<String, Object>>> getMenus(){
        List<AdminMenu> menus = adminMenuDao.list();
        if (menus == null || menus.isEmpty()) {
            return Result.failed("暂无菜单");
        }
        List<Map<String, Object>> menuList = list2Menu(menus, 0, "");
        return Result.success(menuList);
    }

    private List<Map<String, Object>> list2Menu(List<AdminMenu> list, Integer parentId, String parentName) {

        List<Map<String, Object>> data = new ArrayList<>();
        for (AdminMenu item : list) {
            if (item.getParentId().equals(parentId)) {
                Map<String, Object> temp = new HashMap<>(15);
                String idStr = "[" + item.getId() + "]";
                temp.put("name", StringUtils.hasText(parentName) ? parentName + idStr : idStr);
                temp.put("path", item.getUrl());
                temp.put("component", "amis");
                temp.put("is_home", item.getIsHome());
                temp.put("is_full", 0);
                //TYPE_ROUTE = 1;const TYPE_LINK  = 2;
                temp.put("is_link", item.getUrlType() == 2);

                Map<String, Object> meta = new HashMap<>(10);
                meta.put("title", item.getTitle());
                meta.put("icon", item.getIcon() != null ? item.getIcon() : "-");
                meta.put("hide", item.getVisible() == 0);
                meta.put("order", item.getOrder());

                temp.put("meta", meta);

                List<Map<String, Object>> children = list2Menu(list, item.getId(), (String) temp.get("name"));

                if (!children.isEmpty()) {
                    temp.put("component", "amis");
                    temp.put("children", children);
                }

                data.add(temp);
                data.addAll(generateRoute(temp));
            }
        }
        return data;
    }

    private List<Map<String, Object>> generateRoute(Map<String, Object> item) {
        String url = (String) item.get("path");
        url = (url != null) ? url : "";

        // Remove query parameters
        url = url.replaceAll("\\?.*", "");

        final String childrenKey = "children";
        if (url.isEmpty() || item.containsKey(childrenKey)) {
            return new ArrayList<>();
        }

        String finalUrl = url;
        Function<String,Map<String, Object>> menu = (action) -> {
            Map<String, Object> menuMap = new HashMap<>(10);
            menuMap.put("name", item.get("name") + "-" + action);
            menuMap.put("path", finalUrl + getPathForAction(action));
            menuMap.put("component", "amis");

            Map<String, Object> meta = new HashMap<>(5);
            HashMap<String, String> metaObj = (HashMap<String, String>) item.get("meta");

            meta.put("hide", true);
            meta.put("icon", metaObj.get("icon"));
            meta.put("title", metaObj.get("title") + " - " + ActionEnum.get(action));
            menuMap.put("meta", meta);
            return menuMap;
        };

        List<Map<String, Object>> routeList = new ArrayList<>();
        routeList.add(menu.apply("create"));
        routeList.add(menu.apply("show"));
        routeList.add(menu.apply("edit"));

        return routeList;
    }

    private static final String ACTION_CREATE = "create";
    private static final String ACTION_SHOW = "show";
    private static final String ACTION_EDIT = "edit";

    private String getPathForAction(String action) {
        if (ACTION_CREATE.equals(action)) {
            return "/create";
        } else if (ACTION_SHOW.equals(action)) {
            return "/:id";
        } else if (ACTION_EDIT.equals(action)) {
            return "/:id/edit";
        } else {
            return "";
        }
    }
}
