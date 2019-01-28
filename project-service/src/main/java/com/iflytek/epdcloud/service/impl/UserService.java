package com.iflytek.epdcloud.service.impl;

import com.iflytek.epdcloud.dto.User;
import com.iflytek.epdcloud.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public int deleteByPrimaryKey(Long id){
        return userMapper.deleteByPrimaryKey(id);
    }

    public int insert(User record){
        return userMapper.insert(record);
    }

    public int insertSelective(User record){
        return userMapper.insertSelective(record);
    }

    public User selectByPrimaryKey(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User record){
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record){
        return userMapper.updateByPrimaryKey(record);
    }

}
