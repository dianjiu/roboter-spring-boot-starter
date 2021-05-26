package cn.org.dianjiu.roboter.aspect;

import cn.org.dianjiu.roboter.config.RoboterAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({RoboterAutoConfiguration.class})
public @interface EnableRoboter {
}
