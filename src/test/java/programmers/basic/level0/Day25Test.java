package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day25Test {

    Day25 day25 = new Day25();

    @Test
    @DisplayName("문자열 밀기")
    void solution1() {
        String a = "hello";
        String b = "ohell";
        int result = 1;
        assertEquals(day25.solution1(a, b), result);

        a = "apple";
        b = "elppa";
        result = -1;
        assertEquals(day25.solution1(a, b), result);

        a = "alive";
        b = "alive";
        result = 0;
        assertEquals(day25.solution1(a, b), result);
    }

    @Test
    @DisplayName("종이 자르기")
    void solution2() {
        int m = 2;
        int n = 2;
        int result = 3;
        assertEquals(day25.solution2(m, n), result);

        m = 2;
        n = 5;
        result = 9;
        assertEquals(day25.solution2(m, n), result);

        m = 1;
        n = 1;
        result = 0;
        assertEquals(day25.solution2(m, n), result);
    }

    @Test
    @DisplayName("연속된 수의 합")
    void solution3() {
        int num = 3;
        int total = 12;
        int[] result = {3, 4, 5};
        assertArrayEquals(day25.solution3(num, total), result);

        num = 5;
        total = 15;
        result = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(day25.solution3(num, total), result);

        num = 4;
        total = 14;
        result = new int[]{2, 3, 4, 5};
        assertArrayEquals(day25.solution3(num, total), result);

        num = 5;
        total = 5;
        result = new int[]{-1, 0, 1, 2, 3};
        assertArrayEquals(day25.solution3(num, total), result);
    }

    @Test
    @DisplayName("다음에 올 숫자")
    void solution4() {
        int[] common = {1, 2, 3, 4};
        int result = 5;
        assertEquals(day25.solution4(common), result);

        common = new int[]{2, 4, 8};
        result = 16;
        assertEquals(day25.solution4(common), result);
    }
}