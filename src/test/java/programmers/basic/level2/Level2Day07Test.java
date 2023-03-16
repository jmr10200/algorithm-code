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

    @Test
    @DisplayName("타겟 넘버")
    void solution3() {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int result = 5;
        assertEquals(day07.solution3(numbers, target), result);

        numbers = new int[]{4, 1, 2, 1};
        target = 4;
        result = 2;
        assertEquals(day07.solution3(numbers, target), result);
    }

    @Test
    @DisplayName("뉴스 클러스터링")
    void solution4() {
        String str1 = "FRANCE";
        String str2 = "french";
        int result = 16384;
        assertEquals(day07.solution4(str1, str2), result);

        str1 = "handshake";
        str2 = "shake hands";
        result = 65536;
        assertEquals(day07.solution4(str1, str2), result);

        str1 = "aa1+aa2";
        str2 = "AAAA12";
        result = 43690;
        assertEquals(day07.solution4(str1, str2), result);

        str1 = "E=M*C^2";
        str2 = "e=m*c^2";
        result = 65536;
        assertEquals(day07.solution4(str1, str2), result);

        // 반례 추가
        // ab, ba, ab와 ba, ab, ba에 대하여 자카드 값 0.5로 32768
        str1 = "abab";
        str2 = "baba";
        result = 32768;
        assertEquals(day07.solution4(str1, str2), result);
    }
}