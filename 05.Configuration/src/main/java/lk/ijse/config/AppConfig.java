package lk.ijse.config;

import lk.ijse.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfigOne.class})
public class AppConfig {
    @Bean
    public SpringBeanOne springBean1() {
        return new SpringBeanOne();
    }
}
