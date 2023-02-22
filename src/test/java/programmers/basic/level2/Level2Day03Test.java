package programmers.basic.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day03Test {

    Level2Day03 day03 = new Level2Day03();

    @Test
    @DisplayName("짝지어 제거하기")
    void solution1() {
        String s = "baabaa";
        int result = 1;
        assertEquals(day03.solution1(s), result);

        s = "cdcd";
        result = 0;
        assertEquals(day03.solution1(s), result);
    }

    @Test
    @DisplayName("영어 끝말잇기")
    void solution2() {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] result = {3, 3};
        assertArrayEquals(day03.solution2(n, words), result);

        n = 5;
        words = new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        result = new int[]{0, 0};
        assertArrayEquals(day03.solution2(n, words), result);

        n = 2;
        words = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
        result = new int[]{1, 3};
        assertArrayEquals(day03.solution2(n, words), result);
    }

}