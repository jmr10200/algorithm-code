package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day20Test {

    Day20 day20 = new Day20();

    @Test
    @DisplayName("직사각형 넓이 구하기")
    void solution1() {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int result = 1;
        assertEquals(day20.solution1(dots), result);

        dots = new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        result = 4;
        assertEquals(day20.solution1(dots), result);
    }

    @Test
    @DisplayName("캐릭터의 좌표")
    void solution2() {
        String[] keyInput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        int[] result = {2, 1};
        assertArrayEquals(day20.solution2(keyInput, board), result);

        keyInput = new String[]{"up", "up", "right", "right", "down", "down", "down"};
        board = new int[]{3, 3};
        result = new int[]{1, -1};
        assertArrayEquals(day20.solution2(keyInput, board), result);

        keyInput = new String[]{"left", "left", "up", "right", "left", "left", "up", "right", "down"};
        board = new int[]{3, 3};
        result = new int[]{0, 0};
        assertArrayEquals(day20.solution2(keyInput, board), result);

        keyInput = new String[]{"down", "down", "down", "down", "down"};
        board = new int[]{7, 9};
        result = new int[]{0, -4};
        assertArrayEquals(day20.solution2(keyInput, board), result);
    }

    @Test
    @DisplayName("최댓값 구하기 (2)")
    void solution3() {
        int[] numbers = {1, 2, -3, 4, -5};
        int result = 15;
        assertEquals(day20.solution3(numbers), result);

        numbers = new int[]{0, -31, 24, 10, 1, 9};
        result = 240;
        assertEquals(day20.solution3(numbers), result);

        numbers = new int[]{10, 20, 30, 5, 5, 20, 5};
        result = 600;
        assertEquals(day20.solution3(numbers), result);
    }

    @Test
    @DisplayName("다항식 더하기")
    void solution4() {
        String polynomial = "3x + 7 + x";
        String result = "4x + 7";
        assertEquals(day20.solution4(polynomial), result);

        polynomial = "x + x + x";
        result = "3x";
        assertEquals(day20.solution4(polynomial), result);

        polynomial = "0 + 2x + x";
        result = "3x";
        assertEquals(day20.solution4(polynomial), result);

        polynomial = "-7x + 7 + 7";
        result = "-7x + 14";
        assertEquals(day20.solution4(polynomial), result);

        polynomial = "x + 7 + 7";
        result = "x + 14";
        assertEquals(day20.solution4(polynomial), result);

        polynomial = "-7x + 6x + 7";
        result = "-x + 7";
        assertEquals(day20.solution4(polynomial), result);
    }
}