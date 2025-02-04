package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {
    @Value("charith")
    private String name;

    public SpringBeanOne() {
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }
/*
   @Autowired(required = false)
   public SpringBeanOne(@Value("Charith") String name,@Value("26") int age) {
       System.out.println("Spring Bean One Created");
       System.out.println(name);
       System.out.println(age);
   }


    @Autowired(required = false)
    public SpringBeanOne(@Value("Charith") String name,@Value("26") int age,@Value("true") boolean isMarried) {
        System.out.println("Spring Bean One Created");
        System.out.println(name);
        System.out.println(age);
        System.out.println(isMarried);
    }
*/


}
