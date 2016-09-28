package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.Dish;
import ua.goit.java.RestaurantStructure.model.Order;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface OrderDao {

    void saveOrder(Order order);
    void deleteOrder(Order order);

    Order findById(Integer id);

    void addDish(Dish dish, Order order);
    void deleteDish(Dish dish, Order order);

    void closeOrder(Order order);

    List<Order> findAllOrders();

}
