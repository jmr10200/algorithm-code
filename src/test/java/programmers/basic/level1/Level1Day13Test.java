package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day13Test {

    Level1Day13 day13 = new Level1Day13();

    @Test
    @DisplayName("크기가 작은 부분 문자열")
    void solution1() {
        String t = "3141592";
        String p = "271";
        int result = 2;
        assertEquals(day13.solution1(t, p), result);

        t = "500220839878";
        p = "7";
        result = 8;
        assertEquals(day13.solution1(t, p), result);

        t = "10203";
        p = "15";
        result = 3;
        assertEquals(day13.solution1(t, p), result);

        t = "15";
        p = "15";
        result = 1;
        assertEquals(day13.solution1(t, p), result);
    }

}
