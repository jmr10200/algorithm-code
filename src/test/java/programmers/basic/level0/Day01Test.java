package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day01Test {

    Day01 day01 = new Day01();

    @Test
    @DisplayName("두 수의 합")
    void plusSolution() {
        int num1 = 2;
        int num2 = 3;
        assertEquals(day01.plusSolution(num1, num2), 5);

        num1 = 100;
        num2 = 2;
        assertEquals(day01.plusSolution(num1, num2), 102);
    }

    @Test
    @DisplayName("두 수의 차")
    void minusSolution() {
        int num1 = 2;
        int num2 = 3;
        assertEquals(day01.minusSolution(num1, num2), -1);

        num1 = 100;
        num2 = 2;
        assertEquals(day01.minusSolution(num1, num2), 98);
    }

    @Test
    @DisplayName("두 수의 곱")
    void multiplySolution() {
        int num1 = 3;
        int num2 = 4;
        assertEquals(day01.multiplySolution(num1, num2), 12);

        num1 = 27;
        num2 = 19;
        assertEquals(day01.multiplySolution(num1, num2), 513);
    }

    @Test
    @DisplayName("몫 구하기")
    void divideSolution() {
        int num1 = 10;
        int num2 = 5;
        assertEquals(day01.divideSolution(num1, num2), 2);

        num1 = 7;
        num2 = 2;
        assertEquals(day01.divideSolution(num1, num2), 3);
    }
}