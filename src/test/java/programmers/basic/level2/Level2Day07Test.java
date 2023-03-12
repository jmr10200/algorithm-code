package programmers.basic.level2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level2Day07Test {

    Level2Day07 day07 = new Level2Day07();

    @Test
    @DisplayName("연속 부분 수열 합의 개수")
    void solution1() {
        int[] elements = {7, 9, 1, 1, 4};
        int result = 18;
        assertEquals(day07.solution1(elements), result);

    }

    @Test
    @DisplayName("전화번호 목록")
    void solution2() {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        //false
        assertFalse(day07.solution2(phoneBook));

        phoneBook = new String[]{"119", "25951", "97674223", "2295524421", "1195524421", "289552442", "20095524421"};
        //false
        // 정렬하면 ["119", "1195524421", "20095524421", "2295524421", "25951", "289552442", "97674223"]
        assertFalse(day07.solution2(phoneBook));

        phoneBook = new String[]{"123", "456", "789"};
        //true
        assertTrue(day07.solution2(phoneBook));

        phoneBook = new String[]{"12", "123", "1235", "567", "88"};
        //false
        assertFalse(day07.solution2(phoneBook));
    }

}