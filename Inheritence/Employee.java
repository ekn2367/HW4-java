package Inheritence;

public class Employee extends User{
    private String department;

    public Employee() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String department) {
        this.department = department;
    }
}
