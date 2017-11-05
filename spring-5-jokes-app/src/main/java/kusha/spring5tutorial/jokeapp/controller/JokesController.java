package kusha.spring5tutorial.jokeapp.controller;

import kusha.spring5tutorial.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {

    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getRandomJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }


}
