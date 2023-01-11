package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day13Test {

    Level1Day13 day13 = new Level1Day13();

    @Test
    @DisplayName("크기가 작은 부분 문자열")
    void solution1() {
        String t = "3141592";
        String p = "271";
        int result = 2;
        assertEquals(day13.solution1(t, p), result);

        t = "500220839878";
        p = "7";
        result = 8;
        assertEquals(day13.solution1(t, p), result);

        t = "10203";
        p = "15";
        result = 3;
        assertEquals(day13.solution1(t, p), result);

        t = "15";
        p = "15";
        result = 1;
        assertEquals(day13.solution1(t, p), result);
    }

    @Test
    @DisplayName("[1차] 다트게임")
    void solution2() {
        String dartResult = "1S2D*3T";
        int result = 37;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D2S#10S";
        result = 9;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D2S0T";
        result = 3;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1S*2T*3S";
        result = 23;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D#2S*3S";
        result = 5;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1T2D3D#";
        result = -4;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D2S3T*";
        result = 59;
        assertEquals(day13.solution2(dartResult), result);
    }

    @Test
    @DisplayName("푸드 파이트 대회")
    void solution3() {
        int[] food = {1, 3, 4, 6};
        String result = "1223330333221";
        assertEquals(day13.solution3(food), result);

        food = new int[]{1, 7, 1, 2};
        result = "111303111";
        assertEquals(day13.solution3(food), result);
    }

    @Test
    @DisplayName("로또의 최고 순위와 최저 순위")
    void solution4() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = {3, 5};
        assertArrayEquals(day13.solution4(lottos, win_nums), result);

        lottos = new int[]{0, 0, 0, 0, 0, 0};
        win_nums = new int[]{38, 19, 20, 40, 15, 25};
        result = new int[]{1, 6};
        assertArrayEquals(day13.solution4(lottos, win_nums), result);

        lottos = new int[]{45, 4, 35, 20, 3, 9};
        win_nums = new int[]{20, 9, 3, 45, 4, 35};
        result = new int[]{1, 1};
        assertArrayEquals(day13.solution4(lottos, win_nums), result);
    }

}
