package programmers.basic.level0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day21Test {

    Day21 day21 = new Day21();

    @Test
    @DisplayName("숨어있는 숫자의 덧셈 (2)")
    void solution1() {
        String myString = "aAb1B2cC34oOp";
        int result = 37;
        assertEquals(day21.solution1(myString), result);

        myString = "1a2b3c4d123Z";
        result = 133;
        assertEquals(day21.solution1(myString), result);
    }

    @Test
    @DisplayName("안전지대")
    void solution2() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int result = 16;
        assertEquals(day21.solution2(board), result);

        board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        result = 13;
        assertEquals(day21.solution2(board), result);

        board = new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        result = 0;
        assertEquals(day21.solution2(board), result);
    }

    @Test
    @DisplayName("삼각형의 완성조건 (2)")
    void solution3() {
        int[] sides = {1, 2};
        int result = 1;
        assertEquals(day21.solution3(sides), result);

        sides = new int[]{3, 6};
        result = 5;
        assertEquals(day21.solution3(sides), result);

        sides = new int[]{11, 7};
        result = 13;
        assertEquals(day21.solution3(sides), result);
    }

    @Test
    @DisplayName("외계어 사전")
    void solution4() {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        int result = 2;
        assertEquals(day21.solution4(spell, dic), result);

        spell = new String[]{"z", "d", "x"};
        dic = new String[]{"def", "dww", "dzx", "loveaw"};
        result = 1;
        assertEquals(day21.solution4(spell, dic), result);

        spell = new String[]{"s", "o", "m", "d"};
        dic = new String[]{"moos", "dzx", "smm", "sunmmo", "som"};
        result = 2;
        assertEquals(day21.solution4(spell, dic), result);
    }
}