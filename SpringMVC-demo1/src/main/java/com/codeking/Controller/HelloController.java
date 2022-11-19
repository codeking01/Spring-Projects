package com.codeking.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author : codeking
 * @date : 2022/11/18 20:57
 */
@Controller
public class HelloController {

    // 路由跳转的方法
    @RequestMapping(value ="/")
    public String index(HttpServletRequest request) {
        //开启一个session，这个会设置cookie
        //Set-Cookie: JSESSIONID=15A1ECFC7636D7788B5C9E34B2C912EE; Path=/SpringMVC; HttpOnly
        HttpSession session = request.getSession();
        //设置视图名称
        return "index";
    }

    @RequestMapping(value ="/hello")
    public String hello() {
        //设置视图名称
        return "hello";
    }
}
