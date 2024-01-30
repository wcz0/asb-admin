package com.wcz0.asb.service;

import com.wcz0.asb.response.Result;
import com.wcz0.asb.service.dao.AdminMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wcz0
 */
@Service
public class AdminMenuService {

    @Autowired
    AdminMenuDao adminMenuDao;

    public Result all(){

        return Result.success(adminMenuDao.list());
    }
}
