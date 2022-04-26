package collectionListAndSreams;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private final String name;
    private final int age;
    private final Grade grade;
    private final int score;

    public Employee(String name, int age, Grade grade, int score) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && score == employee.score && Objects.equals(name, employee.name) && grade == employee.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade, score);
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.getGrade().getLevel() - o.getGrade().getLevel();
        if (result == 0) return this.getScore() - o.getScore();
        return result;
    }
}
