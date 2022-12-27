package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day04Test {

    Level1Day04 day04 = new Level1Day04();

    @Test
    @DisplayName("콜라츠 추측")
    void solution1() {
        int n = 6;
        int result = 8;
        assertEquals(day04.solution1(n), result);

        n = 16;
        result = 4;
        assertEquals(day04.solution1(n), result);

        n = 626331;
        result = -1;
        assertEquals(day04.solution1(n), result);
    }

    @Test
    @DisplayName("서울에서 김서방 찾기")
    void solution2() {
        String[] seoul = {"Jane", "Kim"};
        String result = "김서방은 1에 있다";
        assertEquals(day04.solution2(seoul), result);
    }

    @Test
    @DisplayName("핸드폰 번호 가리기")
    void solution3() {
        String phoneNumber = "01033334444";
        String result = "*******4444";
        assertEquals(day04.solution3(phoneNumber), result);

        phoneNumber = "027778888";
        result = "*****8888";
        assertEquals(day04.solution3(phoneNumber), result);
    }

    @Test
    @DisplayName("나누어 떨어지는 숫자 배열")
    void solution4() {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] result = {5, 10};
        assertArrayEquals(day04.solution4(arr, divisor),result);

        arr = new int[]{2, 36, 1, 3};
        divisor = 1;
        result = new int[]{1, 2, 3, 36};
        assertArrayEquals(day04.solution4(arr, divisor),result);

        arr = new int[]{3, 2, 6};
        divisor = 10;
        result = new int[]{-1};
        assertArrayEquals(day04.solution4(arr, divisor),result);
    }

}