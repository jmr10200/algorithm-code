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

    @Test
    @DisplayName("튜플")
    void solution2() {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] result = {2, 1, 3, 4};
        assertArrayEquals(day06.solution2(s), result);

        s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        result = new int[]{2, 1, 3, 4};
        assertArrayEquals(day06.solution2(s), result);

        s = "{{20,111},{111}}";
        result = new int[]{111, 20};
        assertArrayEquals(day06.solution2(s), result);

        s = "{{123}}";
        result = new int[]{123};
        assertArrayEquals(day06.solution2(s), result);

        s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        result = new int[]{3, 2, 4, 1};
        assertArrayEquals(day06.solution2(s), result);
    }

}