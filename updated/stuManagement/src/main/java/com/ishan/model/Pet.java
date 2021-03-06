package com.ishan.model;

import javax.persistence.*;

/**
 * Created by chansani on 7/7/2017.
 */
@Entity
@Table(name="PETDATA")
public class Pet {

    @ManyToOne
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="petName")
    private String name;

    @Column(name="petType")
    private String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
