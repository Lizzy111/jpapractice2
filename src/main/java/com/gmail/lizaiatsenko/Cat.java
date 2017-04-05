package com.gmail.lizaiatsenko;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by liza on 21/03/2017.
 */

@Entity
@DiscriminatorValue("cat")
public class Cat extends Animal {
    int climbTreeSpeed;

    public Cat(int age, String name, int climbTreeSpeed) {
        super(age, name);
        this.climbTreeSpeed= climbTreeSpeed;
    }

    public Cat() {
    }

    public void voice() {
        System.out.println("miau");
    }
}
