package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day11Test {

    Level1Day11 day11 = new Level1Day11();

    @Test
    @DisplayName("두 개 뽑아서 더하기")
    void solution1() {
        int[] numbers = {2, 1, 3, 4, 1};
        int[] result = {2, 3, 4, 5, 6, 7};
        assertArrayEquals(day11.solution1(numbers), result);

        numbers = new int[]{5, 0, 2, 7};
        result = new int[]{2, 5, 7, 9, 12};
        assertArrayEquals(day11.solution1(numbers), result);
    }

    @Test
    @DisplayName("2016년")
    void solution2() {
        int a = 5;
        int b = 24;
        String result = "TUE";
        assertEquals(day11.solution2(a, b), result);
    }

    @Test
    @DisplayName("폰켓몬")
    void solution3() {
        int[] nums = {3, 1, 2, 3};
        int result = 2;
        assertEquals(day11.solution3(nums), result);

        nums = new int[]{3, 3, 3, 2, 2, 4};
        result = 3;
        assertEquals(day11.solution3(nums), result);

        nums = new int[]{3, 3, 3, 2, 2, 2};
        result = 2;
        assertEquals(day11.solution3(nums), result);
    }

    @Test
    @DisplayName("소수 찾기")
    void solution4() {
        int n = 10;
        int result = 4; // 2,3,5,7
        assertEquals(day11.solution4(n), result);

        n = 5;
        result = 3;
        assertEquals(day11.solution4(n), result);
    }
}