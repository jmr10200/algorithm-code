package programmers.basic.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day07Test {

    Level2Day07 day07 = new Level2Day07();

    @Test
    @DisplayName("연속 부분 수열 합의 개수")
    void solution1() {
        int[] elements = {7, 9, 1, 1, 4};
        int result = 18;
        assertEquals(day07.solution1(elements), result);

    }

}