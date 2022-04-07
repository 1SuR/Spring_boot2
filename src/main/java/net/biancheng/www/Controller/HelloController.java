package net.biancheng.www.Controller;

import net.biancheng.www.Bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//本身就是一个spring组件
@Controller
public class HelloController {

    @Autowired//自动装配
    private Person person;

    //接口 http://localhost:8080/hello
    @ResponseBody
    @RequestMapping("/hello")
    public Person hello(){
        //调用业务 前端接口
        return person;
    }
}
