package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.Dish;
import ua.goit.java.RestaurantStructure.model.Menu;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface MenuDao {

    void add(Menu menu);
    void remove(Menu menu);

    void addDish(Dish dish, Menu menu);

    Menu getByID(Integer id);

    void eraseDish(Dish dish, Menu menu);
    Menu getByName(String name);

    List<Menu> findAll();
}
