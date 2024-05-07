package com.developer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.developer.model.Employee;
import com.developer.utils.UtilityHelper;
import com.fasterxml.jackson.core.type.TypeReference;

/**
 * @author Manjinder.rooprai
 */
@Service
public class EmployeeService {

    private List<Employee> employess = new ArrayList<>();

    public EmployeeService() {
        employess.addAll(UtilityHelper.employeeSupplier.get());
    }

    public List<Employee> findAll() {
        return employess;
    }

    public Employee findById(int id) {
        return employess.stream().filter(t -> t.getId().compareTo(id) == 0).findAny().orElse(null);
    }

    public Employee save(Employee employee) {
        employess.add(employee);
        return employee;
    }

    public Employee update(int id, Employee employee) {
        Optional<Employee> optionalEmployee = employess.stream().filter(t -> t.getId().compareTo(id) == 0).findAny();
        if (optionalEmployee.isEmpty()) {
            return null;
        }
        employess.remove(optionalEmployee.get());
        employee.setId(id);
        employess.add(employee);
        return employee;
    }

    public void delete(int id) {
        Optional<Employee> optionalEmployee = employess.stream().filter(t -> t.getId().compareTo(id) == 0).findAny();
        if (optionalEmployee.isPresent()) {
            employess.remove(optionalEmployee.get());
        }

    }
}
