package com.etoak.student.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("sch")
@Data
public class School {
    private  int id;
    private  String info;
    private  String name;
    private String phone;

  private List<Student> stu;
}
