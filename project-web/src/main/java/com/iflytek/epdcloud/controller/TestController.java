package com.iflytek.epdcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iflytek.epdcloud.service.DemoService;
/**
 * @Package_name: com.iflytek.epdcloud.controller
 * @Class_name: $CLASS_NAME$
 * @Exception: $Exception$
 * @Describe: TODO
 * @Author: shuaihu2
 * @Creat_date: 2019 2019/1/28 16:37
 **/
@RestController
@RequestMapping("demo")
public class TestController {
    @Autowired
    private DemoService demoService;

    @GetMapping("test")
    public String test() {
        return demoService.test();
    }
}
