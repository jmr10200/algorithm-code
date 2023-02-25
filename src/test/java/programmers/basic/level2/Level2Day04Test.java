package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day04Test {

    Level2Day04 day04 = new Level2Day04();

    @Test
    @DisplayName("예상 대진표")
    void solution1() {
        int n = 8;
        int a = 4;
        int b = 7;
        int result = 3;
        assertEquals(day04.solution1(n, a, b), result);
    }

}