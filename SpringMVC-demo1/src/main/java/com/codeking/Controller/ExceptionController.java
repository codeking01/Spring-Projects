package com.codeking.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : codeking
 * @date : 2022/11/22 22:02
 */
@Controller
public class ExceptionController {
    @GetMapping("/ExceptionTest")
    public String ExceptionTest() {
        System.out.println(1 / 0);
        return "success";
    }
}

//基于注解的异常处理
//@ControllerAdvice将当前类标识为异常处理的组件
@ControllerAdvice
class ExceptionAnnotationController {

    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(ArithmeticException.class)
    //MyExceptions表示当前请求处理中出现的异常对象
    public String handlerException(Model model, Exception MyExceptions) {
        model.addAttribute("MyExceptions", MyExceptions);
        System.out.println("注解的 配置····");
        return "Exception";
    }
}