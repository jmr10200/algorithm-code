package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day18Test {

    Level1Day18 day18 = new Level1Day18();

    @Test
    @DisplayName("신고 결과 받기")
    void solution1() {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = {2, 1, 1, 0};
        assertArrayEquals(day18.solution1(idList, report, k), result);

        idList = new String[]{"con", "ryan"};
        report = new String[]{"ryan con", "ryan con", "ryan con", "ryan con"};
        k = 3;
        result = new int[]{0, 0};
        assertArrayEquals(day18.solution1(idList, report, k), result);


        idList = new String[]{"muzi", "frodo", "apeach", "neo", "con", "ryan"};// {0, 1, 0, 1, 1, 0}
        report = new String[]{"ryan con", "ryan con", "frodo neo", "ryan con", "apeach frodo", "apeach muzi"};
        k = 1;
        result = new int[]{0, 1, 2, 0, 0, 1};
        assertArrayEquals(day18.solution1(idList, report, k), result);
    }
}