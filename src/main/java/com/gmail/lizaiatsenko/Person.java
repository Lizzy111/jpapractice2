package com.gmail.lizaiatsenko;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

/**
 * Created by liza on 21/03/2017.
 */
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;
    int age;

    @OneToMany(targetEntity = ContInf.class, cascade = {CascadeType.ALL})
    @JoinTable
    List<ContInf> contInfList;

    public Person() {
    }

    public Person(String name, int age, List<ContInf> contInfs) {
        this.name = name;
        this.age = age;
        this.contInfList = contInfs;
    }
}
