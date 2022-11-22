package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day05Test {

    Day05 day05 = new Day05();

    @Test
    @DisplayName("옷가게 할인받기")
    void solution1() {
        int price = 150000;
        int result = 142500;
        assertEquals(day05.solution1(price), result);

        price = 580000;
        result = 464000;
        assertEquals(day05.solution1(price), result);
    }

    @Test
    @DisplayName("아이스 아메리카노")
    void solution2() {
        int money = 5500;
        int[] result = {1, 0};
        assertArrayEquals(day05.solution2(money), result);

        money = 15000;
        result = new int[]{2, 4000};
        assertArrayEquals(day05.solution2(money), result);
    }

    @Test
    @DisplayName("나이출력")
    void solution3() {
        int age = 40;
        int result = 1983;
        assertEquals(day05.solution3(age), result);

        age = 23;
        result = 2000;
        assertEquals(day05.solution3(age), result);
    }

    @Test
    @DisplayName("배열 뒤집기")
    void solution4() {
        int[] numList = {1, 2, 3, 4, 5};
        int[] result = {5, 4, 3, 2, 1};
        assertArrayEquals(day05.solution4(numList), result);

        numList = new int[]{1, 1, 1, 1, 1, 2};
        result = new int[]{2, 1, 1, 1, 1, 1};
        assertArrayEquals(day05.solution4(numList), result);

        numList = new int[]{1, 0, 1, 1, 1, 3, 5};
        result = new int[]{5, 3, 1, 1, 1, 0, 1};
        assertArrayEquals(day05.solution4(numList), result);
    }

}