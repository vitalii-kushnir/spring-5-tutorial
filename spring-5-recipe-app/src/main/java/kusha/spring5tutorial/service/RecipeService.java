package kusha.spring5tutorial.service;

import kusha.spring5tutorial.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
