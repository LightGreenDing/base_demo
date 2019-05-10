package com.zed.base_demo.aspect;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 统一处理异常
 *
 * @author:Zed
 * @date: 2019/4/15
 */
@RestControllerAdvice
public class ControllerAspect {
    /**
     * 捕获全局异常,处理所有不可知的异常
     *
     * @param e       异常
     * @param request 请求
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    Object handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", -100);
        // 异常消息
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }
}
