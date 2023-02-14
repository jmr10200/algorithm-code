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

}