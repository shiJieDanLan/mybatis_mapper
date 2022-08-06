package com.etoak.student.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;
@Data
@Alias("stu")
public class Student {
    private  int id;
    private  int age;
    private  String name;
    private  int schid;
    private Date birth;
    private  String email;

    private  School sch;
}
