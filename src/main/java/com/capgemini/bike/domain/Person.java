package com.capgemini.bike.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private byte age;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double saldo;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "owner")
    private List<MountainBike> bikes;

    public List<MountainBike> getBikes() {
        return bikes;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void verhoog(double delta) {
        this.saldo += delta;
    }

    public void verlaag(double delta) {
        this.saldo -= delta;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
