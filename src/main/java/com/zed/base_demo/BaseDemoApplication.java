package com.zed.base_demo;

import com.corundumstudio.socketio.AuthorizationListener;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.HandshakeData;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.Transport;
import com.corundumstudio.socketio.annotation.SpringAnnotationScanner;
import com.zed.base_demo.exception.MessageExceptionListener;
import com.zed.base_demo.utils.SocketConstant;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PreDestroy;

@SpringBootApplication
@MapperScan("com.zed.base_demo.dao")
public class BaseDemoApplication {

    @Value("${ws.server.host}")
    private String host;

    @Value("${ws.server.port}")
    private Integer port;

    private SocketIOServer server;

    @Bean
    public SocketIOServer socketIOServer() {
        Configuration config = new Configuration();
        config.setHostname(host);
        config.setPort(port);
        config.getSocketConfig().setReuseAddress(true);
        config.getSocketConfig().setSoLinger(0);
        //服务是低延迟的
        config.getSocketConfig().setTcpNoDelay(true);
        //可以探测客户端的连接是否还存活着
        config.getSocketConfig().setTcpKeepAlive(true);
        // 开放跨域
        config.setOrigin(null);
        config.setTransports(Transport.POLLING, Transport.WEBSOCKET);
        config.setExceptionListener(new MessageExceptionListener());
        //设置最大每帧处理数据的长度，防止他人利用大数据来攻击服务器
        config.setMaxFramePayloadLength(1024 * 1024);
        //设置http交互最大内容长度
        config.setMaxHttpContentLength(1024 * 1024);
        //身份验证
        config.setAuthorizationListener(new AuthorizationListener() {
            @Override
            public boolean isAuthorized(HandshakeData data) {
                String account = data.getSingleUrlParam(SocketConstant.ACCOUNT);
                return true;
            }
        });
        return server = new SocketIOServer(config);
    }

    @Bean
    public SpringAnnotationScanner springAnnotationScanner(SocketIOServer socketServer) {
        return new SpringAnnotationScanner(socketServer);
    }

    @PreDestroy
    public void destory() {
        server.stop();
    }

    public static void main(String[] args) {
        SpringApplication.run(BaseDemoApplication.class, args);
    }

}
