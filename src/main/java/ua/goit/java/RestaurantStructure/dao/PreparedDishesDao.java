package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.PreparedDishes;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface PreparedDishesDao {
    void create(PreparedDishes preparedDishes);
    List<PreparedDishes> allDishes();

}
