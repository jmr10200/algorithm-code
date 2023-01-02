package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day10Test {

    Level1Day10 day10 = new Level1Day10();

    @Test
    @DisplayName("삼총사")
    void solution1() {
        int[] number = {-2, 3, 0, 2, -5};
        int result = 2;
        assertEquals(day10.solution1(number), result);

        number = new int[]{-3, -2, -1, 0, 1, 2, 3};
        result = 5;
        assertEquals(day10.solution1(number), result);

        number = new int[]{-1, 1, -1, 1};
        result = 0;
        assertEquals(day10.solution1(number), result);
    }

    @Test
    @DisplayName("문자열 내 마음대로 정렬하기")
    void solution2() {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        String[] result = {"car", "bed", "sun"};
        assertArrayEquals(day10.solution2(strings, n), result);

        strings = new String[]{"abce", "abcd", "cdx"};
        n = 2;
        result = new String[]{"abcd", "abce", "cdx"};
        assertArrayEquals(day10.solution2(strings, n), result);
    }

    @Test
    @DisplayName("K번째수")
    void solution3() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = {5, 6, 3};
        assertArrayEquals(day10.solution3(array, commands), result);
    }

    @Test
    @DisplayName("숫자 문자열과 영단어")
    void solution4() {
        String str = "one4seveneight";
        int result = 1478;
        assertEquals(day10.solution4(str), result);

        str = "23four5six7";
        result = 234567;
        assertEquals(day10.solution4(str), result);

        str = "2three45sixseven";
        result = 234567;
        assertEquals(day10.solution4(str), result);

        str = "123";
        result = 123;
        assertEquals(day10.solution4(str), result);
    }
}