package cn.org.dianjiu.roboter.config;

import cn.org.dianjiu.roboter.aspect.EnableDingTalkAspect;
import cn.org.dianjiu.roboter.aspect.EnableFeiShuAspect;
import cn.org.dianjiu.roboter.aspect.EnableWeTalkAspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
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
@EnableConfigurationProperties(cn.org.dianjiu.roboter.config.RoboterProperties.class)
@ConditionalOnClass({cn.org.dianjiu.roboter.config.RoboterProperties.class, EnableDingTalkAspect.class, EnableWeTalkAspect.class, EnableFeiShuAspect.class})
@ConditionalOnProperty(prefix = "encrypt", value = "enabled", matchIfMissing = true)
public class EncryptAutoConfiguration {
    @Autowired
    private RoboterProperties roboterProperties;

    /**
     * @ConditionalOnBean         //	当给定的在bean存在时,则实例化当前Bean
     * @ConditionalOnMissingBean  //	当给定的在bean不存在时,则实例化当前Bean
     * @ConditionalOnClass        //	当给定的类名在类路径上存在，则实例化当前Bean
     * @ConditionalOnMissingClass //	当给定的类名在类路径上不存在，则实例化当前Bean
     */
    @Bean
    @ConditionalOnClass(EnableDingTalkAspect.class)
    @ConditionalOnMissingBean(EnableDingTalkAspect.class)
    public EnableDingTalkAspect enableDingTalkAspect() {
        return new EnableDingTalkAspect();
    }

    @Bean
    @ConditionalOnClass(EnableWeTalkAspect.class)
    @ConditionalOnMissingBean(EnableWeTalkAspect.class)
    public EnableWeTalkAspect enableWeTalkAspect() {
        return new EnableWeTalkAspect();
    }

    @Bean
    @ConditionalOnClass(EnableFeiShuAspect.class)
    @ConditionalOnMissingBean(EnableFeiShuAspect.class)
    public EnableFeiShuAspect enableFeiShuAspect() {
        return new EnableFeiShuAspect();
    }

}