package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.Subject.ENGLISH;
import static org.example.Subject.MATH;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    private List<Student> students;

    @BeforeEach
    void setUp() {
        // why do we need setUp?
        students = List.of(
                new Student("Andrew", List.of(new Grade(MATH, 100), new Grade(ENGLISH, 75))),
                new Student("Peter", List.of(new Grade(MATH, 80), new Grade(ENGLISH, 90))),
                new Student("Colin", List.of(new Grade(MATH, 50), new Grade(ENGLISH, 70)))
        );
    }

    @AfterEach
    void tearDown() {
        // why do we need tearDown?
    }

    @Test
    void printStudents() {
        // are we able to test the printing?
        Main.printStudents(students);
        assertTrue(false);
    }

    @Test
    void sortStudents() {
        // implement the test
        var result = Main.sortStudents(students);
        assertEquals(null, result);
    }

    @Test
    void calculateAverageGrade() {
        var expected = 77.5;
        var result = Main.calculateAverageGrade(students);
        assertEquals(expected, result); // Do you notice any issues with this assert?
    }

    // Would you add more tests to the `calculateAverageGrade` method?

}