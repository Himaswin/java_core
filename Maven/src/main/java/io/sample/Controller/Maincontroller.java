package io.sample.Controller;

import java.util.Arrays;
public class Maincontroller {
    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.setName("lokesh");
        System.out.println(emp);
        Employee emp0 = new Employee("harsh", 1, 35000);
        System.out.println(emp0);

        Employee emp1 = Employee.builder()
                 .id(2)
                .name("bro")
                .salary(2500)
                .build();

        System.out.println(emp1);

        Employee emp2 = new Employee();
        Employee.builder().id(4)
                .build();
        System.out.println(emp2);
    }
}
