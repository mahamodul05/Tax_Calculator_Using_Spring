package com.domain;

import javax.persistence.*;

@Entity
@Table(name = "catagory")
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "general")
    private Long general;

    @Column(name = "female")
    private Long female;

    @Column(name = "disable")
    private Long disable;

    @Column(name = "gazeted")
    private Long gazeted;

    public Catagory() {
    }

    public Catagory(int id, Long general, Long female, Long disable, Long gazeted) {
        this.id = id;
        general = general;
        female = female;
        disable = disable;
        gazeted = gazeted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getGeneral() {
        return general;
    }

    public void setGeneral(Long general) {
        this.general = general;
    }

    public Long getFemale() {
        return female;
    }

    public void setFemale(Long female) {
        this.female = female;
    }

    public Long getDisable() {
        return disable;
    }

    public void setDisable(Long disable) {
        this.disable = disable;
    }

    public Long getGazeted() {
        return gazeted;
    }

    public void setGazeted(Long gazeted) {
        this.gazeted = gazeted;
    }
}
