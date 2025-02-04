package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig {
    // inter bean dependency

   /* @Bean
    public SpringBean1 getSpringBean1() {
        SpringBean2 springBean1 = getSpringBean2();
        SpringBean2 springBean2 = getSpringBean2();
        return new SpringBean1();
    }
    @Bean
    public SpringBean2 getSpringBean2() {
        return new SpringBean2();
    }*/

    /*@Bean
    public SpringBean1 getSpringBean1() {
        return new SpringBean1();
    }
    @Bean
    public SpringBean2 getSpringBean2() {
        SpringBeanThree springBean1 = getSpringBean3();
        SpringBeanThree springBean2 = getSpringBean3();
        return new SpringBean2();
    }
    @Bean
    public SpringBeanThree getSpringBean3() {
        return new SpringBeanThree();
    }*/
}
