package de.mitaco.spring.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService{
    public String getQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
