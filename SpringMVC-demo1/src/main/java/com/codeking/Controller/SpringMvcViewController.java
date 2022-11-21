package com.codeking.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : codeking
 * @date : 2022/11/20 22:18
 */
@Controller
public class SpringMvcViewController {
    @RequestMapping(value = "/testThymeleafView")
    public String thymeleafView() {
        return "testThymeleafView";
    }

    @RequestMapping(value = "/testForward")
    public String testForward() {
        // 转发请求
        return "forward:scopeHttpServletRequest";
    }

    @RequestMapping(value = "/testRedirect")
    public String testRedirect() {
        // 重定向请求
        return "redirect:scopeModelAndView";
    }
}
