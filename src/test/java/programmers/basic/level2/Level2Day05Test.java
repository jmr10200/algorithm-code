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
    @DisplayName("캐시")
    void solution3() {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int resultTime = 50;
        assertEquals(day05.solution3(cacheSize, cities), resultTime);

        cacheSize = 3;
        cities = new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        resultTime = 21;
        assertEquals(day05.solution3(cacheSize, cities), resultTime);

        cacheSize = 2;
        cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        resultTime = 60;
        assertEquals(day05.solution3(cacheSize, cities), resultTime);

        cacheSize = 5;
        cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        resultTime = 52;
        assertEquals(day05.solution3(cacheSize, cities), resultTime);

        cacheSize = 2;
        cities = new String[]{"Jeju", "Pangyo", "NewYork", "newyork"};
        resultTime = 16;
        assertEquals(day05.solution3(cacheSize, cities), resultTime);

        cacheSize = 0;
        cities = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        resultTime = 25;
        assertEquals(day05.solution3(cacheSize, cities), resultTime);
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