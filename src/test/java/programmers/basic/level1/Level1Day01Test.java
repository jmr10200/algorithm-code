package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day01Test {

    Level1Day01 day01 = new Level1Day01();

    @Test
    @DisplayName("짝수와 홀수")
    void solution1() {
        int num = 3;
        String result = "Odd";
        assertEquals(day01.solution1(num), result);

        num = 4;
        result = "Even";
        assertEquals(day01.solution1(num), result);
    }

    @Test
    @DisplayName("평균 구하기")
    void solution2() {
        int[] arr = {1, 2, 3, 4};
        double result = 2.5;
        assertEquals(day01.solution2(arr), result);

        arr = new int[]{5, 5};
        result = 5;
        assertEquals(day01.solution2(arr), result);
    }

    @Test
    @DisplayName("약수의 합")
    void solution3() {
        int n = 12;
        int result = 28;
        assertEquals(day01.solution3(n), result);

        n = 5;
        result = 6;
        assertEquals(day01.solution3(n), result);
    }

    @Test
    @DisplayName("자릿수 더하기")
    void solution4() {
        int n = 123;
        int result = 6;
        assertEquals(day01.solution4(n), result);

        n = 987;
        result = 24;
        assertEquals(day01.solution4(n), result);
    }

}