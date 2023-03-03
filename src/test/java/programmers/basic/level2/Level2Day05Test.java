package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day05Test {

    Level2Day05 day05 = new Level2Day05();

    @Test
    @DisplayName("H-Index")
    void solution1() {
        int[] citations = {3, 0, 6, 1, 5};
        int result = 3;
        assertEquals(day05.solution1(citations), result);

        citations = new int[]{10, 8, 5, 4, 3};
        result = 4;
        assertEquals(day05.solution1(citations), result);

        citations = new int[]{25, 8, 5, 3, 3};
        result = 3;
        assertEquals(day05.solution1(citations), result);

        citations = new int[]{6, 5, 5, 5, 3, 2, 1, 0};
        result = 4;
        assertEquals(day05.solution1(citations), result);
    }

    @Test
    @DisplayName("괄호 회전하기")
    void solution2() {
        String s = "[](){}";
        int result = 3;
        assertEquals(day05.solution2(s), result);

        s = "}]()[{";
        result = 2;
        assertEquals(day05.solution2(s), result);

        s = "[)(]";
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "}}}";
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "[{((}]";
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "}{{}"; //}{{}, {{}}, {}}{, }}{{
        result = 1;
        assertEquals(day05.solution2(s), result);

        s = "()(";
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "((())()";
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "())(";// ())(, ))((, )((), (())
        result = 1;
        assertEquals(day05.solution2(s), result);

        s = "(())(("; // (())(( , ())(((, ))((((, )((((, (((()
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "((((";
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "{))("; //{))(, ))({, )({), ({))
        result = 0;
        assertEquals(day05.solution2(s), result);

        s = "({)}";
        result = 0;
        assertEquals(day05.solution2(s), result);
    }



    @Test
    @DisplayName("귤 고르기")
    void solution4() {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int result = 3;
        assertEquals(day05.solution4(k, tangerine), result);

        k = 4;
        tangerine = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        result = 2;
        assertEquals(day05.solution4(k, tangerine), result);

        k = 2;
        tangerine = new int[]{1, 1, 1, 1, 2, 2, 2, 3};
        result = 1;
        assertEquals(day05.solution4(k, tangerine), result);
    }
}