package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class Day09Test {

    Day09 day09 = new Day09();

    @Test
    @DisplayName("개미군단")
    void solution1() {
        int hp = 23;
        int result = 5;
        assertEquals(day09.solution1(hp), result);

        hp = 24;
        result = 6;
        assertEquals(day09.solution1(hp), result);
    }

    @Test
    @DisplayName("모스부호 (1)")
    void solution2() {
        String letter = ".... . .-.. .-.. ---";
        String result = "hello";
        assertEquals(day09.solution2(letter), result);

        letter = ".--. -.-- - .... --- -.";
        result = "python";
        assertEquals(day09.solution2(letter), result);
    }

    @Test
    @DisplayName("가위 바위 보")
    void solution3() {
        String rsp = "2";
        String result = "0";
        assertEquals(day09.solution3(rsp), result);

        rsp = "205";
        result = "052";
        assertEquals(day09.solution3(rsp), result);
    }

    @Test
    @DisplayName("구슬을 나누는 경우의 수")
    void solution4() {
        int balls = 3;
        int share = 2;
        BigInteger result = BigInteger.valueOf(3);
        assertEquals(day09.solution4(balls, share), result);

        balls = 5;
        share = 3;
        result = BigInteger.valueOf(10);
        assertEquals(day09.solution4(balls, share), result);

        balls = 8;
        share = 8;
        result = BigInteger.valueOf(1);
        assertEquals(day09.solution4(balls, share), result);

        balls = 30;
        share = 15;
        result = BigInteger.valueOf(155117520);
        assertEquals(day09.solution4(balls, share), result);

        balls = 9;
        share = 3;
        result = BigInteger.valueOf(84);
        assertEquals(day09.solution4(balls, share), result);
    }
}