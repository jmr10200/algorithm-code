package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day15Test {

    Day15 day15 = new Day15();

    @Test
    @DisplayName("영어가 싫어요")
    void solution1() {
        String numbers = "onetwothreefourfivesixseveneightnine";
        long result = 123456789;
        assertEquals(day15.solution1(numbers), result);

        numbers = "onefourzerosixseven";
        result = 14067;
        assertEquals(day15.solution1(numbers), result);
    }

    @Test
    @DisplayName("인덱스 바꾸기")
    void solution2() {
        String myString = "hello";
        int num1 = 1;
        int num2 = 2;
        String result = "hlelo";
        assertEquals(day15.solution2(myString, num1, num2), result);

        myString = "I love you";
        num1 = 3;
        num2 = 6;
        result = "I l veoyou";
        assertEquals(day15.solution2(myString, num1, num2), result);
    }

    @Test
    @DisplayName("한 번만 등장한 문자")
    void solution3() {
        String s = "abcabcadc";
        String result = "d";
        assertEquals(day15.solution3(s), result);

        s = "abdc";
        result = "abcd";
        assertEquals(day15.solution3(s), result);

        s = "hello";
        result = "eho";
        assertEquals(day15.solution3(s), result);
    }

    @Test
    @DisplayName("약수구하기")
    void solution4() {
        int n = 24;
        int[] result = {1, 2, 3, 4, 6, 8, 12, 24};
        assertArrayEquals(day15.solution4(n), result);

        n = 29;
        result = new int[]{1, 29};
        assertArrayEquals(day15.solution4(n), result);
    }
}