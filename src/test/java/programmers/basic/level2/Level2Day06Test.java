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

    @Test
    @DisplayName("기능 개발")
    void solution3() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = {2, 1};
        assertArrayEquals(day06.solution3(progresses, speeds), result);

        progresses = new int[]{95, 90, 99, 99, 80, 99};
        speeds = new int[]{1, 1, 1, 1, 1, 1};
        result = new int[]{1, 3, 2};
        assertArrayEquals(day06.solution3(progresses, speeds), result);
        // 5, 10, 1, 1, 20, 1
        // 1, 3 , 2

        progresses = new int[]{95, 95, 90, 99, 99, 80, 99};
        speeds = new int[]{1, 1, 1, 1, 1, 1, 1};
        result = new int[]{2, 3, 2};
        assertArrayEquals(day06.solution3(progresses, speeds), result);
        // 5, 5, 10, 1, 1, 20, 1
        // 2, 3, 2

        progresses = new int[]{1, 1, 1, 1}; // 51, 101
        speeds = new int[]{100, 50, 99, 100};
        result = new int[]{1, 3};
        assertArrayEquals(day06.solution3(progresses, speeds), result);
        // 1, 2 , 1, 1
        // 1일차에 1개
        // 2일차에 3개

        progresses = new int[]{54, 58, 53, 1};
        speeds = new int[]{100, 50, 99, 100};
        result = new int[]{4};
        assertArrayEquals(day06.solution3(progresses, speeds), result);
        // 1, 1, 1, 1
        // 100-54 = 46 % 100

        // 놓쳤던 테스트 케이스 : 첫째날 5일을 가장 큰 기준으로 잡아야 한다.
        progresses = new int[]{95, 97, 96, 99};
        speeds = new int[]{1, 1, 1, 1};
        result = new int[]{4};
        assertArrayEquals(day06.solution3(progresses, speeds), result);
        // 5, 3, 4, 1
        // 100-54 = 46 % 100
    }

}