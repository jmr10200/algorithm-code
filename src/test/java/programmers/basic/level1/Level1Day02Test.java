package programmers.basic.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day02Test {

    Level1Day02 day02 = new Level1Day02();

    @Test
    @DisplayName("자연수 뒤집어 배열로 만들기")
    void solution1() {
        long n = 12345;
        int[] result = {5, 4, 3, 2, 1};
        assertArrayEquals(day02.solution1(n), result);

        n = 453267923;
        result = new int[]{3, 2, 9, 7, 6, 2, 3, 5, 4};
        assertArrayEquals(day02.solution1(n), result);
    }

    @Test
    @DisplayName("정수 제곱근 판별")
    void solution2() {
        long n = 121;
        long result = 144;
        assertEquals(day02.solution2(n), result);

        n = 3;
        result = -1;
        assertEquals(day02.solution2(n), result);
    }

    @Test
    @DisplayName("문자열 내 p와 y의 개수")
    void solution3() {
        String s = "pPoooyY";
        boolean result = true;
        assertEquals(day02.solution3(s), result);

        s = "Pyy";
        result = false;
        assertEquals(day02.solution3(s), result);
    }

    @Test
    @DisplayName("x만큼 간격이 있는 n개의 숫자")
    void solution4() {
        int x = 2;
        int n = 5;
        long[] result = {2, 4, 6, 8, 10};
        assertArrayEquals(day02.solution4(x, n), result);

        x = 4;
        n = 3;
        result = new long[]{4, 8, 12};
        assertArrayEquals(day02.solution4(x, n), result);

        x = -4;
        n = 2;
        result = new long[]{-4, -8};
        assertArrayEquals(day02.solution4(x, n), result);
    }

    @Test
    @DisplayName("문자열을 정수로 바꾸기")
    void solution5() {
        String str = "1234";
        int result = 1234;
        assertEquals(day02.solution5(str), result);

        str = "-1234";
        result = -1234;
        assertEquals(day02.solution5(str), result);
    }
}