package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.TestBean1;
import lk.ijse.bean.TestBean2;
import lk.ijse.bean.TestBean3;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context   = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

       /*  get the bean from the context
        SpringBean bean = context.getBean(SpringBean.class);
        System.out.println(bean);

         we can also get been id
        Object been = context.getBean("springBean");
        System.out.println(been);

         we can also get been id by type
        SpringBean bean1 = (SpringBean) context.getBean("springBean");
        System.out.println(bean1);


        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);*/

        // we can get the bean by name and Class
       /* TestBean2 testBean2 = context.getBean("testBean2", TestBean2.class);
        System.out.println(testBean2);*/

        // we can customize the bean id
       /* TestBean2 testBean22 = context.getBean("testBeanChangeTestBeanID", TestBean2.class);
        System.out.println(testBean22);*/

       /* MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);

        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection2);*/

       /* MyConnection myConnection3 = (MyConnection) context.getBean("getConnection");
        System.out.println(myConnection3);*/

      /*  MyConnection myConnection4 = (MyConnection) context.getBean("myConnection");
        System.out.println(myConnection4);*/

       /* Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("Shutting down . . . . . ");
                context.close();
            }
        });*/
        // if the JVM is shutting down close the context

        context.registerShutdownHook();
        // Same thing Done as Spring Bean

        TestBean1 testBean1 = context.getBean("testBean1", TestBean1.class);
        TestBean1 testBean2 = context.getBean("testBean1", TestBean1.class);
        System.out.println(testBean1);
        System.out.println(testBean2);

        TestBean2 testBean3 = context.getBean("testBean2", TestBean2.class);
        TestBean2 testBean4 = context.getBean("testBean2", TestBean2.class);
        System.out.println(testBean3);
        System.out.println(testBean4);

        MyConnection myConnection = context.getBean("connection", MyConnection.class);
        MyConnection myConnection2 = context.getBean("connection", MyConnection.class);
        System.out.println(myConnection);
        System.out.println(myConnection2);

        TestBean3 testBean5 = context.getBean("testBean3", TestBean3.class);
        TestBean3 testBean6 = context.getBean("testBean3", TestBean3.class);
        System.out.println(testBean5);
        System.out.println(testBean6);
    }
}
