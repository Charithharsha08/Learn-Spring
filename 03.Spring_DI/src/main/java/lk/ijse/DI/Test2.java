package lk.ijse.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInject {
    //@Autowired
    DI test1;

    /*public Test2(DI test1) {
        this.test1 = test1;

    }*/

    /*@Autowired
    public void setter(DI test1){
        this.test1 = test1;
    }*/



    public void display(){
        test1.sayHello();
    }

    @Override
    @Autowired
    public void inject(DI di) {
        this.test1 = di;
    }
}
