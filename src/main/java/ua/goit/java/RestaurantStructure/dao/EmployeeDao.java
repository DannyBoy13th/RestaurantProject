package ua.goit.java.RestaurantStructure.dao;

import ua.goit.java.RestaurantStructure.model.Employee;
import ua.goit.java.RestaurantStructure.model.Position;

import java.util.List;

/**
 * Created by Daniel Solo on 21.09.2016.
 */
public interface EmployeeDao {

    void save(Employee employee);
    void remove(Employee employee);

    Employee findByName(String name);
    List<Employee> finddAll();

    List<Employee> allWaiters(Position position);
    void removeAllEmployees();

    Employee getByID(Integer id);

}
