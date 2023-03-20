package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day08Test {

    Level2Day08 day08 = new Level2Day08();

    @Test
    @DisplayName("k진수에서 소수 개수 구하기")
    void solution1() {
        int n = 437674;
        int k = 3;
        int result = 3;
        assertEquals(day08.solution1(n, k), result);

        n = 110011;
        k = 10;
        result = 2;
        assertEquals(day08.solution1(n, k), result);
    }


}