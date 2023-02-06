package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day16Test {

    Level1Day16 day16 = new Level1Day16();

    @Test
    @DisplayName("기사단원의 무기")
    void solution1() {
        int number = 5;
        int limit = 3;
        int power = 2;
        int result = 10;
        assertEquals(day16.solution1(number, limit, power), result);

        number = 10;
        limit = 3;
        power = 2;
        result = 21;
        assertEquals(day16.solution1(number, limit, power), result);
    }

    @Test
    @DisplayName("문자열 나누기")
    void solution2() {
        String s = "banana";
        int result = 3;
        assertEquals(day16.solution2(s), result);

        s = "abracadabra";
        result = 6;
        assertEquals(day16.solution2(s), result);

        s = "aaabbaccccabba";
        result = 3;
        assertEquals(day16.solution2(s), result);
    }

    @Test
    @DisplayName("개인정보 수집 유효기간")
    void solution3() {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] result = {1, 3};
        assertArrayEquals(day16.solution3(today, terms, privacies), result);

        today = "2020.01.01";
        terms = new String[]{"Z 3", "D 5"};
        privacies = new String[]{"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        result = new int[]{1, 4, 5};
        assertArrayEquals(day16.solution3(today, terms, privacies), result);
    }

}