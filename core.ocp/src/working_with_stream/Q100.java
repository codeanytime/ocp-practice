package working_with_stream;

import model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author thanhch
 * <p>
 * Date: 04/12/2023
 * <p>
 * Class: Q100
 */
public class Q100 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "thanh", 5));
        employeeList.add(new Employee(2, "huy", 4));
        employeeList.add(new Employee(3, "van", 10));
        employeeList.add(new Employee(10, "tuyen", 20));
        employeeList.add(new Employee(11, "ngan", 20));
        employeeList.add(new Employee(14, "yen", 13));
        employeeList.add(new Employee(19, "oanh", 1));

        List<String> employeeNames = employeeList.stream().
                collect(Collectors.mapping(Employee::getName, Collectors.toList()));
        System.out.println(employeeNames);

        List<Double> employeeSalary = employeeList.stream().collect(Collectors.mapping(Employee::getSalary,
                Collectors.toList()));
        System.out.println(employeeSalary);
        var employeeMaxSalary = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(employeeMaxSalary.orElseThrow().getSalary());

        var employeeGroupBySalary = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 10));
        System.out.println(employeeGroupBySalary);

        var employeeGroupBySalary2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.toList()));
        System.out.println(employeeGroupBySalary2);
    }
}
