package cn.org.dianjiu.roboter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * created by limengwei on 2021-04-02
 *
 * Configuration声明是配置类
 *
 * EnableConfigurationProperties将被 @ConfigurationProperties修饰的类EncryptProperties加载到spring容器中
 *
 * ConditionalOnClass有在项目路径下加载到EnableEncryptAspect类，才会进行自动配置
 *
 * ConditionalOnProperty检查配置文件中，是否有以encrypt开头名称为enabled的配置， 由于允许属性缺失，所以仍然会自动配置。
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties(RoboterProperties.class)
public class RoboterAutoConfiguration {
    @Autowired
    private RoboterProperties roboterProperties;

    /**
     * @ConditionalOnBean         //	当给定的在bean存在时,则实例化当前Bean
     * @ConditionalOnMissingBean  //	当给定的在bean不存在时,则实例化当前Bean
     * @ConditionalOnClass        //	当给定的类名在类路径上存在，则实例化当前Bean
     * @ConditionalOnMissingClass //	当给定的类名在类路径上不存在，则实例化当前Bean
     */
    /*@Bean
    @ConditionalOnClass(FilterRegistrationBean.class)
    @ConditionalOnMissingBean(FilterRegistrationBean.class)
    public FilterRegistrationBean tokenFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new TokenFilter(tokenProperties));
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("TokenFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }*/
}