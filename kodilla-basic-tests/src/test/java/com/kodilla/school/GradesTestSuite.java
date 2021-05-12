package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {
    Grades grades = new Grades();

    @Test
    public void shouldHaveZeroLength() {
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }

    @Test
    public void ShouldCalculateAverage() {
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.GetAverage(), 0.01);
    }

    @Test
    public void ShouldReturnAverageEqualsZeroIfArrayIsZero() {
        assertEquals(0, grades.GetAverage(), 0.0001);
    }
}
