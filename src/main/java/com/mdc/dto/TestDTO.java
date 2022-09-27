package com.mdc.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("test")
@Getter
@Setter
@ToString
public class TestDTO{
    String name;
    int age;

    public TestDTO(){

    }
    public TestDTO(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }
}