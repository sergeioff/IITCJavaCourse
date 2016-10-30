package exercises.exercise_12_1.task3;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee {\n\tname: " + name + ",\n\tsalary: " + salary +"\n}";
    }
}