package lk.ijse;

import lk.ijse.bean.SpringBeanOne;
import lk.ijse.bean.SpringBeanTwo;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context   = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
       /* SpringBean1 springBean1 = context.getBean(SpringBean1.class);
        System.out.println(springBean1);
        SpringBean1 springBean2 = context.getBean(SpringBean1.class);
        System.out.println(springBean2);

        SpringBean2 springBean3 = context.getBean(SpringBean2.class);
        System.out.println(springBean3);
        SpringBean2 springBean4 = context.getBean(SpringBean2.class);
        System.out.println(springBean4);*/

       /* SpringBean2 springBean2 = context.getBean(SpringBean2.class);
        System.out.println(springBean2);

        SpringBean2 springBean3 = context.getBean(SpringBean2.class);
        System.out.println(springBean3);*/

        SpringBeanOne springBean1 = context.getBean(SpringBeanOne.class);
        System.out.println(springBean1);

        context.registerShutdownHook();
    }
}