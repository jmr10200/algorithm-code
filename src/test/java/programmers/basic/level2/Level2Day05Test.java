package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day05Test {

    Level2Day05 day05 = new Level2Day05();

    @Test
    @DisplayName("H-Index")
    void solution1() {
        int[] citations = {3, 0, 6, 1, 5};
        int result = 3;
        assertEquals(day05.solution1(citations), result);

        citations = new int[]{10, 8, 5, 4, 3};
        result = 4;
        assertEquals(day05.solution1(citations), result);

        citations = new int[]{25, 8, 5, 3, 3};
        result = 3;
        assertEquals(day05.solution1(citations), result);

        citations = new int[]{6, 5, 5, 5, 3, 2, 1, 0};
        result = 4;
        assertEquals(day05.solution1(citations), result);
    }

}