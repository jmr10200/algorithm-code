package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day01Test {

    Level2Day01 day01 = new Level2Day01();

    @Test
    @DisplayName("최댓값과 최솟값")
    void solution1() {
        String s = "1 2 3 4";
        String result = "1 4";
        assertEquals(day01.solution1(s), result);

        s = "-1 -2 -3 -4";
        result = "-4 -1";
        assertEquals(day01.solution1(s), result);

        s = "-1 -1";
        result = "-1 -1";
        assertEquals(day01.solution1(s), result);
    }

    @Test
    @DisplayName("JadenCase 문자열 만들기")
    void solution2() {
        String s = "3people unFollowed me";
        String result = "3people Unfollowed Me";
        assertEquals(day01.solution2(s), result);

        s = "for the last week";
        result = "For The Last Week";
        assertEquals(day01.solution2(s), result);

        s = "for  the   last week";
        result = "For  The   Last Week";
        assertEquals(day01.solution2(s), result);

        s = " for  the   last week";
        result = " For  The   Last Week";
        assertEquals(day01.solution2(s), result);

        s = "  for  the   last week";
        result = "  For  The   Last Week";
        assertEquals(day01.solution2(s), result);

        s = "for  the   last week ";
        result = "For  The   Last Week ";
        assertEquals(day01.solution2(s), result);

        s = "for  the   last week  ";
        result = "For  The   Last Week  ";
        assertEquals(day01.solution2(s), result);
    }

    @Test
    @DisplayName("최솟값 만들기")
    void solution3() {
        int[] a = {1, 4, 2}; // 1*5, 2*4, 1*5
        int[] b = {5, 4, 4}; // 4*4 , 4*2, 5*1
        int result = 29;
        assertEquals(day01.solution3(a, b), result);

        a = new int[]{1, 2};
        b = new int[]{3, 4};
        result = 10;
        assertEquals(day01.solution3(a, b), result);
    }

    @Test
    @DisplayName("올바른 괄호")
    void solution4() {
        String s = "()()";
        boolean result = true;
//        assertEquals(day01.solution4(s), result);
        assertTrue(day01.solution4(s));

        s = "(())()";
        result = true;
        assertTrue(day01.solution4(s));

        s = ")()(";
        result = false;
        assertFalse(day01.solution4(s));

        s = "(()(";
        result = false;
        assertFalse(day01.solution4(s));

        s = "()(";
        result = false;
        assertFalse(day01.solution4(s));

        s = "((())()";
        result = false;
        assertFalse(day01.solution4(s));

        s = "())(";
        result = false;
        assertFalse(day01.solution4(s));

        s = "(())((";
        result = false;
        assertFalse(day01.solution4(s));
    }
}