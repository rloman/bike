package com.capgemini.bike.controller;

import com.capgemini.bike.domain.Voetballer;
import com.capgemini.bike.voetbalteam.Voetbalteam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/team/")
public class VoetbalteamController {

    @Autowired
    private Voetbalteam team;

    @Autowired
    private Voetballer cruijff;


    @GetMapping("voetballers")
    public ResponseEntity<String> names() {

        return new ResponseEntity<>(team.getNames() + this.cruijff.getName(), HttpStatus.OK);

    }
}
