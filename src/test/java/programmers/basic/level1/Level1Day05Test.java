package programmers.basic.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day05Test {

    Level1Day05 day05 = new Level1Day05();

    @Test
    @DisplayName("제일 작은 수 제거하기")
    void solution1() {
        int[] arr = {4, 3, 2, 1};
        int[] result = {4, 3, 2};
        assertArrayEquals(day05.solution1(arr), result);

        arr = new int[]{10};
        result = new int[]{-1};
        assertArrayEquals(day05.solution1(arr), result);
    }

    @Test
    @DisplayName("음양 더하기")
    void solution2() {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int result = 9;
        assertEquals(day05.solution2(absolutes, signs), result);

        absolutes = new int[]{1, 2, 3};
        signs = new boolean[]{false, false, true};
        result = 0;
        assertEquals(day05.solution2(absolutes, signs), result);
    }

    @Test
    @DisplayName("없는 숫자 더하기")
    void solution3() {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int result = 14;
        assertEquals(day05.solution3(numbers), result);

        numbers = new int[]{5, 8, 4, 0, 6, 7, 9};
        result = 6;
        assertEquals(day05.solution3(numbers), result);
    }

    @Test
    @DisplayName("가운데 글자 가져오기")
    void solution4() {
        String s = "abcde";
        String result = "c";
        assertEquals(day05.solution4(s), result);

        s = "qwer";
        result = "we";
        assertEquals(day05.solution4(s), result);
    }

}