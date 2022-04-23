package streamAPI;

public class Employee {
    private final String name;
    private final int age;
    private final Level level;

    public Employee(String name, int age, Level level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}
