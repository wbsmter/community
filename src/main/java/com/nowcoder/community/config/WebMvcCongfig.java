package com.nowcoder.community.config;

import com.nowcoder.community.controller.interceptor.Alphalntercepter;
import com.nowcoder.community.controller.interceptor.LoginRequiredInterceptor;
import com.nowcoder.community.controller.interceptor.LoginTicketIntercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcCongfig implements WebMvcConfigurer {

    @Autowired
    private Alphalntercepter alphalntercepter;

    @Autowired
    private LoginTicketIntercepter loginTicketIntercepter;

    @Autowired
    private LoginRequiredInterceptor loginRequiredInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(alphalntercepter)
//                .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png",
//                        "/**/*.jpg","/**/*.jpeg").addPathPatterns("/register","/login");

        registry.addInterceptor(loginTicketIntercepter)
                .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png",
                        "/**/*.jpg","/**/*.jpeg");

        registry.addInterceptor(loginRequiredInterceptor)
                .excludePathPatterns("/**/*.css","/**/*.js","/**/*.png",
                        "/**/*.jpg","/**/*.jpeg");
    }
}
