package org.example.mywcs.config;

import org.example.mywcs.interceptor.AuthorizationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author：hb
 * @Package：org.example.mywcs.config
 * @Project：my-wcs
 * @Date：2/12/2024 10:34 am
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthorizationInterceptor()).excludePathPatterns("user/login");
    }
}
