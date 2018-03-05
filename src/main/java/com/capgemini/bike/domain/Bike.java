package com.capgemini.bike.domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@DiscriminatorValue("bike")
public class Bike extends AbstractEntity {

    private String merk;
    private String model;
    private String type;

    private double price;

    @ManyToOne
    private Person owner;


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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" +getId() +
                ", merk='" + merk + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


}
