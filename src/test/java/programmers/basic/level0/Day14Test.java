package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day14Test {

    Day14 day14 = new Day14();

    @Test
    @DisplayName("가까운 수")
    void solution1() {
        int[] array = {3, 10, 28};
        int n = 20;
        int result = 28;
        assertEquals(day14.solution1(array, n), result);

        array = new int[]{10, 11, 12};
        n = 13;
        result = 12;
        assertEquals(day14.solution1(array, n), result);

        array = new int[]{4, 5, 10, 18, 20};
        n = 10;
        result = 10;
        assertEquals(day14.solution1(array, n), result);

        array = new int[]{4, 5, 10, 18, 20};
        n = 11;
        result = 10;
        assertEquals(day14.solution1(array, n), result);

        array = new int[]{4, 5, 10, 18, 20};
        n = 16;
        result = 18;
        assertEquals(day14.solution1(array, n), result);

        array = new int[]{4, 5, 10, 18, 20};
        n = 3;
        result = 4;
        assertEquals(day14.solution1(array, n), result);

        array = new int[]{4, 5, 10, 18, 20};
        n = 4;
        result = 4;
        assertEquals(day14.solution1(array, n), result);

        array = new int[]{4, 5, 10, 18, 20};
        n = 20;
        result = 20;
        assertEquals(day14.solution1(array, n), result);

    }

    @Test
    @DisplayName("369게임")
    void solution2() {
        int order = 3;
        int result = 1;
        assertEquals(day14.solution2(order), result);

        order = 29423;
        result = 2;
        assertEquals(day14.solution2(order), result);
    }

    @Test
    @DisplayName("암호해독")
    void solution3() {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String result = "attack";
        assertEquals(day14.solution3(cipher, code), result);

        cipher = "pfqallllabwaoclk";
        code = 2;
        result = "fallback";
        assertEquals(day14.solution3(cipher, code), result);
    }

    @Test
    @DisplayName("대문자와 소문자")
    void solution4() {
        String myString = "cccCCC";
        String result = "CCCccc";
        assertEquals(day14.solution4(myString), result);

        myString = "abCdEfghIJ";
        result = "ABcDeFGHij";
        assertEquals(day14.solution4(myString), result);
    }
}