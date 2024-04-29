package Inheritence;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employeesh = employeeManager.getAll();

        Employee employee = new Employee();
        employee.setId(2);
        employee.setFirstName("Muhammed");
        employee.setLastName("İnan");
        employee.setEmail("muhammed@etiya.com");
        employee.setPassword("Programlama");

        employeeManager.addEmployee(employee);

        System.out.println("Çalışanın adı ve soyadı: " + employee.getFirstName() + " " +  employee.getLastName()
                + "\n" + "Email: " + employee.getEmail() + " Şifre: "  + employee.getPassword());


        System.out.println("-------------");
        System.out.println("Update: ");

        Employee employee1 = new Employee();
        employee1.setId(2);
        employee1.setFirstName("Yagız");
        employee1.setLastName("Delibas");
        employee1.setEmail("yagız@etiya.com");
        employee1.setPassword("Programlama");

        employeeManager.updateEmployee(employee1);

        System.out.println("Müşteri adı ve soyadı: " + employee1.getFirstName() + " " +  employee1.getLastName()
                + "\n" + "Email: " + employee1.getEmail() + " Şifre: "  + employee1.getPassword());


        System.out.println("------------------------");
        System.out.println("Delete:");
        employeeManager.deleteEmployee(2);
        for (Employee employee2:employeesh){
            System.out.println("Müşteri adı ve soyadı: " + employee2.getFirstName() + " " +  employee2.getLastName()
                    + "\n" + "Email: " + employee2.getEmail() + " Şifre: "  + employee2.getPassword());
        }
    }
}
