package com.wcz0.asb.service.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcz0.asb.mapper.AdminMenuMapper;
import com.wcz0.asb.model.AdminMenu;
import org.springframework.stereotype.Service;

/**
 * @author wcz0
 */
@Service
public class AdminMenuDao extends ServiceImpl<AdminMenuMapper, AdminMenu> implements IService<AdminMenu> {
}
