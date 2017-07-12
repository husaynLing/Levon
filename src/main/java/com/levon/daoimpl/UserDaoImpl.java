package com.levon.daoimpl;

import com.levon.dao.UserEntityMapper;
import com.levon.entity.UserEntity;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 * Created by forrest on 17-7-6.
 */
@Repository
public class UserDaoImpl implements UserEntityMapper{

    @Resource
    private SqlSessionFactory sqlSessionFactory;

    public int deleteByPrimaryKey(Integer id) {
        return deleteByPrimaryKey(id);
    }

    public int insert(UserEntity record) {
        return insert(record);
    }

    public int insertSelective(UserEntity record) {
        return insertSelective(record);
    }

    public UserEntity selectByPrimaryKey(Integer id) {
        UserEntityMapper um=sqlSessionFactory.openSession().getMapper(UserEntityMapper.class);
        UserEntity u=um.selectByPrimaryKey(id);
        return u;
    }

    public int updateByPrimaryKeySelective(UserEntity record) {
        return updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserEntity record) {
        return updateByPrimaryKey(record);
    }
}
