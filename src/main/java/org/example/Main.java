package org.example;

import java.util.Collections;
import java.util.List;

import static org.example.Subject.ENGLISH;
import static org.example.Subject.MATH;

enum Subject {
    MATH, ENGLISH
}

public class Main {
    public static void main(String[] args) {
        Student s0 = new Student("Andrew", List.of(new Grade(MATH, 100), new Grade(ENGLISH, 75)));
        Student s1 = new Student("Peter", List.of(new Grade(MATH, 80), new Grade(ENGLISH, 90)));
        Student s2 = new Student("Colin", List.of(new Grade(MATH, 50), new Grade(ENGLISH, 70)));

        List<Student> students = List.of(s0, s1, s2);

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

record Student(String name, List<Grade> grades) {
}

record Grade(Subject subject, Integer score) {
}
