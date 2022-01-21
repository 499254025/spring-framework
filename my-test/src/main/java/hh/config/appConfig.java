package hh.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 洪康靖
 * @creationTime: 2022/1/21 14:19
 */
@Configuration
@ComponentScan("hh.*")
@Aspect
public class appConfig {
}
