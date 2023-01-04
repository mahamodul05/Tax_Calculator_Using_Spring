package com.domain;

import javax.persistence.*;

@Entity
@Table(name = "taxhistory")
public class Taxhistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "totalamount")
    private Long totalamount;

    @Column(name = "taxpayable")
    private Long taxpayable;

    @Column(name = "yearlytax")
    private Long yearlytax;

    @Column(name = "monthlytax")
    private Long monthlytax;

    public Taxhistory() {
    }

    public Taxhistory(int id, String username, Long totalamount, Long taxpayable, Long yearlytax, Long monthlytax) {
        this.id = id;
        username = username;
        totalamount = totalamount;
        taxpayable = taxpayable;
        yearlytax = yearlytax;
        monthlytax = monthlytax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public Long getTaxpayable() {
        return taxpayable;
    }

    public void setTaxpayable(Long taxpayable) {
        this.taxpayable = taxpayable;
    }

    public Long getYearlytax() {
        return yearlytax;
    }

    public void setYearlytax(Long yearlytax) {
        this.yearlytax = yearlytax;
    }

    public Long getMonthlytax() {
        return monthlytax;
    }

    public void setMonthlytax(Long monthlytax) {
        this.monthlytax = monthlytax;
    }
}