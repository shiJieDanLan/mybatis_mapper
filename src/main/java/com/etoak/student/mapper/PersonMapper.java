package com.etoak.student.mapper;

import com.etoak.student.pojo.Person;

import java.util.List;

public interface PersonMapper {
    int addPerson(Person person);
    void addPersons(List<Person> person);

}
