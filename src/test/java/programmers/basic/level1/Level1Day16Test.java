package programmers.basic.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Day16Test {

    Level1Day16 day16 = new Level1Day16();

    @Test
    @DisplayName("기사단원의 무기")
    void solution1() {
        int number = 5;
        int limit = 3;
        int power = 2;
        int result = 10;
        assertEquals(day16.solution1(number, limit, power), result);

        number = 10;
        limit = 3;
        power = 2;
        result = 21;
        assertEquals(day16.solution1(number, limit, power), result);
    }
}