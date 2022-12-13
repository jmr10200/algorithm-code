package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day18Test {

    Day18 day18 = new Day18();

    @Test
    @DisplayName("문자열 안에 문자열")
    void solution1() {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int result = 1;
        assertEquals(day18.solution1(str1, str2), result);

        str1 = "ppprrrogrammers";
        str2 = "pppp";
        result = 2;
        assertEquals(day18.solution1(str1, str2), result);
    }

    @Test
    @DisplayName("제곱수 판별하기")
    void solution2() {
        int n = 144;
        int result = 1;
        assertEquals(day18.solution2(n), result);

        n = 976;
        result = 2;
        assertEquals(day18.solution2(n), result);
    }

    @Test
    @DisplayName("세균 증식")
    void solution3() {
        int n = 2;
        int t = 10;
        int result = 2048;
        assertEquals(day18.solution3(n, t), result);

        n = 7;
        t = 15;
        result = 229376;
        assertEquals(day18.solution3(n, t), result);
    }

    @Test
    @DisplayName("문자열 정렬하기 (2)")
    void solution4() {
        String myString = "Bcad";
        String result = "abcd";
        assertEquals(day18.solution4(myString), result);

        myString = "heLLo";
        result = "ehllo";
        assertEquals(day18.solution4(myString), result);

        myString = "Python";
        result = "hnopty";
        assertEquals(day18.solution4(myString), result);
    }
}