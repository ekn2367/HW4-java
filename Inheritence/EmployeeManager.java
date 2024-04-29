package Inheritence;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {

    private List<Employee> employees;

    public EmployeeManager() {

        employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Kübra");
        employee.setLastName("Bozalp");
        employee.setEmail("kubra@etiya.com");
        employee.setPassword("123kubra");
        employee.setDepartment("Test");
        employee.setCreatedDate(LocalDateTime.now());

        employees.add(employee);
    }

    public List<Employee> getAll(){
        return employees;
    }

    public void addEmployee(Employee employee){
        employee.setCreatedDate(LocalDateTime.now());
        employees.add(employee);
    }

    public void deleteEmployee(int id){
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if (employee.getId() == id){
                employee.setDeletedDate(LocalDateTime.now());
                employeeIterator.remove();
            }
        }
    }

    public void updateEmployee(Employee employee){
        for (Employee updateEmployee:employees){
            if (updateEmployee.getId() == employee.getId()){
                updateEmployee.setUpdatedDate(LocalDateTime.now());
                updateEmployee.setId(employee.getId());
                updateEmployee.setFirstName(employee.getFirstName());
                updateEmployee.setLastName(employee.getLastName());
            }
        }


    }

    public Employee getById(int id){
        for (Employee index : employees){
            if (index.getId()==id){
                return index;
            }
        }
        return null;
    }

    }

