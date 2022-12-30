package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day07Test {

    Level1Day07 day07 = new Level1Day07();

    @Test
    @DisplayName("문자열 다루기 기본")
    void solution1() {
        String s = "a234";
        boolean result = false;
        assertEquals(day07.solution1(s), result);

        s = "1234";
        result = true;
        assertEquals(day07.solution1(s), result);
    }

    @Test
    @DisplayName("부족한 금액 계산하기")
    void solution2() {
        int price = 3;
        int money = 20;
        int count = 4;
        long result = 10;
        assertEquals(day07.solution2(price, money, count), result);
    }

    @Test
    @DisplayName("행렬의 덧셈")
    void solution3() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] result = {{4, 6}, {7, 9}};
        assertArrayEquals(day07.solution3(arr1, arr2), result);

        arr1 = new int[][]{{1}, {2}};
        arr2 = new int[][]{{3}, {4}};
        result = new int[][]{{4}, {6}};
        assertArrayEquals(day07.solution3(arr1, arr2), result);
    }

    @Test
    @DisplayName("직사각형 별찍기")
    void main() {
        int n = 5;
        int m = 3;
        String result = "*****\n*****\n*****\n";
        assertEquals(day07.solution4(n, m), result);
    }
}