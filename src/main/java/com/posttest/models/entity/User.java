package com.posttest.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;
    
    public User(String password) {
        this.password = password;
    }

    private double is_active;

    public User() {
    }

    public User(Long id, String name, String password, double is_active) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.is_active = is_active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getIs_active() {
        return is_active;
    }

    public void setIs_active(double is_active) {
        this.is_active = is_active;
    }

    
}
