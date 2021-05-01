package de.mitaco.spring.spring5jokesappv2.controller;


import de.mitaco.spring.spring5jokesappv2.services.ChuckNorrisJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeController {

    @Autowired
    private final ChuckNorrisJokeService chuckNorrisJokeService;

    public ChuckNorrisJokeController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {
        model.addAttribute("joke",chuckNorrisJokeService.getQuote());
        return "index";
    }
}
