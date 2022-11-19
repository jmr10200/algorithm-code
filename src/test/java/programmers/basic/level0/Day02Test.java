package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day02Test {

    Day02 day02 = new Day02();

    @Test
    @DisplayName("두 수의 나눗셈")
    void solution1() {
        int num1 = 3;
        int num2 = 2;
        assertEquals(day02.solution1(num1, num2), 1500);

        num1 = 7;
        num2 = 3;
        assertEquals(day02.solution1(num1, num2), 2333);

        num1 = 1;
        num2 = 16;
        assertEquals(day02.solution1(num1, num2), 62);
    }

    @Test
    @DisplayName("숫자 비교하기")
    void solution2() {
        int num1 = 2;
        int num2 = 3;
        assertEquals(day02.solution2(num1, num2), -1);

        num1 = 11;
        num2 = 11;
        assertEquals(day02.solution2(num1, num2), 1);

        num1 = 7;
        num2 = 9;
        assertEquals(day02.solution2(num1, num2), -1);
    }

    @Test
    @DisplayName("분수의 덧셈")
    void solution3() {
        int denum1 = 1;
        int num1 = 2;
        int denum2 = 3;
        int num2 = 4;
        int[] result = {5, 4};
        assertArrayEquals(day02.solution3(denum1, num1,denum2, num2), result);

        denum1 = 9;
        num1 = 2;
        denum2 = 1;
        num2 = 3;
        result = new int[]{29, 6};
        assertArrayEquals(day02.solution3(denum1, num1,denum2, num2), result);
    }

    @Test
    @DisplayName("배열 두 배 만들기")
    void solution4() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = {2, 4, 6, 8, 10};
        assertArrayEquals(day02.solution4(numbers), result);

        numbers = new int[]{1, 2, 100, -99, 1, 2, 3};
        result = new int[]{2, 4, 200, -198, 2, 4, 6};
        assertArrayEquals(day02.solution4(numbers), result);
    }
}