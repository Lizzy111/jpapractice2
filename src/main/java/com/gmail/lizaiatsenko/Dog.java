package com.gmail.lizaiatsenko;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by liza on 21/03/2017.
 */

@Entity
@DiscriminatorValue("dog")
public class Dog extends Animal {
    boolean fetchStick;

    public Dog(int age, String name, boolean fetchStick) {
        super(age, name);
        this.fetchStick= fetchStick;
    }

    public Dog() {
    }

    public void voice() {
        System.out.println("Bau");
    }
}
