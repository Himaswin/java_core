package io.sample.Controller;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    String name;
    int id;
    double salary;

}
