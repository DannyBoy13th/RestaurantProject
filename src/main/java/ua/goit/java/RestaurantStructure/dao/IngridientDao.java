package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.Ingridient;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface IngridientDao {

    void addIngridient(Ingridient ingridient);
    void removeIngridient(Ingridient ingridient);

    List<Ingridient> findAllIngridients();
    Ingridient findByName(String name);

    Ingridient findById(Integer id);
}
