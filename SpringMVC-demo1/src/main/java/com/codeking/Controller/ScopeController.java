package com.codeking.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author : codeking
 * @date : 2022/11/19 20:44
 */
@Controller
public class ScopeController {
    @RequestMapping(value = "/scopeHttpServletRequest")
    public String testServletAPI(HttpServletRequest request) {
        request.setAttribute("RequestScope", "servletApi add");
        return "success";
    }

    @RequestMapping(value = "/scopeModelAndView")
    public ModelAndView scopeModelAndView() {
        /**
         * ModelAndView有Model和View的功能
         * Model主要用于向请求域共享数据
         * View主要用于设置视图，实现页面跳转
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("RequestScope", "ModelAndView add");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /**
     * Model、ModelMap、Map类型的参数其实本质上都是 BindingAwareModelMap 类型的
     * 使用Model向request域对象共享数据
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/scopeModel")
    public String scopeModel(Model model) {
        model.addAttribute("RequestScope", "Model add");
        return "success";
    }

    @RequestMapping(value = "/scopeMap")
    public String scopeMap(Map<String, Object> map) {
        map.put("RequestScope", "Model add");
        return "success";
    }

    // 向session域共享数据
    @RequestMapping(value = "/scopeSession")
    public String scopeSession(HttpSession session) {
        session.setAttribute("originalSession", "hello,原生的赋值session");
        return "success";
    }
    // 向application域共享数据
    @RequestMapping(value = "/scopeApplication")
    public String scopeApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        // 删除originalSession
        session.removeAttribute("originalSession");
        application.setAttribute("originalApplication", "hello,原生的赋值application");
        return "success";
    }
}
