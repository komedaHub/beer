package com.gotanda.beer;

import javax.servlet.Filter;

import com.gotanda.beer.filter.EncordingFilter;
import com.gotanda.beer.filter.LoginFilter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private static final int ENCORDING_FILTER_ORDER_NO = 1;
    private static final int LOGIN_FILTER_ORDER_NO = 2;

    @Bean
    public FilterRegistrationBean<Filter> registLoginFilter() {
        // ServletContextInitializerBeansに格納される
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<Filter>(new LoginFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(LOGIN_FILTER_ORDER_NO);
        return bean;
    }
    @Bean
    public FilterRegistrationBean<Filter> registEncordingFilter() {
        // ServletContextInitializerBeansに格納される
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<Filter>(new EncordingFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(ENCORDING_FILTER_ORDER_NO);
        return bean;
    }
}
