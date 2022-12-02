package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day16Test {

    Day16 day16 = new Day16();

    @Test
    @DisplayName("편지")
    void solution1() {
        String message = "happy birthday!";
        int result = 30;
        assertEquals(day16.solution1(message), result);

        message = "I love you~";
        result = 22;
        assertEquals(day16.solution1(message), result);
    }

    @Test
    @DisplayName("가장 큰 수 찾기")
    void solution2() {
        int[] array = {1, 8, 3};
        int[] result = {8, 1};
        assertArrayEquals(day16.solution2(array), result);

        array = new int[]{9, 10, 11, 8};
        result = new int[]{11, 2};
        assertArrayEquals(day16.solution2(array), result);

        array = new int[]{9};
        result = new int[]{9, 0};
        assertArrayEquals(day16.solution2(array), result);
    }

    @Test
    @DisplayName("문자열 계산하기")
    void solution3() {
        String myString = "3 + 4"; // 조건 +, - 만 존재
        int result = 7;
        assertEquals(day16.solution3(myString), result);

        myString = "10 - 7";
        result = 3;
        assertEquals(day16.solution3(myString), result);
    }

    @Test
    @DisplayName("배열의 유사도")
    void solution4() {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        int result = 2;
        assertEquals(day16.solution4(s1, s2),result);

        s1 = new String[]{"n", "omg"};
        s2 = new String[]{"m", "dot"};
        result = 0;
        assertEquals(day16.solution4(s1, s2),result);
    }
}