package com.capgemini.bike.voetbalteam;

import com.capgemini.bike.domain.Voetballer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Voetbalteam {

    @Autowired
    private Voetballer cruijff;

    @Autowired
    private Voetballer haan;

    public String getNames() {
        return cruijff.getName() + ", " + haan.getName();
    }
}
