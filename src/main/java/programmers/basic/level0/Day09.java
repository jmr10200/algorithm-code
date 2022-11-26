package programmers.basic.level0;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Day09 {

    /**
     * 개미군단
     * @param hp 사냥감의 체력
     * @return 개미군단 수
     */
    public int solution1(int hp) {
        int answer = 0;
        // 장군 5, 병정 3, 일 1
        if (hp / 5 > 0) {
            answer += hp / 5;
            hp %= 5;
        }
        if (hp / 3 > 0 ) {
            answer += hp / 3;
            hp %= 3;
        }
        answer += hp;
        return answer;
    }

    /**
     * 모스부호 (1)
     * @param letter 모스부호
     * @return 해독한 결과
     */
    public String solution2(String letter) {
        String answer = "";
        Map<String, String> morse = getMorse();
        String[] splitLetter = letter.split(" ");
        for (String l : splitLetter) {
            answer += morse.get(l);
        }
        return answer;
    }

    private Map<String, String> getMorse() {
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        return morse;
    }

    /**
     * 가위 바위 보
     * @param rsp
     * @return 이기는 방법
     */
    public String solution3(String rsp) {
        String answer = "";

        String[] splitRsp = rsp.split("");
        for (String s : splitRsp) {
            answer += getWinRsp(s);
        }
        return answer;
    }

    private final String ROCK = "0"; // 바위
    private final String SCISSORS = "2"; // 가위
    private final String PAPER = "5"; // 보
    private String getWinRsp(String rsp) {
        Map<String, String> rspMap = new HashMap<>();
        rspMap.put(SCISSORS, ROCK); // (낸것, 이기는것)
        rspMap.put(ROCK, PAPER);
        rspMap.put(PAPER, SCISSORS);
        return rspMap.get(rsp);
    }

    /**
     * 구슬을 나누는 경우의 수
     * (주의) long 은 그 범위를 넘어서므로 BigInteger 로 정의할 필요가 있다.
     * @param balls 가지고있는 구슬 개수
     * @param share 나누어줄 구술 개수
     * @return balls 개의 구슬 중 share 개의 구슬을 고르는 가능한 모든 경우의 수 (순서 무관)
     */
    public BigInteger solution4_1(int balls, int share) {
        BigInteger answer = BigInteger.ZERO;
        BigInteger permutation = BigInteger.ONE; // import java.math.*;
        BigInteger num = BigInteger.ONE;
        if (balls - share == 0) {
            answer = BigInteger.ONE;
        } else {
            for (int i = 0; i < share; i++) {
                permutation = permutation.multiply(BigInteger.valueOf(balls - i));
                num = num.multiply(BigInteger.valueOf(share - i));
            }
            answer = permutation.divide(num);
        }
        return answer;
        // 조합 : nCr = n!/r!(n-r)!
    }

}
