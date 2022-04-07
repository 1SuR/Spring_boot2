package net.biancheng.www.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpring {
    @ResponseBody
    @RequestMapping("/hello_spring")
    public String helloSpring(){
        return "hello spring!";
    }
}
