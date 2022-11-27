package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day10Test {

    Day10 day10 = new Day10();

    @Test
    @DisplayName("점의 위치 구하기")
    void solution1() {
        int[] dot = {2, 4};
        int result = 1;
        assertEquals(day10.solution1(dot), result);

        dot = new int[]{-7, 9};
        result = 2;
        assertEquals(day10.solution1(dot), result);
    }

    @Test
    @DisplayName("2차원으로 만들기")
    void solution2() {
        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] result = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        assertArrayEquals(day10.solution2(numList, n), result);

        numList = new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948};
        n = 3;
        result = new int[][]{{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};
        assertArrayEquals(day10.solution2(numList, n), result);
    }

    @Test
    @DisplayName("공던지기")
    void solution3() {
        int[] numbers = {1, 2, 3, 4};
        int k = 2;
        int result = 3;
        assertEquals(day10.solution3(numbers, k), result);

        numbers = new int[]{1, 2, 3, 4, 5, 6};
        k = 5;
        result = 3;
        assertEquals(day10.solution3(numbers, k), result);

        numbers = new int[]{1, 2, 3};
        k = 3;
        result = 2;
        assertEquals(day10.solution3(numbers, k), result);

        numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        k = 10;
        result = 5;
        assertEquals(day10.solution3(numbers, k), result);
    }

    @Test
    @DisplayName("배열 회전시키기")
    void solution4() {
        int[] numbers = {1,2,3};
        String direction = "right";
        int[] result = {3, 1, 2};
        assertArrayEquals(day10.solution4(numbers, direction), result);

        numbers = new int[]{4, 455, 6, 4, -1, 45, 6};
        direction = "left";
        result = new int[]{455, 6, 4, -1, 45, 6, 4};
        assertArrayEquals(day10.solution4(numbers, direction), result);
    }
}
