package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day03Test {

    Level1Day03 day03 = new Level1Day03();

    @Test
    @DisplayName("정수 내림차순으로 배치하기")
    void solution1() {
        long n = 118372;
        long result = 873211;
        assertEquals(day03.solution1(n), result);
    }

    @Test
    @DisplayName("하샤드수")
    void solution2() {
        int x = 10;
        boolean result = true;
        assertEquals(day03.solution2(x), result);

        x = 12;
        result = true;
        assertEquals(day03.solution2(x), result);

        x = 11;
        result = false;
        assertEquals(day03.solution2(x), result);

        x = 13;
        result = false;
        assertEquals(day03.solution2(x), result);
    }

    @Test
    @DisplayName("나머지가 1이 되는 수 찾기")
    void solution3() {
        int n = 10;
        int result = 3;
        assertEquals(day03.solution3(n), result);

        n = 12;
        result = 11;
        assertEquals(day03.solution3(n), result);
    }

    @Test
    @DisplayName("두 정수 사이의 합")
    void solution4() {
        int a = 3;
        int b = 5;
        long result = 12;
        assertEquals(day03.solution4(a, b), result);

        a = 3;
        b = 3;
        result = 3;
        assertEquals(day03.solution4(a, b), result);

        a = 5;
        b = 3;
        result = 12;
        assertEquals(day03.solution4(a, b), result);
    }

}