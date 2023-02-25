package com.techelevator.controller;

import com.techelevator.model.Joke;
import com.techelevator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JokeController {

    @Autowired
    JokeService service;

    @GetMapping("/joke")
    public Joke getJokeFromApi(){return service.getJoke();}
}
