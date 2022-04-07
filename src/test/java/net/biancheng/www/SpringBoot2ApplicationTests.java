package net.biancheng.www;

import net.biancheng.www.Bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

//单元测试
@SpringBootTest
class SpringBoot2ApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;
    @Test
    public void testHelloService(){

        Boolean b=ioc.containsBean("personService");

        if (b){
            System.out.println("已经装载");
        }else {
            System.out.println("没有装载");
        }
    }

    @Test
    void contextLoads() {
    }

}
