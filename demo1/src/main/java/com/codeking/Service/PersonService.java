package com.codeking.Service;

import com.codeking.Dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : codeking
 * @date : 2022/11/16 19:46
 */
//在注解里面 value 属性值可以省略不写，
//默认值是类名称，首字母小写
//PersonService -- personService

//@Component(value = "personService")
//@Service(value = "personService")
@Service(value = "personService")
public class PersonService {
    /*
    @Qualifier：根据名称进行注入
    这个@Qualifier 注解的使用，和上面@Autowired 一起使用 @Qualifier(value = "PersonDaoImpl1")
    @Resource：可以根据类型注入，可以根据名称注入
    //@Resource //根据类型进行注入
    @Resource(name = "PersonDaoImpl1") //根据名称进行注入
    */

    //@Autowired
    //@Qualifier(value = "PersonDaoImpl1")
    @Resource(name = "PersonDaoImpl1")
    private PersonDao personDao;

    @Value(value = "Person")
    private String name;

    public void add() {
        System.out.println("PersonService... add()...");
        personDao.add();
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "personDao=" + personDao +
                ", name='" + name + '\'' +
                '}';
    }
}
