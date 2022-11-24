package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day07Test {

    Day07 day07 = new Day07();

    @Test
    @DisplayName("특정 문자 제거하기")
    void solution1() {
        String myString = "abcdef";
        String letter = "f";
        String result = "abcde";
        assertEquals(day07.solution1(myString, letter), result);

        myString = "BCBdbe";
        letter = "B";
        result = "Cdbe";
        assertEquals(day07.solution1(myString, letter), result);

        myString = "abcDDstringDdr";
        letter = "D";
        result = "abcstringdr";
        assertEquals(day07.solution1(myString, letter), result);

    }

    @Test
    @DisplayName("각도기")
    void solution2() {
        int angle = 70;
        int result = 1;
        assertEquals(day07.solution2(angle), result);

        angle = 91;
        result = 3;
        assertEquals(day07.solution2(angle), result);

        angle = 180;
        result = 4;
        assertEquals(day07.solution2(angle), result);
    }

    @Test
    @DisplayName("양꼬치")
    void solution3() {
        int n = 10;
        int k = 3;
        int result = 124000;
        assertEquals(day07.solution3(n, k), result);

        n = 64;
        k = 6;
        result = 768000;
        assertEquals(day07.solution3(n, k), result);
    }

    @Test
    @DisplayName("짝수의 합")
    void solution4() {
        int n = 10;
        int result = 30;
        assertEquals(day07.solution4(n), result);

        n = 4;
        result = 6;
        assertEquals(day07.solution4(n), result);
    }
}