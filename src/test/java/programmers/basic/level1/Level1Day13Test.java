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

    @Test
    @DisplayName("[1차] 다트게임")
    void solution2() {
        String dartResult = "1S2D*3T";
        int result = 37;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D2S#10S";
        result = 9;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D2S0T";
        result = 3;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1S*2T*3S";
        result = 23;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D#2S*3S";
        result = 5;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1T2D3D#";
        result = -4;
        assertEquals(day13.solution2(dartResult), result);

        dartResult = "1D2S3T*";
        result = 59;
        assertEquals(day13.solution2(dartResult), result);
    }

}
