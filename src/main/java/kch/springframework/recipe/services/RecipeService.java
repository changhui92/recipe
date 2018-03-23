package kch.springframework.recipe.services;

import kch.springframework.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe getRecipeById(Long id);
}
