package Feb28;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> emp = exists();
//        System.out.println(emp);
        Collections.sort(emp);
//        System.out.println(emp);

        emp.sort((e1,e2)->e1.getFirstName().compareTo(e2.getFirstName()));
//        System.out.println(emp);

        emp.sort(((e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary())));
//        System.out.println(emp);

        Optional<Employee> collect = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
//        collect.ifPresent(System.out::println);

        //max salary by dept -- use groupby
        Map<String, List<Employee>> collect1 = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        //same as above just using lambda instead of method reference
        Map<String, List<Employee>> collect2 = emp.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));

        Map<String, Optional<Employee>> collect3 = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

//        System.out.println(collect3);

        Map<Boolean, List<Employee>> collect4 = emp.stream().collect(Collectors.partitioningBy(g -> g.getSalary() > 100000));
//        System.out.println(collect4);
        //System.out.println(collect1);

        //reduce
        Double reduce = emp.stream().map(Employee::getSalary).reduce(0.0, (a, b) -> a + b);
//        System.out.println(reduce);

        //key email
        Map<String, Employee> collect5 = emp.stream().collect(Collectors.toMap(e -> e.getEmail(), e->e));
        System.out.println(collect5);

        List<Employee> list =
                emp.stream().filter(e -> e.getHiredate().isAfter(LocalDate.now().minus(2, ChronoUnit.YEARS)))
                        .collect(Collectors.toList());
        System.out.println(list);
        //employee with the highest salary
        //count
        //
    }

    public static List<Employee> exists(){
        List<Employee> employees = new ArrayList<>();
                employees.add(new Employee("andy", "rogue", "andy@gmail.com", 35000, "sales", LocalDate.of(2025, 9, 23)));
                employees.add(new Employee("raj", "kumar", "kk@gmail.com", 85000, "IT", LocalDate.of(2024, 5, 4)));
                employees.add(new Employee("thomas", "kelvin", "kelvin@gmail.com", 65000, "HR", LocalDate.of(2022, 4, 12)));
                employees.add(new Employee("roger", "lest", "roger@gmail.com", 75000, "Tech", LocalDate.of(2020, 7, 30)));
                employees.add(new Employee("thang", "tran", "tran@gmail.com", 95000, "sales", LocalDate.of(2016, 9, 23)));
                employees.add(new Employee("alok", "bran", "alok@gmail.com", 45000, "IT", LocalDate.of(2023, 12, 18)));
                employees.add(new Employee("stark", "beige", "stark@gmail.com", 115000, "Tech", LocalDate.of(2025, 2, 27)));
                employees.add(new Employee("luci", "fan", "luci@gmail.com", 105000, "sales",LocalDate.of(2024, 7, 1)));


        return employees;
    }
}
