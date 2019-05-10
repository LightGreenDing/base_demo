package com.zed.base_demo.config;import com.fasterxml.jackson.annotation.JsonAutoDetect;import com.fasterxml.jackson.annotation.PropertyAccessor;import com.fasterxml.jackson.databind.ObjectMapper;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.data.redis.connection.RedisConnectionFactory;import org.springframework.data.redis.core.RedisTemplate;import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;import org.springframework.data.redis.serializer.StringRedisSerializer;/** * Redis 配置类 * @author:Zed * @date: 2019/5/9 */@Configurationpublic class RedisConfigurer {    /**     * 重新实现RedisTemplate：解决序列化问题     * @param redisConnectionFactory     * @return     */    @Bean    @SuppressWarnings({"rawtype", "unchecked"})    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){        RedisTemplate<String, Object> template = new RedisTemplate();        template.setConnectionFactory(redisConnectionFactory);        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);        ObjectMapper om = new ObjectMapper();        // 设置任何字段可见        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);        // 设置不是final的属性可以转换        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);        jackson2JsonRedisSerializer.setObjectMapper(om);        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();        // key采用String的序列化方式        template.setKeySerializer(stringRedisSerializer);        // hash的key采用String的序列化方式        template.setHashKeySerializer(stringRedisSerializer);        // value序列化方式采用jackson序列化方式        template.setValueSerializer(jackson2JsonRedisSerializer);        // hash的value序列化方式采用jackson序列化方式        template.setHashValueSerializer(jackson2JsonRedisSerializer);        template.afterPropertiesSet();        template.setEnableTransactionSupport(true);        return template;    }}