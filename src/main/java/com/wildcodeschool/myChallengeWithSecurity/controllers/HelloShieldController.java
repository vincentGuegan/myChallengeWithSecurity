package com.wildcodeschool.myChallengeWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloShieldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD.";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers Assemble.";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "Biarritz, Bordeaux, La Loupe, Lille, Lyon, Marseille, Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse, Tours, Berlin, Bruxelles, Bucarest, Lisbonne, Londres, Madrid";
    }

}