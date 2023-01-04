package com.domain;

import javax.persistence.*;

@Entity
@Table(name = "zone")
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "dhaka")
    private Long dhaka;

    @Column(name = "other")
    private Long other;

    @Column(name = "rest")
    private Long rest;

    public Zone() {
    }

    public Zone(int id, Long dhaka, Long other, Long rest) {
        this.id = id;
        dhaka = dhaka;
        other = other;
        rest = rest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getDhaka() {
        return dhaka;
    }

    public void setDhaka(Long dhaka) {
        this.dhaka = dhaka;
    }

    public Long getOther() {
        return other;
    }

    public void setOther(Long other) {
        this.other = other;
    }

    public Long getRest() {
        return rest;
    }

    public void setRest(Long rest) {
        this.rest = rest;
    }
}
