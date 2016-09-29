package ua.goit.java.RestaurantStructure.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ua.goit.java.RestaurantStructure.dao.MenuDao;
import ua.goit.java.RestaurantStructure.model.Dish;
import ua.goit.java.RestaurantStructure.model.Menu;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HMenuDao implements MenuDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Menu menu) {
        sessionFactory.getCurrentSession().saveOrUpdate(menu);
    }

    @Override
    public void remove(Menu menu) {
        sessionFactory.getCurrentSession().remove(menu);
    }

    @Override
    public void addDish(Dish dish, Menu menu) {
        if (!menu.getDishes().contains)
    }

    @Override
    public Menu getByID(Integer id) {
        return null;
    }

    @Override
    public void eraseDish(Dish dish, Menu menu) {

    }

    @Override
    public Menu getByName(String name) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        return null;
    }
}
