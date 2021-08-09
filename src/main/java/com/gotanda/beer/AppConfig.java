package com.gotanda.beer;

import javax.servlet.http.HttpServlet;
import javax.servlet.Filter;

import com.gotanda.beer.filter.EncordingFilter;
import com.gotanda.beer.filter.LoginFilter;
import com.gotanda.beer.servlet.WelcomeServlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private static final int FILTER_ORDER_NO_ENCORDING = 1;
    private static final int FILTER_ORDER_NO_LOGIN = 2;

    @Bean    
    public ServletRegistrationBean<HttpServlet> welcomeServlet() {
           ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
           servRegBean.setServlet(new WelcomeServlet());
           servRegBean.addUrlMappings("/aaa");
           servRegBean.setLoadOnStartup(1);
           return servRegBean;
    }

    @Bean
    public FilterRegistrationBean<Filter> registLoginFilter() {
        // ServletContextInitializerBeansに格納される
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<Filter>(new LoginFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(FILTER_ORDER_NO_LOGIN);
        return bean;
    }
    @Bean
    public FilterRegistrationBean<Filter> registEncordingFilter() {
        // ServletContextInitializerBeansに格納される
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<Filter>(new EncordingFilter());
        bean.addUrlPatterns("/*");
        bean.setOrder(FILTER_ORDER_NO_ENCORDING);
        return bean;
    }
}
