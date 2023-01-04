package com.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "adminname")
    private String adminname;



    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public Admin() {
    }

    public Admin(int id, String adminname, String username, String password) {
        this.id = id;
        adminname = adminname;
        username = username;
        password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return adminname;
    }

    public void setName(String adminname) {
        this.adminname = adminname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
