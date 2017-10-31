package kusha.spring5tutorial.spring5webapp.controller;

import kusha.spring5tutorial.spring5webapp.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public String getBooks(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
