package com.zed.base_demo.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;


/**
 * jwt工具类
 *
 * @author:Zed
 * @date: 2019/4/21
 */
public class JwtTokenProvider {
    SecretKeySpec key;

    public JwtTokenProvider() {
    }

    public JwtTokenProvider(String key) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), SignatureAlgorithm.HS512.getJcaName());
        this.key = secretKeySpec;
    }

    /**
     * 生成Token
     *
     * @param claims
     * @return
     */
    public String createToken(Claims claims) {
        String compact = Jwts.builder().setClaims(claims).compressWith(CompressionCodecs.DEFLATE).signWith(SignatureAlgorithm.HS512, key).compact();
        return compact;
    }

    /**
     * token转换
     *
     * @param token
     * @return
     */
    public Claims parseToken(String token) {
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
    }
}
