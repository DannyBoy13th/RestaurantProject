package ua.goit.java.RestaurantStructure.dao.hibernate;

import ua.goit.java.RestaurantStructure.dao.IngridientDao;
import ua.goit.java.RestaurantStructure.dao.OrderDao;
import ua.goit.java.RestaurantStructure.model.Dish;
import ua.goit.java.RestaurantStructure.model.Order;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HOrderDao implements OrderDao{

    @Override
    public void saveOrder(Order order) {

    }

    @Override
    public void deleteOrder(Order order) {

    }

    @Override
    public Order findById(Integer id) {
        return null;
    }

    @Override
    public void addDish(Dish dish, Order order) {

    }

    @Override
    public void deleteDish(Dish dish, Order order) {

    }

    @Override
    public void closeOrder(Order order) {

    }

    @Override
    public List<Order> findAllOrders() {
        return null;
    }
}
