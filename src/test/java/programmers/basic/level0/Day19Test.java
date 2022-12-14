package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day19Test {

    Day19 day19 = new Day19();

    @Test
    @DisplayName("7의 개수")
    void solution1() {
        int[] array = {7, 77, 17};
        int result = 4;
        assertEquals(day19.solution1(array), result);

        array = new int[]{10, 29};
        result = 0;
        assertEquals(day19.solution1(array), result);
    }

    @Test
    @DisplayName("잘라서 배열로 저장하기")
    void solution2() {
        String myString = "abc1Addfggg4556b";
        int n = 6;
        String[] result = {"abc1Ad", "dfggg4", "556b"};
        assertArrayEquals(day19.solution2(myString, n), result);

        myString = "abcdef123";
        n = 3;
        result = new String[]{"abc", "def", "123"};
        assertArrayEquals(day19.solution2(myString, n), result);
    }

    @Test
    @DisplayName("중복된 숫자 개수")
    void solution3() {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int result = 2;
        assertEquals(day19.solution3(array, n), result);

        array = new int[]{0, 2, 3, 4};
        n = 1;
        result = 0;
        assertEquals(day19.solution3(array, n), result);
    }

    @Test
    @DisplayName("머쓱이보다 키 큰 사람")
    void solution4() {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        int result = 3;
        assertEquals(day19.solution4(array, height), result);

        array = new int[]{180, 120, 140};
        height = 190;
        result = 0;
        assertEquals(day19.solution4(array, height), result);
    }
}