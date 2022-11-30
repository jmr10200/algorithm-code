package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day13Test {

    Day13 day13 = new Day13();

    @Test
    @DisplayName("컨트롤 제트")
    void solution1() {
        String s = "1 2 Z 3";
        int result = 4;
        assertEquals(day13.solution1(s), result);

        s = "10 20 30 40";
        result = 100;
        assertEquals(day13.solution1(s), result);

        s = "10 Z 20 Z 1";
        result = 1;
        assertEquals(day13.solution1(s), result);

        s = "Z 2 Z Z 2 4";
        result = 6;
        assertEquals(day13.solution1(s), result);

        s = "1 1 1 1 Z Z 1 1 Z Z Z Z Z Z 1";
        result = 1;
        assertEquals(day13.solution1(s), result);
    }

    @Test
    @DisplayName("배열 원소의 길이")
    void solution2() {
        String[] strList = {"We", "are", "the", "world!"};
        int[] result = {2, 3, 3, 6};
        assertArrayEquals(day13.solution2(strList), result);

        strList = new String[]{"I", "Love", "Programmers."};
        result = new int[]{1, 4, 12};
        assertArrayEquals(day13.solution2(strList), result);
    }

    @Test
    @DisplayName("중복된 문자 제거")
    void solution3() {
        String myString = "people";
        String result = "peol";
        assertEquals(day13.solution3(myString), result);

        myString = "We are the world";
        result = "We arthwold";
        assertEquals(day13.solution3(myString), result);
    }

    @Test
    @DisplayName("삼각형의 완성조건")
    void solution4() {
        int[] sides = {1, 2, 3};
        int result = 2;
        assertEquals(day13.solution4(sides), result);

        sides = new int[]{3, 6, 2};
        result = 2;
        assertEquals(day13.solution4(sides), result);

        sides = new int[]{199, 72, 222};
        result = 1;
        assertEquals(day13.solution4(sides), result);
    }
}