package ua.goit.java.RestaurantStructure.dao.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.RestaurantStructure.dao.DishDao;
import ua.goit.java.RestaurantStructure.model.Dish;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HDishDao implements DishDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Dish dish) {
        sessionFactory.getCurrentSession().saveOrUpdate(dish);
    }

    @Override
    @Transactional
    public void remove(Dish dish) {
        sessionFactory.getCurrentSession().delete(dish);
    }

    @Override
    public List<Dish> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select d from Dish d").list(); /// Тут может быть ошибка. Проверить совпадение с базой данных. Тут с заглавной, а там таблица с маленькой.
    }

    @Override
    @Transactional
    public Dish findByName(String name) {
        Query query =sessionFactory.getCurrentSession().createQuery("select e from Dish e where e.name like :name");
        query.setParameter("name", name);
        return (Dish) query.uniqueResult();
    }

    @Override
    public void removeAllDishes() {
        sessionFactory.getCurrentSession().createQuery("delete from Dish").executeUpdate();
    }

    @Override
    public Dish getById(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery("select d from Dish d where d.id = :id");
        query.setParameter("id", id);
        Dish result = (Dish) query.uniqueResult();
        if(result == null){
            throw new RuntimeException("There is no dish with such ID " + id);
        }
        return result;
    }
}
