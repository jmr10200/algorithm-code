package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day09Test {

    Level1Day09 day09 = new Level1Day09();

    @Test
    @DisplayName("예산")
    void solution1() {
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        int result = 3;
        assertEquals(day09.solution1(d, budget), result);

        d = new int[]{2, 2, 3, 3};
        budget = 10;
        result = 4;
        assertEquals(day09.solution1(d, budget), result);

    }

    @Test
    @DisplayName("시저 암호")
    void solution2() {
        String s = "AB";
        int n = 1;
        String result = "BC";
        assertEquals(day09.solution2(s, n), result);

        s = "z";
        n = 1;
        result = "a";
        assertEquals(day09.solution2(s, n), result);

        s = "a B z";
        n = 4;
        result = "e F d";
        assertEquals(day09.solution2(s, n), result);
    }

    @Test
    @DisplayName("최소직사각형")
    void solution3() {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = 4000;
        assertEquals(day09.solution3(sizes), result);

        sizes = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        result = 120;
        assertEquals(day09.solution3(sizes), result);

        sizes = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        result = 133;
        assertEquals(day09.solution3(sizes), result);
    }

    @Test
    @DisplayName("[1차] 비밀지도")
    void solution4() {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = {"#####", "# # #", "### #", "#  ##", "#####"};
        assertArrayEquals(day09.solution4(n, arr1, arr2), result);

        n = 6;
        arr1 = new int[]{46, 33, 33, 22, 31, 50};
        arr2 = new int[]{27, 56, 19, 14, 14, 10};
        result = new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        assertArrayEquals(day09.solution4(n, arr1, arr2), result);
    }
}