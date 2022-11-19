package com.codeking.Controller;

import com.codeking.Bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : codeking
 * @date : 2022/11/19 19:26
 */
@Controller
public class ServletApiController {
    /**
     * 将HttpServletRequest作为控制器方法的形参，此时HttpServletRequest类型的参数表示封装了当前请
     * 求的请求报文的对象
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping(value = "/getParams")
    public String getParams(HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");
        System.out.println("name=" + name + " password=" + password);
        return "hello";
    }

    /**
     * 在控制器方法的形参位置，设置和请求参数同名的形参，当浏览器发送请求，匹配到请求映射时，在
     * DispatcherServlet中就会将请求参数赋值给相应的形参
     *
     * @param name
     * @param password
     * @return
     */
    @RequestMapping(value = "/getParams2")
    public String getParams2(String name, String password) {
        System.out.println("name = " + name + " password = " + password);
        return "hello";
    }

    @RequestMapping(value = "/getParams3")
    public String getParams3(@RequestParam(value = "my_name", required = false, defaultValue = "hhe") String name, String password) {
        System.out.println("name = " + name + " password = " + password);
        return "hello";
    }

    @RequestMapping(value = "/getParams4")
    public String getParams4(@RequestHeader(value = "test", required = false, defaultValue = "hello") String header,
                             @RequestHeader(value = "Host", required = false, defaultValue = "hello") String Host,
                             @CookieValue("JSESSIONID") String JSESSIONID) {
        System.out.println("header = " + header + ", Host= " + Host + ", JSESSIONID = " + JSESSIONID);
        return "hello";
    }
    @RequestMapping(value = "/getparamPOJO")
    public String getparamPOJO(User user,User user0){
        // 可以写两个，但是没必要
        System.out.println("User: " + user);
        System.out.println("User0: " + user0);
        return "hello";
    }
}
