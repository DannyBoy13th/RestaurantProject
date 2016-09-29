package ua.goit.java.RestaurantStructure.dao.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.RestaurantStructure.dao.IngredientDao;
import ua.goit.java.RestaurantStructure.model.Ingredient;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HIngredientDao implements IngredientDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addIngridient(Ingredient ingredient) {
        sessionFactory.getCurrentSession().saveOrUpdate(ingredient);
    }

    @Override
    @Transactional
    public void removeIngridient(Ingredient ingredient) {
        sessionFactory.getCurrentSession().remove(ingredient);
    }

    @Override
    @Transactional
    public List<Ingredient> findAllIngridients() {
        return sessionFactory.getCurrentSession().createQuery("select i from Ingridient i").list();
    }

    @Override
    @Transactional
    public Ingredient findByName(String name) {
        Query query = sessionFactory.getCurrentSession().createQuery("select  i from Ingridient where i.name = :name");
        query.setParameter("name", name);
        return (Ingredient) query.uniqueResult();
    }

    @Override
    @Transactional
    public Ingredient findById(Integer id) {
        Ingredient result = sessionFactory.getCurrentSession().get(Ingredient.class, id);
        if (result == null){
            throw new RuntimeException("There is no ingredient with such ID.");
        }
        return result;
    }
}
