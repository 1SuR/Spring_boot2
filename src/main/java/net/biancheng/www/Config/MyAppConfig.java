package net.biancheng.www.Config;

import net.biancheng.www.Service.Impl.PersonServiceImpl;
import net.biancheng.www.Service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    /**
     * 与 <bean id="personService" class="PersonServiceImpl"></bean> 等价
     * 该方法返回值以组件的形式添加到容器中
     * 方法名是组件 id（相当于 <bean> 标签的属性 id)
     */
    @Bean
    public PersonService personService(){
        System.out.println("在容器中添加了一个组件:peronService");
        return new PersonServiceImpl();
    }
}
