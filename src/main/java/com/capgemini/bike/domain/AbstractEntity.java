package com.capgemini.bike.domain;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@DiscriminatorColumn(name="type")
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
