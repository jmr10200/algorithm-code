package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day12Test {

    Day12 day12 = new Day12();

    @Test
    @DisplayName("모음제거 - split()")
    void solution1_1() {
        String myString = "bus";
        String result = "bs";
        assertEquals(day12.solution1_1(myString), result);

        myString = "nice to meet you";
        result = "nc t mt y";
        assertEquals(day12.solution1_1(myString), result);
    }

    @Test
    @DisplayName("모음제거 - replace(), replaceAll()")
    void solution1_2() {
        String myString = "bus";
        String result = "bs";
        assertEquals(day12.solution1_2(myString), result);

        myString = "nice to meet you";
        result = "nc t mt y";
        assertEquals(day12.solution1_2(myString), result);
    }

    @Test
    @DisplayName("문자열 정렬하기 (1)")
    void solution2() {
        String myString = "hi12392";
        int[] result = {1, 2, 2, 3, 9};
        assertArrayEquals(day12.solution2(myString), result);

        myString = "p2o4i8gj2";
        result = new int[]{2, 2, 4, 8};
        assertArrayEquals(day12.solution2(myString), result);

        myString = "abcde0";
        result = new int[]{0};
        assertArrayEquals(day12.solution2(myString), result);
    }

    @Test
    @DisplayName("숨어있는 숫자의 덧셈 (1) : regex = [a-z|[A-Z]")
    void solution3() {
        String myString = "aAb1B2cC34oOp";
        int result = 10;
        assertEquals(day12.solution3(myString), result);

        myString = "1a2b3c4d123";
        result = 16;
        assertEquals(day12.solution3(myString), result);
    }

    @Test
    @DisplayName("소인수분해")
    void solution4() {
        int n = 12;
        int[] result = {2, 3};
        assertArrayEquals(day12.solution4(n), result);

        n = 17;
        result = new int[]{17};
        assertArrayEquals(day12.solution4(n), result);

        n = 420;
        result = new int[]{2, 3, 5, 7};
        assertArrayEquals(day12.solution4(n), result);
    }
}