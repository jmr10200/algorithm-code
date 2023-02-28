package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day04Test {

    Level2Day04 day04 = new Level2Day04();

    @Test
    @DisplayName("예상 대진표")
    void solution1() {
        int n = 8;
        int a = 4;
        int b = 7;
        int result = 3;
        assertEquals(day04.solution1(n, a, b), result);
    }

    @Test
    @DisplayName("N개의 최소공배수")
    void solution2() {
        int[] arr = {2,6,8,14};
        int result = 168;
        assertEquals(day04.solution2(arr), result);

        arr = new int[]{1, 2, 3};
        result = 6;
        assertEquals(day04.solution2(arr), result);
    }

    @Test
    @DisplayName("점프와 순간이동")
    void solution3() {
        int n = 5;
        int result = 2;
        assertEquals(day04.solution3(n), result);

        n = 6;
        result = 2;
        assertEquals(day04.solution3(n), result);

        n = 5000;
        result = 5;
        assertEquals(day04.solution3(n), result);
    }

    @Test
    @DisplayName("멀리 뛰기")
    void solution4() {
        int n = 4;
        long result = 5;
        assertEquals(day04.solution4(n), result);

        n = 3;
        result = 3;
        assertEquals(day04.solution4(n), result);
    }
}