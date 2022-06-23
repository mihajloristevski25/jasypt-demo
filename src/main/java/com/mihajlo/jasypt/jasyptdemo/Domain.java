package com.mihajlo.jasypt.jasyptdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Domain {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
