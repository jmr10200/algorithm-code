package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day17Test {

    Day17 day17 = new Day17();

    @Test
    @DisplayName("숫자 찾기")
    void solution1() {
        int num = 29183;
        int k = 1;
        int result = 3;
        assertEquals(day17.solution1(num, k), result);

        num = 232443;
        k = 4;
        result = 4;
        assertEquals(day17.solution1(num, k), result);

        num = 123456;
        k = 7;
        result = -1;
        assertEquals(day17.solution1(num, k), result);
    }

    @Test
    @DisplayName("n의 배수 고르기")
    void solution2() {
        int n = 3;
        int[] numList = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] result = {6, 9, 12};
        assertArrayEquals(day17.solution2(n, numList), result);
        n = 5;
        numList = new int[]{1, 9, 3, 10, 13, 5};
        result = new int[]{10, 5};
        assertArrayEquals(day17.solution2(n, numList), result);

        n = 12;
        numList = new int[]{2, 100, 120, 600, 12, 12};
        result = new int[]{120, 600, 12, 12};
        assertArrayEquals(day17.solution2(n, numList), result);
    }

    @Test
    @DisplayName("자릿수 더하기")
    void solution3() {
        int n = 1234;
        int result = 10;
        assertEquals(day17.solution3(n), result);

        n = 930211;
        result = 16;
        assertEquals(day17.solution3(n), result);
    }

    @Test
    @DisplayName("OX퀴즈")
    void solution4() {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] result = {"X", "O"};
        assertArrayEquals(day17.solution4(quiz), result);

        quiz = new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        result = new String[]{"O", "O", "X", "O"};
        assertArrayEquals(day17.solution4(quiz), result);

        quiz = new String[]{"-3 - 3 = -6", "-5 + -5 = -10", "0 - -15 = 10"};
        result = new String[]{"O", "O", "X"};
        assertArrayEquals(day17.solution4(quiz), result);

        quiz = new String[]{"-7 - -7 = 0", "-5 - 5 = -10", "-5 - -15 = 10"};
        result = new String[]{"O", "O", "O"};
        assertArrayEquals(day17.solution4(quiz), result);

        quiz = new String[]{"0 - 11 = -11", "0 - -5 = 5", "0 - -0 = 0", "0 + -15 = -15", "0 + 120 = 120", "0 + 0 = 0"};
        result = new String[]{"O", "O", "O", "O", "O", "O"};
        assertArrayEquals(day17.solution4(quiz), result);
    }
}