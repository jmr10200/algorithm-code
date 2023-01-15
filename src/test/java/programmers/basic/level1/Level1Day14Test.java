package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day14Test {

    Level1Day14 day14 = new Level1Day14();

    @Test
    @DisplayName("가장 가까운 같은 글자")
    void solution1() {
        String s = "banana";
        int[] result = {-1, -1, -1, 2, 2, 2};
        assertArrayEquals(day14.solution1(s), result);

        s = "foobar";
        result = new int[]{-1, -1, 1, -1, -1, -1};
        assertArrayEquals(day14.solution1(s), result);
    }

    @Test
    @DisplayName("체육복")
    void solution2() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int result = 5;
        assertEquals(day14.solution2(n, lost, reserve), result);

        n = 5;
        lost = new int[]{2, 4};
        reserve = new int[]{3};
        result = 4;
        assertEquals(day14.solution2(n, lost, reserve), result);

        n = 3;
        lost = new int[]{3};
        reserve = new int[]{1};
        result = 2;
        assertEquals(day14.solution2(n, lost, reserve), result);

        n = 7;
        lost = new int[]{2, 4, 7};
        reserve= new int[]{1, 3, 5};
        result = 6;
        assertEquals(day14.solution2(n, lost, reserve), result);

        // 여벌 체육복을 가진 학생이 도난당한경우
        n = 4;
        lost = new int[]{2, 3};
        reserve = new int[]{3, 4};
        result = 3;
        assertEquals(day14.solution2(n, lost, reserve), result);

    }

    @Test
    @DisplayName("완주하지 못한 선수")
    void solution3() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String result = "leo";
        assertEquals(day14.solution3(participant, completion), result);

        participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        completion = new String[]{"josipa", "filipa", "marina", "nikola"};
        result = "vinko";
        assertEquals(day14.solution3(participant, completion), result);

        participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        completion = new String[]{"stanko", "ana", "mislav"};
        result = "mislav";
        assertEquals(day14.solution3(participant, completion), result);
    }

    @Test
    @DisplayName("과일 장수")
    void solution4_1() {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int result = 8;
        assertEquals(day14.solution4_1(k, m, score), result);

        k = 4;
        m = 3;
        score = new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        result = 33;
        assertEquals(day14.solution4_1(k, m, score), result);
    }

    @Test
    @DisplayName("과일 장수")
    void solution4_2() {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int result = 8;
        assertEquals(day14.solution4_2(k, m, score), result);

        k = 4;
        m = 3;
        score = new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        result = 33;
        assertEquals(day14.solution4_2(k, m, score), result);
    }
}
