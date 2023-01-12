package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day14Test {

    Level1Day14 day14 = new Level1Day14();

    @Test
    @DisplayName("가장 가까운 같은 글자")
    void solution1() {
        String s = "banana";
        int[] result = {-1, -1, -1, 2, 2, 2};
        assertArrayEquals(day14.solution1(s), result);

        s = "foobar";
        result = new int[]{-1, -1, 1, -1, -1, -1};
        assertArrayEquals(day14.solution1(s), result);
    }

}
