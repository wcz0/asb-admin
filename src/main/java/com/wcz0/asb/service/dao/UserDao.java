package com.wcz0.asb.service.dao;


import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcz0.asb.mapper.UserMapper;
import com.wcz0.asb.model.User;
import org.springframework.stereotype.Service;

/**
 * @author wcz0
 */
@Service
public class UserDao extends ServiceImpl<UserMapper, User> implements IService<User> {

}
