package lk.ijse.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name : " + name);
    }
/* public SpringBean1() {
        System.out.println("Spring Bean 1 Constructor");
    }*/

    @Bean
    public SpringBeanTwo springBean2() {
        SpringBeanThree springBean1 = springBean3();
        System.out.println(springBean1);
        SpringBeanThree springBean2 = springBean3();
        System.out.println(springBean2);
        return new SpringBeanTwo();
    }
    @Bean
    public SpringBeanThree springBean3() {
        return new SpringBeanThree();
    }
}
