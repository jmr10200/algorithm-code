package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day02Test {

    Level2Day02 day02 = new Level2Day02();

    @Test
    @DisplayName("이진 변환 반복하기")
    void solution1() {
        String s = "110010101001";
        int[] result = {3, 8};
        assertArrayEquals(day02.solution1(s), result);

        s = "01110";
        result = new int[]{3, 3};
        assertArrayEquals(day02.solution1(s), result);

        s = "1111111";
        result = new int[]{4, 1};
        assertArrayEquals(day02.solution1(s), result);
    }

}