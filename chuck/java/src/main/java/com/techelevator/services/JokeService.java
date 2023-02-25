package com.techelevator.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    @Value("${JOKES_API}")
    private String JOKES_API;

    RestTemplate restTemplate = new RestTemplate();


}
