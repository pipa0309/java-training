package collectionListAndSreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppArrayListEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("n2", 32, Grade.MIDDLE, 53);
        Employee employee2 = new Employee("n1", 20, Grade.TRAINEE, 26);
        Employee employee3 = new Employee("n5", 41, Grade.SENIOR, 80);
        Employee employee4 = new Employee("n4", 40, Grade.MIDDLE, 66);
        Employee employee5 = new Employee("n3", 26, Grade.JUNIOR, 38);
        Employee employee6 = new Employee("n9", 36, Grade.TRAINEE, 31);
        Employee employee7 = new Employee("n8", 45, Grade.SENIOR, 96);
        Employee employee8 = new Employee("n6", 33, Grade.JUNIOR, 45);
        Employee employee9 = new Employee("n7", 24, Grade.TRAINEE, 15);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);
        employeeList.forEach(System.out::println);
        System.out.println();

        employeeList.remove(employee1);
        employeeList.forEach(System.out::println);
        System.out.println();

        employeeList.sort(Comparator.comparingInt(Employee::getScore));
        employeeList.forEach(System.out::println);
        System.out.println();

        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(new Employee("n21", 28, Grade.TRAINEE, 25));
        employeeList1.add(new Employee("n22", 35, Grade.SENIOR, 85));
        employeeList1.add(new Employee("n23", 39, Grade.JUNIOR, 48));
        employeeList1.add(new Employee("n24", 31, Grade.MIDDLE, 67));
        employeeList1.forEach(System.out::println);
        System.out.println();

        employeeList.addAll(employeeList1);
        employeeList.forEach(System.out::println);

        employeeList1.clear();
        System.out.println(employeeList1);
        System.out.println();

        employeeList.forEach(System.out::println);
        System.out.println(employeeList.indexOf(new Employee("n24", 31, Grade.MIDDLE, 67)));

        System.out.println();
        employeeList.forEach(System.out::println);
        System.out.println(employeeList.indexOf(employee8));
        System.out.println(employeeList.indexOf(employee2));
        System.out.println(employeeList.isEmpty());
        System.out.println(employeeList.contains(employee1));
        System.out.println(employeeList.containsAll(employeeList1));


    }
}
