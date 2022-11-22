package com.codeking.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : codeking
 * @date : 2022/11/22 21:21
 * <p>
 * SpringMVC中的拦截器有三个抽象方法：
 * preHandle：控制器方法执行之前执行preHandle()，其boolean类型的返回值表示是否拦截或放行，返
 * 回true为放行，即调用控制器方法；返回false表示拦截，即不调用控制器方法
 * postHandle：控制器方法执行之后执行postHandle()
 * afterComplation：处理完视图和模型数据，渲染视图完毕之后执行afterComplation()
 */

/**
 * SpringMVC中的拦截器有三个抽象方法：
 * preHandle：控制器方法执行之前执行preHandle()，其boolean类型的返回值表示是否拦截或放行，返
 * 回true为放行，即调用控制器方法；返回false表示拦截，即不调用控制器方法
 * postHandle：控制器方法执行之后执行postHandle()
 * afterComplation：处理完视图和模型数据，渲染视图完毕之后执行afterComplation()
 */

/**
 * a>若每个拦截器的preHandle()都返回true
 * 此时多个拦截器的执行顺序和拦截器在SpringMVC的配置文件的配置顺序有关：
 * preHandle()会按照配置的顺序执行，而postHandle()和afterCompletion()会按照配置的反序执行
 * b>若某个拦截器的preHandle()返回了false preHandle()返回false和它之前的拦截器的preHandle()都会执行，postHandle()都不执行，返回false
 * 的拦截器之前的拦截器的afterCompletion()会执行
 */
public class SecondInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("SecondInterceptor*** preHandle..");
        return HandlerInterceptor.super.preHandle(request, response, handler);
        //return false; false 是拦截 后期可以根据条件拦截即可
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("SecondInterceptor*** postHandle..");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("SecondInterceptor*** afterCompletion..");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
