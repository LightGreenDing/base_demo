package com.zed.base_demo.controller;

import com.zed.base_demo.service.BetRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 登录控制器
 *
 * @author:Zed
 * @date: 2019/4/15
 */
@Controller
public class LoginController {
    @Autowired
    private BetRecordService betRecordService;

    @GetMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession httpSession) {
        if (!StringUtils.isEmpty(username) &&
                "123456".equals(password)) {
            //设置session
            httpSession.setAttribute("loginUser", username);
            //重定向到主页
            return "成功";
        } else {
            map.put("msg", "用户名密码错误");
            return "index";
        }
    }

    @GetMapping(value = "/")
    @ResponseBody
    public String login() {
        return "访问成功";
    }

    @GetMapping(value = "/getBetRecord")
    @ResponseBody
    public String getBetRecord() {
        return betRecordService.getList();
    }
}
