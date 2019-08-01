package com.qianfeng.springboothello.config;

import com.qianfeng.springboothello.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Liy
 * @Date 2019/7/29
 */
@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean initFilterRegistrationBean() {
        FilterRegistrationBean filterFilterRegistrationBean = new FilterRegistrationBean();
        filterFilterRegistrationBean.setFilter(new MyFilter());
        return filterFilterRegistrationBean;
    }

}
