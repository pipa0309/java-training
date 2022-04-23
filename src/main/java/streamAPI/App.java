package streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = getEmployee();
        List<Employee> midSen = selectMiddleAndSenior(employees);
        minAgeMiddle(midSen);
        minAgeSenior(midSen);
        boolean isAge = midSen.stream()
                //все возрасты меньше 50 ?
                .allMatch(employee -> employee.getAge() < 50);
        System.out.println(isAge);
        boolean isName = midSen.stream()
                //есть возраст равный 22 ?
                .anyMatch(employee -> employee.getAge() == 22);
        System.out.println(isName);
        boolean isNameNone = midSen.stream()
                //нет имени равного "е" ?
                .noneMatch(employee -> employee.getName().equals("e"));
        System.out.println(isNameNone);
    }

    private static List<Employee> getEmployee() {
        return List.of(
                new Employee("e6", 32, Level.MIDDLE),
                new Employee("e3", 24, Level.JUNIOR),
                new Employee("e1", 25, Level.JUNIOR),
                new Employee("e4", 35, Level.MIDDLE),
                new Employee("e7", 40, Level.SENIOR),
                new Employee("e8", 41, Level.SENIOR),
                new Employee("e2", 35, Level.JUNIOR),
                new Employee("e9", 35, Level.SENIOR),
                new Employee("e5", 45, Level.MIDDLE)
        );
    }

    private static List<Employee> selectMiddleAndSenior(List<Employee> employees) {
        List<Employee> midSen = employees.stream()
                .filter(employee -> employee.getLevel().equals(Level.MIDDLE)
                        || employee.getLevel().equals(Level.SENIOR))
                .sorted(Comparator.comparing(Employee::getLevel)
                        .thenComparing(Employee::getAge))
                .collect(Collectors.toList());
        midSen.forEach(System.out::println);
        System.out.println();
        return midSen;
    }

    private static void minAgeMiddle(List<Employee> midSen) {
        midSen.stream()
                .filter(employee -> employee.getLevel().equals(Level.MIDDLE))
                .min(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
        System.out.println();
    }

    private static void minAgeSenior(List<Employee> midSen) {
        midSen.stream()
                .filter(employee -> employee.getLevel().equals(Level.SENIOR))
                .min(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
        System.out.println();
    }
}
