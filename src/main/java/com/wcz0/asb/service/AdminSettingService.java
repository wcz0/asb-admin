package com.wcz0.asb.service;

import com.wcz0.asb.model.AdminSetting;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.response.admin.AdminSettingResponse;
import com.wcz0.asb.service.dao.AdminSettingDao;
import com.wcz0.asb.tools.Url;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author wcz0
 */
@Service
public class AdminSettingService extends BaseService{

    @Autowired
    AdminSettingDao adminSettingDao;

    @Value("${spring.application.name}")
    private String app_name;

    @Value("${website.logo}")
    private String logo;

    @Resource
    private Url url;

    @Transactional
    public Result store(Map<String, String> data){
        try{
            for (Map.Entry<String, String> entry : data.entrySet()) {
                AdminSetting adminSetting = new AdminSetting();
                adminSetting.setKey(entry.getKey());
                adminSetting.setValues(entry.getValue());
                adminSettingDao.saveOrUpdate(adminSetting);
            }
        } catch (Exception e){
            return Result.failed(e.getMessage());
        }
        return Result.success();
    }

    public Result<AdminSettingResponse> index(){
        AdminSettingResponse adminSettingResponse = new AdminSettingResponse();
        adminSettingResponse.setApp_name(app_name);
        adminSettingResponse.setLogo(url.get(logo));
        return Result.success(adminSettingResponse);
    }

}
