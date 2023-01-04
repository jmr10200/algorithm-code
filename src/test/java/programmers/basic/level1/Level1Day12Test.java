package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day12Test {

    Level1Day12 day12 = new Level1Day12();

    @Test
    @DisplayName("모의고사")
    void solution1() {
        int[] answers = {1, 2, 3, 4, 5};
        int[] result = {1};
        assertArrayEquals(day12.solution1(answers), result);

        answers = new int[]{1, 3, 2, 4, 2};
        result = new int[]{1, 2, 3};
        assertArrayEquals(day12.solution1(answers), result);
    }

    @Test
    @DisplayName("소수 만들기")
    void solution2() {
        int[] nums = {1, 2, 3, 4};
        int result = 1;
        assertEquals(day12.solution2(nums), result);

        nums = new int[]{1, 2, 7, 6, 4};
        result = 4;
        assertEquals(day12.solution2(nums), result);
    }

    @Test
    @DisplayName("콜라문제")
    void solution3() {
        int a = 2;
        int b = 1;
        int n = 20;
        int result = 19;
        assertEquals(day12.solution3(a, b, n), result);

        a = 3;
        b = 1;
        n = 20;
        result = 9;
        assertEquals(day12.solution3(a, b, n), result);
    }

    @Test
    @DisplayName("실패율")
    void solution4() {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = {3, 4, 2, 1, 5};
        assertArrayEquals(day12.solution4(n, stages), result);

        n = 4;
        stages = new int[]{4, 4, 4, 4, 4};
        result = new int[]{4, 1, 2, 3};
        assertArrayEquals(day12.solution4(n, stages), result);
    }
}