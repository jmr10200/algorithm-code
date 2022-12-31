package programmers.basic.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day08Test {

    Level1Day08 day08 = new Level1Day08();

    @Test
    @DisplayName("최대공약수와 최소공배수")
    void solution1() {
        int n = 3;
        int m = 12;
        int[] result = {3, 12};
        assertArrayEquals(day08.solution1(n, m), result);

        n = 2;
        m = 5;
        result = new int[]{1, 10};
        assertArrayEquals(day08.solution1(n, m), result);
    }

    @Test
    @DisplayName("같은 숫자는 싫어")
    void solution2() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = {1, 3, 0, 1};
        assertArrayEquals(day08.solution2(arr), result);

        arr = new int[]{4, 4, 4, 3, 3};
        result = new int[]{4, 3};
        assertArrayEquals(day08.solution2(arr), result);
    }

    @Test
    @DisplayName("이상한 문자 만들기")
    void solution3() {
        String s = "try hello world";
        String result = "TrY HeLlO WoRlD";
        assertEquals(day08.solution3(s), result);

//        s = "try  hello world   ABc";
//        result = "TrY  HeLlO WoRlD   AbC";
//        assertEquals(day08.solution3(s), result);
//
//        s = "   try  hello world   ABc ";
//        result = "   TrY  HeLlO WoRlD   AbC ";
//        assertEquals(day08.solution3(s), result);

        s = "   try  hello world   ABc   ";
        result = "   TrY  HeLlO WoRlD   AbC   ";
        assertEquals(day08.solution3(s), result);
    }

    @Test
    @DisplayName("3진법 뒤집기")
    void solution4() {
        int n = 45;
        int result = 7;
        assertEquals(day08.solution4(n), result);

        n = 125;
        result = 229;
        assertEquals(day08.solution4(n), result);
    }

}