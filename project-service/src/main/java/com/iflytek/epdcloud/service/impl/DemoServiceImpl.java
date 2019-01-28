package com.iflytek.epdcloud.service.impl;

import com.iflytek.epdcloud.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package_name: com.iflytek.epdcloud.service.impl
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/1/28 17:08
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    UserService userService;

    @Override
    public String test() {
        return userService.selectByPrimaryKey(1L).toString();
    }
}
