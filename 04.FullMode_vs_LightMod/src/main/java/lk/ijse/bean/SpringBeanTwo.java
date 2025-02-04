package lk.ijse.bean;

import org.springframework.beans.factory.BeanNameAware;

public class SpringBeanTwo implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name : " + name);
    }
   /* public SpringBean2() {
        System.out.println("Spring Bean 2 Constructor");
    }*/
}
