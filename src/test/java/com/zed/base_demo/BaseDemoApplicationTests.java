package com.zed.base_demo;

import com.zed.base_demo.utils.DateTimeUtil;
import com.zed.base_demo.utils.JwtTokenProvider;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.impl.DefaultClaims;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseDemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void jwt() {
        JwtTokenProvider jwtTokenProvider = new JwtTokenProvider("123456");
        DefaultClaims claims = new DefaultClaims();
        claims.put("username", "zed");
        claims.put("expire", DateTimeUtil.getTimeByHour(1));
        String token = jwtTokenProvider.createToken(claims);
        System.out.println("生成的token:" + token);

        Claims claims1 = jwtTokenProvider.parseToken(token);
        System.out.println("解析出来的数据" + claims1);
    }

}
