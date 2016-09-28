package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.Stock;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface StockDao {

    void create(Stock stock);
    void remove(Stock stock);

    Stock findByName(String name);
    Stock getById(Integer id);

    List<Stock> findAll();

}
