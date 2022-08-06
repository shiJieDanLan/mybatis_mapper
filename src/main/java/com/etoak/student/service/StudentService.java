package com.etoak.student.service;

import com.etoak.student.factory.SF;
import com.etoak.student.mapper.SchoolMapper;
import com.etoak.student.mapper.StudentMapper;
import com.etoak.student.pojo.School;
import com.etoak.student.pojo.Student;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class StudentService {
    public School querySch(int id){
        SqlSession session=null;
        try{
            session= SF.getSession();
            SchoolMapper dao=session.getMapper(SchoolMapper.class);
            School stu=  dao.querySch(id);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }






    public Student queryStuWithSch(int id){
        SqlSession session=null;
        try{
            session= SF.getSession();
            StudentMapper dao=session.getMapper(StudentMapper.class);
            Student stu=  dao.queryStuWithSch(id);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }
    public List<Student> queryByNameAndEmail(Map<String,Object>map){
        SqlSession session=null;
        try{
            session= SF.getSession();
            StudentMapper dao=session.getMapper(StudentMapper.class);
            List<Student>stu=  dao.queryByNameAndEmail(map);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }
    public int addStus(List<Student> stus){
        SqlSession session=null;
        try{
            session= SF.getSession();
            StudentMapper dao=session.getMapper(StudentMapper.class);
            int stu=dao.addStus(stus);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  0;
    }
    public  boolean regStu(Student stu) {
        SqlSession session=null;
        try{
            session= SF.getSession();
            StudentMapper dao=session.getMapper(StudentMapper.class);
            int count=dao.addStu(stu);
            session.commit();;
            return count>0;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  false;
    }

    public Student  queryStuById(int id){
        SqlSession session=null;
        try{
            session= SF.getSession();
            StudentMapper dao=session.getMapper(StudentMapper.class);
            Student stu=dao.queryStuById(2);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }
    public List<Student> queryAll(){
        SqlSession session=null;
        try{
            session= SF.getSession();
            //
            StudentMapper dao=session.getMapper(StudentMapper.class);
            List<Student > stu=dao.queryAll();
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }

    public List<Student> querySome(int pageNumber,int pageSize){
        SqlSession session=null;
        try{
            session= SF.getSession();
            //
            StudentMapper dao=session.getMapper(StudentMapper.class);
            int start=(pageNumber-1)*pageSize;
            Map<String ,Object>map=new HashMap<>();
            map.put("start",start);
            map.put("pageSize",pageSize);
            List<Student > stu=dao.querySome22(map);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }
    public List<Student> queryByName(String name){
        SqlSession session=null;
        try{
            session= SF.getSession();
            //
            StudentMapper dao=session.getMapper(StudentMapper.class);

            List<Student > stu=dao.queryByName(name);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }

    public List<Student> queryByCondition(int pageNumber,int pageSize,Map<String ,Object>map){
        SqlSession session=null;
        try{
            session= SF.getSession();

            StudentMapper dao=session.getMapper(StudentMapper.class);

            PageHelper.startPage(pageNumber,pageSize);
            List<Student > stu=dao.queryByCondition(map);
            session.commit();;
            return  stu;
        }catch ( Exception e){
            e.printStackTrace();
            if(session!=null)session.rollback();
        }finally {
            if(session!=null)session.close();
        }
        return  null;
    }

}
