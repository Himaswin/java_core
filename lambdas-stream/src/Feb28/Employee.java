package Feb28;

import java.time.LocalDate;
import java.util.Date;

public class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private String department;
    private LocalDate hiredate;

    public Employee(String firstName, String lastName, String email, double salary, String department, LocalDate hiredate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.hiredate = hiredate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", hiredate=" + hiredate +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.firstName.compareTo(o.firstName);
    }
}
