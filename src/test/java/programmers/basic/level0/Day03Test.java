package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day03Test {

    Day03 day03 = new Day03();

    @Test
    @DisplayName("나머지 구하기")
    void solution1() {
        int num1 = 3;
        int num2 = 2;
        int result = 1;
        assertEquals(day03.solution1(num1, num2), result);

        num1 = 10;
        num2 = 5;
        result = 0;
        assertEquals(day03.solution1(num1, num2), result);
    }

    @Test
    @DisplayName("중앙값 구하기(배열:홀수) - for 이용")
    void solution2_1() {
        int[] array = {1, 2, 7, 10, 11};
        int result = 7;
        assertEquals(day03.solution2_1(array), result);

        array = new int[]{9, -1, 0};
        result = 0;
        assertEquals(day03.solution2_1(array), result);
    }

    @Test
    @DisplayName("중앙값 구하기(배열:홀수) - Arrays 이용")
    void solution2_2() {
        int[] array = {1, 2, 7, 10, 11};
        int result = 7;
        assertEquals(day03.solution2_2(array), result);

        array = new int[]{9, -1, 0};
        result = 0;
        assertEquals(day03.solution2_2(array), result);
    }

    @Test
    @DisplayName("최빈값 구하기")
    void solution3() {
        int[] array = {1, 2, 3, 3, 3, 3, 4};
        int result = 3;
        assertEquals(day03.solution3(array), result);

        array = new int[]{1, 1, 2, 2};
        result = -1;
        assertEquals(day03.solution3(array), result);

        array = new int[]{1};
        result = 1;
        assertEquals(day03.solution3(array), result);

        array = new int[]{999, 999, 993, 993, 999, 999 ,555, 555, 333, 333, 222, 1, 3, 4, 8, 9, 201, 13, 234, 346, 568,345, 999};
        result = 999;
        assertEquals(day03.solution3(array), result);
    }

    @Test
    @DisplayName("짝수는 싫어요")
    void solution4() {
        int num = 10;
        int[] result = {1, 3, 5, 7, 9};

        assertArrayEquals(day03.solution4(num), result);
        num = 15;
        result = new int[]{1, 3, 5, 7, 9, 11, 13, 15};

        assertArrayEquals(day03.solution4(num), result);
    }
}