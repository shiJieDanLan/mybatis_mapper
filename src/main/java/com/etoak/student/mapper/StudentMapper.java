package com.etoak.student.mapper;

import com.etoak.student.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.OBJ_ADAPTER;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    public int addStu(Student stu);
    public Student queryStuById(int id);
    public List<Student > queryAll();
    public List<Student> querySome(@Param("start") int start,@Param("pageSize") int pageSize);
    public List<Student > querySome22(Map<String ,Object>map);
    public  List<Student > queryByName(String name);

    public  int addStus(List<Student> stus);

    public List<Student> queryByNameAndEmail(Map<String , Object>map);

    public List<Student> QQ(Map<String , Object>map);

    public Student queryStuWithSch(int id);

    public List<Student > queryByCondition(Map<String ,Object>map);

}

