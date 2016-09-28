package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.Dish;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface DishDao{

    void save(Dish dish);
    void remove(Dish dish);

    List<Dish> findAll();
    Dish findByName(String name);

    void removeAllDishes();

    Dish getById(Integer id);
}
