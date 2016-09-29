package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.Ingredient;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface IngredientDao {

    void addIngridient(Ingredient ingredient);
    void removeIngridient(Ingredient ingredient);

    List<Ingredient> findAllIngridients();
    Ingredient findByName(String name);

    Ingredient findById(Integer id);
}
