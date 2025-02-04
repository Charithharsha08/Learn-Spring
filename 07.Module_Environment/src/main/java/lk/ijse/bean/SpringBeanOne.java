package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(username);
        System.out.println(databaseUser);
    }

    @Value("${os.name}")
    private String osName;

    @Value("${LOGNAME}")
    private String username;

    @Value("${database.user}")
    private String databaseUser;

    public SpringBeanOne() {
        System.out.println("Spring Bean One Created");
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
