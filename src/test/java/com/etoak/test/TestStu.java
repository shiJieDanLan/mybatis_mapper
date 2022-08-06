package com.etoak.test;

import com.etoak.student.pojo.Person;
import com.etoak.student.pojo.School;
import com.etoak.student.pojo.Student;

import com.etoak.student.service.PersonService;
import com.etoak.student.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import java.util.*;

public class TestStu {

    @Test
    public  void test1(){
        Student stu=new Student();
        stu.setBirth(new Date());
        stu.setEmail("da@dsf.da");
        stu.setSchid(3);
        stu.setName("kkkk");
        stu.setAge(22);

        Student stu2=new Student();
        stu2.setBirth(new Date());
        stu2.setEmail("ytuty@fg.er");
        stu2.setSchid(4);
        stu2.setName("pooooo");
        stu2.setAge(55);
        StudentService service=new StudentService();
        List<Student> list=new ArrayList<>();
        list.add(stu);
        list.add(stu2);
        service.addStus(list);
    }
    @Test
    public void test2(){
        Person person=new Person();
        PersonService service=new PersonService();
        person.setAge(22);
        person.setName("dfsf");
        service.addPerson(person);
    }
    @Test
    public void test3(){
        Person p=new Person();
        p.setName("ppp");
        p.setAge(2);
        Person p2=new Person();
        p2.setAge(4);
        p2.setName("uuu");
        List<Person> lis=new ArrayList<>();
        lis.add(p);
        lis.add(p2);
        PersonService service=new PersonService();
        service.addPersons(lis);
    }

    @Test
    public  void test4(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","p");
        map.put("email","");
        StudentService service=new StudentService();
        List<Student> dd=service.queryByNameAndEmail(map);
        System.out.println(dd);

    }
    @Test
    public  void test5(){
        StudentService service=new StudentService();
        Student dd=service.queryStuWithSch(2);
        System.out.println(dd);
    }


    @Test
    public  void test6(){
        StudentService service=new StudentService();
        School dd=service.querySch(4);
        System.out.println(dd);
    }

    @Test
    public  void test7(){
        StudentService service=new StudentService();
        Map<String,Object>map=new HashMap<>();
        map.put("name","");
        map.put("email","");
        List<Student> dd=service.queryByCondition(1,2,map);
        PageInfo info=new PageInfo(dd);

        System.out.println(dd);
    }
}
