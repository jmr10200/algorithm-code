package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day17Test {

    Level1Day17 day17 = new Level1Day17();

    @Test
    @DisplayName("옹알이 (2)")
    void solution1() {
        String[] babbling = {"aya", "yee", "u", "maa"};
        int result = 1;
        assertEquals(day17.solution1(babbling), result);

        babbling = new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        result = 2;
        assertEquals(day17.solution1(babbling), result);
    }

}