package com.example.druiddemo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "userinfo")
public class UserInfoEntity {
    private Integer id;
    private String userName;
}
