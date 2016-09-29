package ua.goit.java.RestaurantStructure.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.goit.java.RestaurantStructure.dao.EmployeeDao;
import ua.goit.java.RestaurantStructure.model.Employee;
import ua.goit.java.RestaurantStructure.model.Position;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HEmployeeDao implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    @Transactional
    public void remove(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    @Transactional
    public Employee findByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select e from Employee e where e.name like :name");
        query.setParameter("name", name);
        return (Employee) query.uniqueResult();
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select e from Employee e").list();
    }

    @Override
    @Transactional
    public List<Employee> allWaiters(Position position) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select e from Employee e where e.position like :position");
        query.setParameter("position", position);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void removeAllEmployees() {
        sessionFactory.getCurrentSession().createQuery("delete from Employee").executeUpdate();
    }

    @Override
    @Transactional
    public Employee getByID(Integer id) {
        Query query = sessionFactory.getCurrentSession().createQuery("select e from Employee e where e.id = :id");
        query.setParameter("id", id);
        Employee result = (Employee) query.uniqueResult();
        if (result == null){
            throw new RuntimeException("There is no employee with such ID.");
        }
        return result;
    }
}
