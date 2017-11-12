package kusha.spring5tutorial.service;

import kusha.spring5tutorial.commands.RecipeCommand;
import kusha.spring5tutorial.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
