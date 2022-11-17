package com.codeking.Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : codeking
 * @date : 2022/11/16 20:53
 */
@Configuration
@ComponentScan(basePackages = "com.codeking")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
