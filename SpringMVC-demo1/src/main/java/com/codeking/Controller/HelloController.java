package com.codeking.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : codeking
 * @date : 2022/11/18 20:57
 */
@Controller
public class HelloController {

    // 路由跳转的方法
    @RequestMapping(value ="/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping(value ="/hello")
    public String hello() {
        //设置视图名称
        return "hello";
    }
}
