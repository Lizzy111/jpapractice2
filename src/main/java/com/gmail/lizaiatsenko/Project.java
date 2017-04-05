package com.gmail.lizaiatsenko;

import javax.persistence.*;
import java.util.List;

/**
 * Created by liza on 23/03/2017.
 */
@Entity
@TableGenerator(name = "PROJECT")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToMany(mappedBy = "projectList")
    List<Employee> employeeList;
}
