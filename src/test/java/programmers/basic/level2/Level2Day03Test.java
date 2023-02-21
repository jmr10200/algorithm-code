package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day03Test {

    Level2Day03 day03 = new Level2Day03();

    @Test
    @DisplayName("짝지어 제거하기")
    void solution1() {
        String s = "baabaa";
        int result = 1;
        assertEquals(day03.solution1(s), result);

        s = "cdcd";
        result = 0;
        assertEquals(day03.solution1(s), result);
    }

}