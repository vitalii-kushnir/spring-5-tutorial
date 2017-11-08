package kusha.spring5tutorial.controllers;

import kusha.spring5tutorial.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class IndexController {

    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = { "", "/", "/index" }, method = RequestMethod.GET)
    public String getIndexPage(Model model) {
        log.debug("Rendering index page...");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
