package com.zed.base_demo.bastEntity;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回消息封装
 *
 * @author:Zed
 * @date: 2019/4/15
 */
@Data
public class ResponseMsg implements Serializable {
    private String code;
    private String message;
    private Object data;

    public ResponseMsg() {
    }

    public ResponseMsg(String code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public ResponseMsg(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
