package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
        students = Arrays.asList(
                new Student("Andrew", Arrays.asList(new Grade(MATH, 100), new Grade(ENGLISH, 75))),
                new Student("Peter", Arrays.asList(new Grade(MATH, 80), new Grade(ENGLISH, 90))),
                new Student("Colin", Arrays.asList(new Grade(MATH, 50), new Grade(ENGLISH, 70)))
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
        List<Student> result = Main.sortStudents(this.students);
        assertEquals(null, result);
    }

    @Test
    void calculateAverageGrade() {
        Double expected = 77.5;
        Double result = Main.calculateAverageGrade(students);
        assertEquals(expected, result); // Do you notice any issues with this assert?
    }

    // Would you add more tests to the `calculateAverageGrade` method?

}