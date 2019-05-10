package com.zed.base_demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 扩展springMvc
 *
 * @author:Zed
 * @date: 2019/4/15
 */
@Configuration
@Slf4j
public class WebConfig implements WebMvcConfigurer {
//    @Autowired
//    private LoginHandlerInterceptor loginHandlerInterceptor;
    @Value("${upload.file.path}")
    private String uploadPath;

    /**
     * 当前激活的配置文件
     */
    @Value("${spring.profiles.active}")
    private String env;

//    /**
//     * 添加拦截器
//     *
//     * @param registry
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
////        不拦截的请求
//        List<String> list = new ArrayList<>();
//        list.add("/register");
//        list.add("/login");
//        list.add("/index");
//        // addPathPatterns("/**") 表示拦截所有的请求
//        // excludePathPatterns("index.html","/login", "/register") 表示除了首页,登陆与注册之外，因为主页登陆注册不需要登陆也可以访问
//
//        registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/**").excludePathPatterns(list);
//    }

    /**
     * 请求图片的时候直接返回图片路径
     * 例如请求/image/**  返回对应存储路径
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String pathPattern = "/image/**";
        String location = "file:" + uploadPath;
        registry.addResourceHandler(pathPattern).addResourceLocations(location);
    }

    /**
     * 解决跨域问题
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

//    /**
//     * 拦截请求处理
//     *
//     * @param registry
//     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/index.html").setViewName("index");
//    }

//    /**
//     * 使用阿里 FastJson 作为JSON MessageConverter
//     *
//     * @param converters
//     */
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//        FastJsonConfig config = new FastJsonConfig();
//        config.setSerializerFeatures(SerializerFeature.WriteMapNullValue,//保留空的字段
//                SerializerFeature.WriteNullStringAsEmpty,//String null -> ""
//                SerializerFeature.WriteNullNumberAsZero);//Number null -> 0
//        converter.setFastJsonConfig(config);
//        converter.setDefaultCharset(Charset.forName("UTF-8"));
//        converters.add(converter);
//    }
}

