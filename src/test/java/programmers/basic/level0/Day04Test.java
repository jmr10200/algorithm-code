package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day04Test {

    Day04 day04 = new Day04();

    @Test
    @DisplayName("피자 나눠먹기 (1)")
    void solution1() {
        int num = 7;
        int result = 1;
        assertEquals(day04.solution1(num), result);

        num = 1;
        result = 1;
        assertEquals(day04.solution1(num), result);

        num = 15;
        result = 3;
        assertEquals(day04.solution1(num), result);
    }

    @Test
    @DisplayName("피자 나눠먹기 (2)")
    void solution2() {
        int num = 6;
        int result = 1;
        assertEquals(day04.solution2(num), result);

        num = 10;
        result = 5;
        assertEquals(day04.solution2(num), result);

        num = 4;
        result = 2;
        assertEquals(day04.solution2(num), result);
    }

    @Test
    @DisplayName("피자 나눠먹기 (3)")
    void solution3() {
        int slice = 7;
        int num = 10;
        int result = 2;
        assertEquals(day04.solution3(slice, num), result);

        slice = 4;
        num = 12;
        result = 3;
        assertEquals(day04.solution3(slice, num), result);
    }

    @Test
    @DisplayName("배열의 평균값")
    void solution4() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = 5.5;
        assertEquals(day04.solution4(numbers), result);

        numbers = new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        result = 94.0;
        assertEquals(day04.solution4(numbers), result);
    }
}