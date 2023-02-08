package programmers.basic.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Level1Day17 {

    /**
     * 옹알이 (2)
     * @param babbling 문자열 배열
     * @return 발음할 수 있는 단어 개수
     * "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워함
     */
    public int solution1(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String babble : babbling) {
            // 숫자로 치환
            for (int i = 0; i < words.length; i++) {
                babble = babble.replace(words[i], String.valueOf(i));
            }
            // 숫자만 있고, 연속으로 중복되는 숫자가 아닐때 (발음할 수 있는 단어만 존재하고, 동일 발음을 연속으로 하지 않을때)
            if (babble.matches("^[0-9]*$") && !isDuplication(babble)) {
                answer++;
            }
        }
        return answer;
    }

    /**
     * 연속으로 중복인가 확인
     * @param babble 단어를 숫자로 치환한 옹알이
     * @return 연속으로 숫자가 중복이면 true, 연속으로 숫자가 중복아니면 false
     */
    private Boolean isDuplication(String babble) {
        Boolean result = Boolean.FALSE;
        String[] intBabbles = babble.split("");
        // 연속으로 같은 숫자인 경우
        for (int i = 1; i < intBabbles.length; i++) {
            if (intBabbles[i].equals(intBabbles[i - 1])) {
                // 중복이므로 true
                result = Boolean.TRUE;
            }
        }
        return result;
    }

}
