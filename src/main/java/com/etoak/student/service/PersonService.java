package com.etoak.student.service;

import com.etoak.student.factory.SF;
import com.etoak.student.mapper.PersonMapper;
import com.etoak.student.pojo.Person;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PersonService {

    public  void addPerson(Person person){
        SqlSession session=null;
        try{
            session= SF.getSession();
            PersonMapper dao=session.getMapper(PersonMapper.class);
            int count=dao.addPerson(person);
            session.commit();
            System.out.println("---------------------------------");
            System.out.println(count);
            System.out.println("---------------------------------");
            System.out.println("-----");
            System.out.println("pppppp");
            System.out.println("hot-fix修改");
            System.out.println("合并中master额修改");
            System.out.println("hot-fix合并修改");
            System.out.println("pull test");
            System.out.println(person.getId());
        }catch (Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
    }

    public  void addPersons(List<Person> person){
        SqlSession session=null;
        try{
            session= SF.getSession();
            PersonMapper dao=session.getMapper(PersonMapper.class);
            dao.addPersons(person);
            session.commit();

        }catch (Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
    }

}
