package com.zed.base_demo.context;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author:Zed
 * @date: 2019/4/15
 */
public class WebContextHolder {
    /**
     * 上下文的Request容器
     *
     * @return
     */
    public static HttpServletRequest getHttpServletRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();
        return request;
    }

    /**
     * 获取当前请求session
     *
     * @return
     */
    public static HttpSession getHttpSession() {
        return getHttpServletRequest().getSession();
    }

}
