package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day11Test {

    Day11 day11 = new Day11();

    @Test
    @DisplayName("주사위의 개수")
    void solution1() {
        int[] box = {1, 1, 1};
        int n = 1;
        int result = 1;
        assertEquals(day11.solution1(box, n), result);

        box = new int[]{10, 8, 6};
        n = 3;
        result = 12;
        assertEquals(day11.solution1(box, n), result);
    }

    @Test
    @DisplayName("합성수 찾기")
    void solution2() {
        int n = 10;
        int result = 5;
        assertEquals(day11.solution2(n), result);

        n = 15;
        result = 8;
        assertEquals(day11.solution2(n), result);
    }

    @Test
    @DisplayName("최댓값 만들기(1)")
    void solution3() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = 20;
        assertEquals(day11.solution3(numbers), result);

        numbers = new int[]{0, 31, 24, 10, 1, 9};
        result = 744;
        assertEquals(day11.solution3(numbers), result);
    }

    @Test
    @DisplayName("팩토리얼")
    void solution4() {
        int n = 3628800;
        int result = 10;
        assertEquals(day11.solution4(n), result);

        n = 7;
        result = 3;
        assertEquals(day11.solution4(n), result);
    }
}