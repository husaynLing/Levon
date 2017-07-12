package com.levon.serviceImpl;

import com.levon.dao.UserEntityMapper;
import com.levon.daoimpl.UserDaoImpl;
import com.levon.entity.UserEntity;
import com.levon.service.IUserService;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by forrest on 17-7-5.
 */
@Service
public class UserService implements IUserService{

    @Resource
    UserDaoImpl userDaoImpl;


    public UserEntity getUserById(Integer i) {


        return userDaoImpl.selectByPrimaryKey(i);
    }
}
