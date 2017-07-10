package com.ishan.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by isudayanga on 7/4/2017.
 */

@Entity
@Table(name="owner")
public class Owner {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    private  String mobile;


    private String city;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "owner")
    private List<Pet> petData = new ArrayList<Pet>();

    public List<Pet> getPetData() {
        return petData;
    }


    public void setPetData(List<Pet> petData) {
        for(Pet pet:petData){
            pet.setOwner(this);
        }

        this.petData = petData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
