package com.canxue.basemb.entity;

import com.canxue.basemb.common.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student extends BaseEntity {

    private Long id;


    private Long cardNo;


    private String name;


    private Integer sex;


    private Integer age;


    private String email;


    public Student(Long id, Long cardNo, String name, Integer sex, Integer age, String email) {
        this.id = id;
        this.cardNo = cardNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }


}