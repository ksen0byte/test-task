package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.Subject.MATH;
import static org.example.Subject.ENGLISH;

public class Main {
    public static void main(String[] args) {
        Student student0 = new Student("Andrew",
                Arrays.asList(new Grade(MATH, 100), new Grade(ENGLISH, 75)));
        Student student1 = new Student("Peter",
                Arrays.asList(new Grade(MATH, 80), new Grade(ENGLISH, 90)));
        Student student2 = new Student("Colin",
                Arrays.asList(new Grade(MATH, 50), new Grade(ENGLISH, 70)));

        List<Student> students = Arrays.asList(student0, student1, student2);

        // task 1
        // print students and their grades
        printStudents(students);

        // task 2
        List<Student> sortedStudents = sortStudents(students);
        printStudents(sortedStudents);

        // task 3*
        Double averageGrade = calculateAverageGrade(students);
        System.out.println(averageGrade);
    }

    // It can be of any format, the important thing is that the following fields are printed:
    // Student.name, [Student.grade.subject, Student.grade.score]
    private static void printStudents(List<Student> students) {
        System.out.println(students);
    }

    // sort students by their names => Andrew, Colin, Peter
    private static List<Student> sortStudents(List<Student> students) {
        return students;
    }

    // Takes students' grades and calculates average => should return 77.5
    private static Double calculateAverageGrade(List<Student> students) {
        return 1.0;
    }

}

class Student {
    private final String name;
    private final List<Grade> grades;

    public Student(String name, List<Grade> grades) {
        this.name = name;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public List<Grade> getGrades() {
        return grades;
    }
}

class Grade {
    private final Subject subject;
    private final Integer score;

    public Grade(Subject subject, Integer score) {
        this.subject = subject;
        this.score = score;
    }
    public Subject getSubject() {
        return subject;
    }
    public Integer getScore() {
        return score;
    }
}

enum Subject {
    MATH, ENGLISH
}
