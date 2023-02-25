package com.techelevator.services;

import com.techelevator.model.Joke;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {

    @Value("${JOKES_API}")
    private String JOKES_API;

    RestTemplate restTemplate = new RestTemplate();

    public Joke getJoke(){
        ResponseEntity<Joke> responseEntity =
                restTemplate.exchange(JOKES_API,
                        HttpMethod.GET, makeEntity(), Joke.class);

        Joke joke = responseEntity.getBody();
        return joke;

    }
    public Joke getJoke2() {
        RestTemplate restTemplate = new RestTemplate();
        Joke joke = restTemplate.getForObject(JOKES_API, Joke.class);
        return joke;
    }



    private HttpEntity<Void> makeEntity(){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<Void> entity = new HttpEntity<>(headers);
        return entity;
    }
}
