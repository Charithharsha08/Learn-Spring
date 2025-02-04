package lk.ijse.config;

import lk.ijse.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AppConfigOne {
    @Bean
    public SpringBeanTwo springBean2() {
        return new SpringBeanTwo();
    }
}
