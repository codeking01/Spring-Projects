package com.codeking.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : codeking
 * @date : 2022/11/19 18:59
 */
@Controller
@RequestMapping("/params")
public class paramsTest {
    //此时请求映射所映射的请求的请求路径为：/params/paramsTest
    @RequestMapping(value= {"/paramsTest", "/paramsTest2"},method = RequestMethod.GET,params =  {"name=jack"})
    public String paramsTest(){
        return "paramsTest";
    }
}
