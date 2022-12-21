package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day24Test {

    Day24 day24 = new Day24();

    @Test
    @DisplayName("치킨쿠폰")
    void solution1() {
        int chicken = 100;
        int result = 11;
        assertEquals(day24.solution1(chicken), result);

        chicken = 1081;
        result = 120;
        assertEquals(day24.solution1(chicken), result);
    }

    @Test
    @DisplayName("이진수 더하기")
    void solution2() {
        String bin1 = "101";
        String bin2 = "1111";
        String result = "10100";
        assertEquals(day24.solution2(bin1, bin2), result);

        bin1 = "1001";
        bin2 = "1111";
        result = "11000";
        assertEquals(day24.solution2(bin1, bin2), result);

        bin1 = "10";
        bin2 = "11";
        result = "101";
        assertEquals(day24.solution2(bin1, bin2), result);
    }

    @Test
    @DisplayName("A로 B 만들기")
    void solution3() {
        String before = "olleh";
        String after = "hello";
        int result = 1;
        assertEquals(day24.solution3(before, after), result);

        before = "allpe";
        after = "apple";
        result = 0;
        assertEquals(day24.solution3(before, after), result);
    }

    @Test
    @DisplayName("k의 개수")
    void solution4() {
        int i = 1;
        int j = 13;
        int k = 1;
        int result = 6;
        assertEquals(day24.solution4(i, j, k), result);

        i = 10;
        j = 50;
        k = 5;
        result = 5;
        assertEquals(day24.solution4(i, j, k), result);

        i = 3;
        j = 10;
        k = 2;
        result = 0;
        assertEquals(day24.solution4(i, j, k), result);
    }
}