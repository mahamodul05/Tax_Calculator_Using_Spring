package com.domain;

import javax.persistence.*;

@Entity
@Table(name = "inputdata")
public class Inputdata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "basicsalary")
    private Long basicsalary;

    @Column(name = "houserent")
    private Long houserent;

    @Column(name = "medical")
    private Long medical;

    @Column(name = "con")
    private Long con;

    @Column(name = "ot")
    private Long ot;

    @Column(name = "ft")
    private Long ft;

    @Column(name = "invest")
    private long invest;

    @Column(name = "username")
    private String username;

    public Inputdata() {
    }

    public Inputdata(int id, Long basicsalary, Long houserent, Long medical, Long con, Long ot, Long ft, Long invest, String username) {
        this.id = id;
        basicsalary = basicsalary;
        houserent = houserent;
        medical = medical;
        con = con;
        ot = ot;
        ft = ft;
        invest = invest;
        username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Long basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Long getHouserent() {
        return houserent;
    }

    public void setHouserent(Long houserent) {
        this.houserent = houserent;
    }

    public Long getMedical() {
        return medical;
    }

    public void setMedical(Long medical) {
        this.medical = medical;
    }

    public Long getCon() {
        return con;
    }

    public void setCon(Long con) {
        this.con = con;
    }

    public Long getOt() {
        return ot;
    }

    public void setOt(Long ot) {
        this.ot = ot;
    }

    public Long getFt() {
        return ft;
    }

    public void setFt(Long ft) {
        this.ft = ft;
    }

    public long getInvest() {
        return invest;
    }

    public void setInvest(long invest) {
        this.invest = invest;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
