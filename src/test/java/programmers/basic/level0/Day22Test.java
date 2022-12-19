package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day22Test {

    Day22 day22 = new Day22();

    @Test
    @DisplayName("저주의 숫자 3")
    void solution1() {
        int n = 15;
        int result = 25;
        assertEquals(day22.solution1(n), result);

        n = 40;
        result = 76;
        assertEquals(day22.solution1(n), result);
    }

    @Test
    @DisplayName("평행")
    void solution2() {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int result = 1;
        assertEquals(day22.solution2(dots), result);

        dots = new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        result = 0;
        assertEquals(day22.solution2(dots), result);
    }

    @Test
    @DisplayName("겹치는 선분의 길이")
    void solution3() {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int result = 2;
        assertEquals(day22.solution3(lines), result);

        lines = new int[][]{{-10, -6}, {-8, -3}, {-5, -2}};
        result = 4;
        assertEquals(day22.solution3(lines), result);

        lines = new int[][]{{0, 2}, {-3, -1}, {-2, 1}};
        result = 2;
        assertEquals(day22.solution3(lines), result);

        lines = new int[][]{{-1, 1}, {1, 3}, {3, 9}};
        result = 0;
        assertEquals(day22.solution3(lines), result);

        lines = new int[][]{{0, 5}, {3, 9}, {1, 10}};
        result = 8;
        assertEquals(day22.solution3(lines), result);

        lines = new int[][]{{-2, 2}, {-2, 2}, {-2, 2}};
        result = 4;
        assertEquals(day22.solution3(lines), result);

        lines = new int[][]{{-3, -1}, {-2, 1}, {3, 5}};
        result = 1;
        assertEquals(day22.solution3(lines), result);

        lines = new int[][]{{-2, -1}, {-2, -1}, {0, 1}};
        result = 1;
        assertEquals(day22.solution3(lines), result);
    }

    @Test
    @DisplayName("유한소수 판별하기")
    void solution4() {
        int a = 7;
        int b = 20;
        int result = 1;
        assertEquals(day22.solution4(a, b), result);

        a = 11;
        b = 22;
        result = 1;
        assertEquals(day22.solution4(a, b), result);

        a = 12;
        b = 21;
        result = 2;
        assertEquals(day22.solution4(a, b), result);

        a = 3500;
        b = 500;
        result = 1;
        assertEquals(day22.solution4(a, b), result);
    }
}