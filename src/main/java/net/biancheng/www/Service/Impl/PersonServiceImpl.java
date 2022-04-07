package net.biancheng.www.Service.Impl;
import net.biancheng.www.Bean.Person;
import net.biancheng.www.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;


public class PersonServiceImpl implements PersonService {
    @Autowired
    private Person person;
    public Person getPersonInfo(){
        return person;
    }

}
