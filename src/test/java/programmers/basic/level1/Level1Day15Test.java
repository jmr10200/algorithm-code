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

}