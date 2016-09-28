package ua.goit.java.RestaurantStructure.dao.hibernate;

import ua.goit.java.RestaurantStructure.dao.EmployeeDao;
import ua.goit.java.RestaurantStructure.model.Employee;
import ua.goit.java.RestaurantStructure.model.Position;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public class HEmployeeDao implements EmployeeDao {
    @Override
    public void save(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee findByName(String name) {
        return null;
    }

    @Override
    public List<Employee> finddAll() {
        return null;
    }

    @Override
    public List<Employee> allWaiters(Position position) {
        return null;
    }

    @Override
    public void removeAllEmployees() {

    }

    @Override
    public Employee getByID(Integer id) {
        return null;
    }
}
