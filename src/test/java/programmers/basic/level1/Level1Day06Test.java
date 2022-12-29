package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day06Test {

    Level1Day06 day06 = new Level1Day06();

    @Test
    @DisplayName("수박수박수박수박수박수?")
    void solution1() {
        int n = 3;
        String result = "수박수";
        assertEquals(day06.solution1(n), result);

        n = 4;
        result = "수박수박";
        assertEquals(day06.solution1(n), result);
    }

    @Test
    @DisplayName("내적")
    void solution2() {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int result = 3;
        assertEquals(day06.solution2(a, b), result);

        a = new int[]{-1, 0, 1};
        b = new int[]{1, 0, -1};
        result = -2;
        assertEquals(day06.solution2(a, b), result);
    }

    @Test
    @DisplayName("문자열 내림차순으로 배치하기")
    void solution3() {
        String s = "Zbcdefg";
        String result = "gfedcbZ";
        assertEquals(day06.solution3(s), result);
    }

    @Test
    @DisplayName("약수의 개수와 덧셈")
    void solution4() {
        int left = 13;
        int right = 17;
        int result = 43;
        assertEquals(day06.solution4(left, right), result);

        left = 24;
        right = 27;
        result = 52;
        assertEquals(day06.solution4(left, right), result);
    }
}