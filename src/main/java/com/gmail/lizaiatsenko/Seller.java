package com.gmail.lizaiatsenko;

import javax.persistence.*;

/**
 * Created by liza on 21/03/2017.
 */
@Entity
@NamedQuery(name = "Seller.getAll", query = "Select c from Seller c")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String fullName; // Полное имя
    private int age;         // Возвраст
    private float salary;    // Зар. плата

    @Transient
    private String comment;

    public Seller(String fullName, int age, float salary) {
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
    }

    public Seller() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
