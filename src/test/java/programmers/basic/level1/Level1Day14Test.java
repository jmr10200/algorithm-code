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

    @Test
    @DisplayName("체육복")
    void solution2() {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        int result = 5;
        assertEquals(day14.solution2(n, lost, reserve), result);

        n = 5;
        lost = new int[]{2, 4};
        reserve = new int[]{3};
        result = 4;
        assertEquals(day14.solution2(n, lost, reserve), result);

        n = 3;
        lost = new int[]{3};
        reserve = new int[]{1};
        result = 2;
        assertEquals(day14.solution2(n, lost, reserve), result);

        n = 7;
        lost = new int[]{2, 4, 7};
        reserve= new int[]{1, 3, 5};
        result = 6;
        assertEquals(day14.solution2(n, lost, reserve), result);

        // 여벌 체육복을 가진 학생이 도난당한경우
        n = 4;
        lost = new int[]{2, 3};
        reserve = new int[]{3, 4};
        result = 3;
        assertEquals(day14.solution2(n, lost, reserve), result);

    }

}
