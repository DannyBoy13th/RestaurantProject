package ua.goit.java.RestaurantStructure.dao.hibernate;

import ua.goit.java.RestaurantStructure.dao.StockDao;
import ua.goit.java.RestaurantStructure.model.Stock;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HStockDao implements StockDao{
    @Override
    public void create(Stock stock) {

    }

    @Override
    public void remove(Stock stock) {

    }

    @Override
    public Stock findByName(String name) {
        return null;
    }

    @Override
    public Stock getById(Integer id) {
        return null;
    }

    @Override
    public List<Stock> findAll() {
        return null;
    }
}
