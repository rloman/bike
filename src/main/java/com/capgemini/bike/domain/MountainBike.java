package com.capgemini.bike.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mountainbike")
public class MountainBike extends Bike {

    private String kettingGuard;

    public String getKettingGuard() {
        return kettingGuard;
    }

    public void setKettingGuard(String kettingGuard) {
        this.kettingGuard = kettingGuard;
    }
}
