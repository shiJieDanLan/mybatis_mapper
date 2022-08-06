package com.etoak.student.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("person")
public class Person {
   private String id;
    private  String name;
    private  int age;
}
