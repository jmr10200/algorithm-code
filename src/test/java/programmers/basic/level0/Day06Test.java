package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day06Test {

    Day06 day06 = new Day06();

    @Test
    @DisplayName("문자열 뒤집기")
    void solution1_1() {
        String my_string = "jaron";
        String result = "noraj";
        assertEquals(day06.solution1_1(my_string), result);

        my_string = "bread";
        result = "daerb";
        assertEquals(day06.solution1_1(my_string), result);

        my_string = "abcdWorldCup";
        result = "puCdlroWdcba";
        assertEquals(day06.solution1_1(my_string), result);
    }

    @Test
    @DisplayName("문자열 뒤집기 : StringBuilder 이용")
    void solution1_2() {
        String my_string = "jaron";
        String result = "noraj";
        assertEquals(day06.solution1_2(my_string), result);

        my_string = "bread";
        result = "daerb";
        assertEquals(day06.solution1_2(my_string), result);

        my_string = "abcdWorldCup";
        result = "puCdlroWdcba";
        assertEquals(day06.solution1_2(my_string), result);
    }

    @Test
    @DisplayName("직각삼각형 출력하기")
    void solution2() {
        // 출력확인
        int num = 3;
        // *
        // **
        // ***
        day06.solution2(num);
    }

    @Test
    @DisplayName("{짝수, 홀수} 개수")
    void solution3() {
        int[] numList = {1, 2, 3, 4, 5};
        int[] result = {2, 3}; // {짝수, 홀수}
        assertArrayEquals(day06.solution3(numList), result);

        numList = new int[]{1, 3, 5, 7};
        result = new int[]{0, 4};
        assertArrayEquals(day06.solution3(numList), result);
    }

    @Test
    @DisplayName("문자 반복 출력하기")
    void solution4() {
        String myString = "hello";
        int num = 3;
        String result = "hhheeellllllooo";
        assertEquals(day06.solution4(myString, num), result);

    }
}