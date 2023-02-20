package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day02Test {

    Level2Day02 day02 = new Level2Day02();

    @Test
    @DisplayName("이진 변환 반복하기")
    void solution1() {
        String s = "110010101001";
        int[] result = {3, 8};
        assertArrayEquals(day02.solution1(s), result);

        s = "01110";
        result = new int[]{3, 3};
        assertArrayEquals(day02.solution1(s), result);

        s = "1111111";
        result = new int[]{4, 1};
        assertArrayEquals(day02.solution1(s), result);
    }

    @Test
    @DisplayName("숫자의 표현")
    void solution2() {
        int n = 15;
        int result = 4;
        assertEquals(day02.solution2(n), result);
    }

    @Test
    @DisplayName("피보나치 수")
    void solution3() {
        int n = 3;
        int result = 2;
        assertEquals(day02.solution3(n), result);

        n = 5;
        result = 5;
        assertEquals(day02.solution3(n), result);
    }

    @Test
    @DisplayName("다음 큰 숫자")
    void solution4() {
        int n = 78;
        int result = 83;
        assertEquals(day02.solution4(n), result);

        n = 15;
        result = 23;
        assertEquals(day02.solution4(n), result);
    }

}