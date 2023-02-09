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


}