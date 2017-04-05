package com.gmail.lizaiatsenko;

import javax.persistence.*;
import java.util.List;

@Entity
@TableGenerator(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToMany
    @JoinTable
    List<Project> projectList;
}
