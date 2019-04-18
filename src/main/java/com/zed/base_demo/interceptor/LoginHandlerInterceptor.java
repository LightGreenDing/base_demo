package com.zed.base_demo.interceptor;

import com.alibaba.fastjson.JSON;
import com.zed.base_demo.utils.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 *
 * @author:Zed
 * @date: 2019/4/15
 */
@Slf4j
@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("======请求接口：{}，请求IP：{}，请求参数：{}",
                request.getRequestURI(), IpUtil.getIpAddress(request), JSON.toJSONString(request.getParameterMap()));
        //检查是否登录
//        Object user = request.getSession().getAttribute("loginUser");
//        if (user == null) {
//            //未登陆，返回登陆页面
////            request.setAttribute("msg", "没有权限请先登陆");
////            request.getRequestDispatcher("/index.html").forward(request, response);
//            return false;
//        }
//        log.info("登录用户：{}", user);

        //已登陆，放行请求
        return true;

    }
}
