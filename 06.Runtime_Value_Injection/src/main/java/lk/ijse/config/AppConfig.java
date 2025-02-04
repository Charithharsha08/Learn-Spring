package lk.ijse.config;

import lk.ijse.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {

}
