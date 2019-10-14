package com.lnb.user.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private Double balance;
}
