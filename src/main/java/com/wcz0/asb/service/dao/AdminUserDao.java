package com.wcz0.asb.service.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcz0.asb.mapper.AdminUserMapper;
import com.wcz0.asb.model.AdminUser;
import org.springframework.stereotype.Service;

/**
 * @author wcz0
 */
@Service
public class AdminUserDao extends ServiceImpl<AdminUserMapper, AdminUser> implements IService<AdminUser> {


}
