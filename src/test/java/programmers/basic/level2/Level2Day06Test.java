package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day06Test {

    Level2Day06 day06 = new Level2Day06();

    @Test
    @DisplayName("위장")
    void solution1() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = 5;
        assertEquals(day06.solution1(clothes), result);

        clothes = new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        result = 3;
        assertEquals(day06.solution1(clothes), result);
    }


}