package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day08Test {

    Day08 day08 = new Day08();

    @Test
    @DisplayName("배열 자르기")
    void solution1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;
        int[] result = {2, 3, 4};
        assertArrayEquals(day08.solution1(numbers, num1, num2), result);

        numbers = new int[]{1, 3, 5};
        num1 = 1;
        num2 = 2;
        result = new int[]{3, 5};
        assertArrayEquals(day08.solution1(numbers, num1, num2), result);
    }

    @Test
    @DisplayName("외계행성의 나이")
    void solution2() {
        int age = 23;
        String result = "cd";
        assertEquals(day08.solution2(age), result);

        age = 51;
        result = "fb";
        assertEquals(day08.solution2(age), result);

        age = 100;
        result = "baa";
        assertEquals(day08.solution2(age), result);
    }

    @Test
    @DisplayName("진료순서 정하기")
    void solution3() {
        int[] emergency = {3, 76, 24};
        int[] result = {3, 1, 2};
        assertArrayEquals(day08.solution3(emergency), result);

        emergency = new int[]{1, 2, 3, 4, 5, 6, 7};
        result = new int[]{7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(day08.solution3(emergency), result);

        emergency = new int[]{30, 10, 23, 6, 100};
        result = new int[]{2, 4, 3, 5, 1};
        assertArrayEquals(day08.solution3(emergency), result);
    }

    @Test
    @DisplayName("순서쌍의 개수")
    void solution4() {
        int n = 20;
        int result = 6;
        assertEquals(day08.solution4(n), result);
        // (1,20) (2,10) (4,5) (5,4) (10,2) (20,1)
        n = 100;
        result = 9;
        assertEquals(day08.solution4(n), result);
        // (1,100) (2,50) (4,25) (5,20) (10,10) (20,5) (25,4) (50,2) (100,1)
    }
}