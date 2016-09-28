package ua.goit.java.RestaurantStructure.dao.hibernate;

import ua.goit.java.RestaurantStructure.dao.DishDao;
import ua.goit.java.RestaurantStructure.model.Dish;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HDishDao implements DishDao{

    @Override
    public void save(Dish dish) {

    }

    @Override
    public void remove(Dish dish) {

    }

    @Override
    public List<Dish> findAll() {
        return null;
    }

    @Override
    public Dish findByName(String name) {
        return null;
    }

    @Override
    public void removeAllDishes() {

    }

    @Override
    public Dish getById(Integer id) {
        return null;
    }
}
