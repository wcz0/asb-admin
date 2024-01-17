package com.wcz0.asb.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wcz0.asb.model.AdminSetting;
import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.dao.AdminSettingDao;
import org.springframework.beans.factory.annotation.Autowired;
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

//    public Result get


}
