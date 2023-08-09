package org.example.lambda.example;

public class Book {

    private int id;
    private String department;
    private int salary;

    public Book(int id, String department, int salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
