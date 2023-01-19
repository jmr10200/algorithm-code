package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day15Test {

    Level1Day15 day15 = new Level1Day15();

    @Test
    @DisplayName("명예의 전당 (1)")
    void solution1() {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] result = {10, 10, 10, 20, 20, 100, 100};
        assertArrayEquals(day15.solution1(k, score), result);

        k = 4;
        score = new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        result = new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300};
        assertArrayEquals(day15.solution1(k, score), result);
    }

    @Test
    @DisplayName("숫자 짝꿍")
    void solution2() {
        String x = "100";
        String y = "2345";
        String result = "-1";
        assertEquals(day15.solution2(x, y), result);

        x = "100";
        y = "203045";
        result = "0";
        assertEquals(day15.solution2(x, y), result);

        x = "100";
        y = "123450";
        result = "10";
        assertEquals(day15.solution2(x, y), result);

        x = "12321";
        y = "42531";
        result = "321";
        assertEquals(day15.solution2(x, y), result);

        x = "5525";
        y = "1255";
        result = "552";
        assertEquals(day15.solution2(x, y), result);
    }

    @Test
    @DisplayName("키패드 누르기")
    void solution3() {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String result = "LRLLLRLLRRL";
        assertEquals(day15.solution3(numbers, hand), result);

        numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        hand = "left";
        result = "LRLLRRLLLRR";
        assertEquals(day15.solution3(numbers, hand), result);

        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        hand = "right";
        result = "LLRLLRLLRL";
        assertEquals(day15.solution3(numbers, hand), result);
    }

    @Test
    @DisplayName("크레인 인형 뽑기 게임")
    void solution4() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int result = 4;
        assertEquals(day15.solution4(board, moves), result);
    }
}