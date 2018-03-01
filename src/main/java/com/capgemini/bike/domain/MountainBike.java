package com.capgemini.bike.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class MountainBike implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String merk;
    private String model;
    private String type;

    private double price;

    @ManyToMany(mappedBy = "bikes")
    private List<Person> owners;

    public MountainBike() {

    }

    public MountainBike(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
