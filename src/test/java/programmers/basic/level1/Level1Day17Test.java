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

    @Test
    @DisplayName("신규 아이디 추천")
    void solution2() {
        String newId = "...!@BaT#*..y.abcdefghijklm";
        String result = "bat.y.abcdefghi";
        assertEquals(day17.solution2(newId), result);

        newId = "z-+.^.";
        result = "z--";
        assertEquals(day17.solution2(newId), result);

        newId = "=.=";
        result = "aaa";
        assertEquals(day17.solution2(newId), result);

        newId = "123_.def";
        result = "123_.def";
        assertEquals(day17.solution2(newId), result);

        newId = "abcdefghijklmn.p";
        result = "abcdefghijklmn";
        assertEquals(day17.solution2(newId), result);
    }

    @Test
    @DisplayName("햄버거 만들기")
    void solution3() {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int result = 2;
        assertEquals(day17.solution3(ingredient), result);

        ingredient = new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2};
        result = 0;
        assertEquals(day17.solution3(ingredient), result);

        ingredient = new int[]{1, 1, 2, 3, 1, 3, 1, 2};
        result = 1;
        assertEquals(day17.solution3(ingredient), result);

        ingredient = new int[]{1, 1, 2, 3, 1, 3, 1, 2, 3};
        result = 1;
        assertEquals(day17.solution3(ingredient), result);

        ingredient = new int[]{1, 1, 2, 3, 1, 3, 1, 2, 3, 3};
        result = 1;
        assertEquals(day17.solution3(ingredient), result);

        ingredient = new int[]{1, 1, 2, 3, 1, 3, 1, 2, 3, 3, 3};
        result = 1;
        assertEquals(day17.solution3(ingredient), result);
    }

    @Test
    @DisplayName("둘만의 암호")
    void solution4() {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String result = "happy";
        assertEquals(day17.solution4(s, skip, index), result);

        s = "ybcde";
        skip = "az";
        index = 1;
        result = "bcdef";
        assertEquals(day17.solution4(s, skip, index), result);
    }
}