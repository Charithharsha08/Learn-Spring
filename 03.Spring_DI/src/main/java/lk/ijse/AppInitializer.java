package lk.ijse;

import lk.ijse.DI.Test2;
import lk.ijse.bean.Boy;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context   = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        Test2 test2 = context.getBean(Test2.class);
        test2.display();
        context.registerShutdownHook();
    }
}