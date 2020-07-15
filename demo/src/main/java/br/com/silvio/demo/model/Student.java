package br.com.silvio.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private int id;
    private String name;
    public static List<Student> studentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static {
        studentRepository();
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private static void studentRepository(){
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Silvio"));
        studentList.add(new Student(2, "Eduardo"));
    }
}
