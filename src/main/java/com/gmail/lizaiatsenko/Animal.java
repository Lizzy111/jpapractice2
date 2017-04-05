package com.gmail.lizaiatsenko;

import org.hibernate.annotations.DiscriminatorOptions;

import javax.persistence.*;

/**
 * Created by liza on 21/03/2017.
 */

@Entity
@Inheritance
@DiscriminatorColumn
@DiscriminatorOptions(force = true)
@Table


//@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn
//@Table

//
//@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    int age;
    String name;

    public Animal(){}

    public Animal(int age, String name) {
        this.age= age;
        this.name= name;
    }

    public abstract void voice();
}
