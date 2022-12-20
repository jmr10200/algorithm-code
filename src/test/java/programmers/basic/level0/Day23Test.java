package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day23Test {

    Day23 day23 = new Day23();

    @Test
    @DisplayName("특이한 정렬")
    void solution1() {
        int[] numList = {1, 2, 3, 4, 5, 6};
        int n = 4;
        int[] result = {4, 5, 3, 6, 2, 1};
        assertArrayEquals(day23.solution1(numList, n), result);

        numList = new int[]{10000, 20, 36, 47, 40, 6, 10, 7000};
        n = 30;
        result = new int[]{36, 40, 20, 47, 10, 6, 7000, 10000};
        assertArrayEquals(day23.solution1(numList, n), result);

        numList = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11};
        n = 6;
        result = new int[]{6, 7, 5, 8, 4, 9, 3, 10, 2, 11, 1};
        assertArrayEquals(day23.solution1(numList, n), result);
    }

    @Test
    @DisplayName("등수 매기기")
    void solution2() {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[] result = {1, 2, 4, 3};
        assertArrayEquals(day23.solution2(score), result);

        score = new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        result = new int[]{4, 4, 6, 2, 2, 1, 7};
        assertArrayEquals(day23.solution2(score), result);
    }

    @Test
    @DisplayName("옹알이 (1)")
    void solution3() {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        int result = 1;
        assertEquals(day23.solution3(babbling),result);

        babbling = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        result = 3;
        assertEquals(day23.solution3(babbling),result);
    }

    @Test
    @DisplayName("로그인 성공?")
    void solution4() {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String result = "login";
        assertEquals(day23.solution4(id_pw, db), result);

        id_pw = new String[]{"programmer01", "15789"};
        db = new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        result = "wrong pw";
        assertEquals(day23.solution4(id_pw, db), result);

        id_pw = new String[]{"rabbit04", "98761"};
        db = new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        result = "fail";
        assertEquals(day23.solution4(id_pw, db), result);
    }
}