package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.example.Subject.ENGLISH;
import static org.example.Subject.MATH;

enum Subject {
    MATH, ENGLISH
}

public class Main {
    public static void main(String[] args) {
        Student s0 = new Student("Andrew", Arrays.asList(new Grade(MATH, 100), new Grade(ENGLISH, 75)));
        Student s1 = new Student("Peter", Arrays.asList(new Grade(MATH, 80), new Grade(ENGLISH, 90)));
        Student s2 = new Student("Colin", Arrays.asList(new Grade(MATH, 50), new Grade(ENGLISH, 70)));

        List<Student> students = Arrays.asList(s0, s1, s2);

        // task 1
        // print students and their grades
        System.out.println("============ Task 1 ============");
        printStudents(students);

        // task 2
        System.out.println("============ Task 2 ============");
        List<Student> sortedStudents = sortStudents(students);
        printStudents(sortedStudents);

        // task 3
        System.out.println("============ Task 3 ============");
        Double averageGrade = calculateAverageGrade(students);
        System.out.println(averageGrade);
    }

    // It can be of any format, the important thing is that the following fields are printed:
    // Student.name, [Student.grade.subject, Student.grade.score]
    public static void printStudents(List<Student> students) {
    }

    // sort students by their names => Andrew, Colin, Peter
    public static List<Student> sortStudents(List<Student> students) {
        return Collections.emptyList();
    }

    // Take students' grades and calculate the average => should return 77.5
    public static Double calculateAverageGrade(List<Student> students) {
        return -1.;
    }

}

final class Student {
    private final String name;
    private final List<Grade> grades;

    Student(String name, List<Grade> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String name() {
        return name;
    }

    public List<Grade> grades() {
        return grades;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Student that = (Student) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.grades, that.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name=" + name + ", " +
                "grades=" + grades + ']';
    }

}

final class Grade {
    private final Subject subject;
    private final Integer score;

    Grade(Subject subject, Integer score) {
        this.subject = subject;
        this.score = score;
    }

    public Subject subject() {
        return subject;
    }

    public Integer score() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Grade that = (Grade) obj;
        return Objects.equals(this.subject, that.subject) &&
                Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, score);
    }

    @Override
    public String toString() {
        return "Grade[" +
                "subject=" + subject + ", " +
                "score=" + score + ']';
    }

}
