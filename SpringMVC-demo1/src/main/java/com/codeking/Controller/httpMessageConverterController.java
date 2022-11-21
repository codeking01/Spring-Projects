package com.codeking.Controller;

import com.codeking.Bean.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;

/**
 * @author : codeking
 * @date : 2022/11/21 15:02
 */
@Controller
public class httpMessageConverterController {
    //@RequestBody可以获取请求体，需要在控制器方法设置一个形参，使用@RequestBody进行标识，当
    //前请求的请求体就会为当前注解所标识的形参赋值
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody" + requestBody);
        return "success";
    }

    // RequestEntity封装请求报文的一种类型，需要在控制器方法的形参中设置该类型的形参，当前请求的
    //请求报文就会赋值给该形参，可以通过getHeaders()获取请求头信息，通过getBody()获取请求体信息
    @RequestMapping("/testRequestEntity")
    public String testRequestBody(RequestEntity<String> requestEntity) {
        System.out.println("requestHeader:" + requestEntity.getHeaders());
        System.out.println("requestBody:" + requestEntity.getBody());
        return "success";
    }

    //@RequestBody可以获取请求体，需要在控制器方法设置一个形参，使用@RequestBody进行标识，当
    //前请求的请求体就会为当前注解所标识的形参赋值
    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success!";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    //将Java对象直接作为控制器方法的返回值返回，就会自动转换为Json格式的字符串
    public User testResponseUser() {
        return new User("admin", "123456", new String[]{"1", "2", "3", "4", "5"});
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username, String password) {
        System.out.println("username:" + username + ",password:" + password);
        return "hello,ajax";
    }

    /**
     * 6、@RestController注解
     *
     * @RestController注解是springMVC提供的一个复合注解，标识在控制器的类上，就相当于为类添加了
     * @Controller注解，并且为其中的每个方法添加了@ResponseBody注解 7、ResponseEntity
     * ResponseEntity用于控制器方法的返回值类型，该控制器方法的返回值就是响应到浏览器的响应报文
     */


    @RequestMapping("testResponseEntity")
    public ResponseEntity<User> testResponseEntity() {
        String[] args = new String[]{"张三", "张三丰", "张无忌", "王二麻子", "张富贵"};
        ResponseEntity<User> User = new ResponseEntity<com.codeking.Bean.User>(new User("sd", "123", args), HttpStatus.valueOf(new Integer(200)));
        return User;
    }
}

/**
 * 6、@RestController注解
 * * @RestController注解是springMVC提供的一个复合注解，标识在控制器的类上，就相当于为类添加了
 * * @Controller注解，并且为其中的每个方法添加了@ResponseBody注解
 */
@RestController
class RestControllerTest {
    @RequestMapping("/testAjax2")
    public String testAjax(String username, String password) {
        System.out.println("username:" + username + ",password:" + password);
        return "hello,ajax2!!!";
    }
}