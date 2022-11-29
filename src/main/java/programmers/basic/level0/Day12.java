package programmers.basic.level0;

import java.util.*;

public class Day12 {

    /**
     * 모음제거 - split() 이용
     * @param my_string
     * @return a, e, i, o, u 제거한 문자열
     */
    public String solution1_1(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] splitStr = my_string.split("");
        for (String s : splitStr) {
            if (!(VOWEL_A.equals(s) || VOWEL_E.equals(s) || VOWEL_I.equals(s) || VOWEL_O.equals(s) || VOWEL_U.equals(s))) {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    private final String VOWEL_A = "a";
    private final String VOWEL_E = "e";
    private final String VOWEL_I = "i";
    private final String VOWEL_O = "o";
    private final String VOWEL_U = "u";

    /**
     * 모음제거 - replace() 또는 replaceAll() 이용
     * @param my_string
     * @return a, e, i, o, u 제거한 문자열
     */
    public String solution1_2(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }

    /**
     * 문자열 정렬하기 (1)
     * @param my_string
     * @return 숫자만 오름차순 정렬한 리스트
     */
    public int[] solution2(String my_string) {
        int[] answer = {};
        String numbers = my_string.replaceAll("[a-z]", ""); // 영어 소문자 제거
        String[] splitNumbers = numbers.split("");
        answer = new int[splitNumbers.length]; // 배열 생성
        int idx = 0;
        for (String s : splitNumbers) {
            answer[idx] = Integer.valueOf(s);
            idx++;
        }
        Arrays.sort(answer); // 정렬
        return answer;
    }

    /**
     * 숨어있는 숫자의 덧셈 (1) : regex = [a-z|[A-Z] 로 문자제거
     * @param my_string
     * @return 한자리 자연수 합
     */
    public int solution3(String my_string) {
        int answer = 0;
        String numbers = my_string.replaceAll("[a-z]|[A-Z]", "");
        String[] splitNumbers = numbers.split("");
        for (String s : splitNumbers) {
            answer += Integer.valueOf(s);
        }
        return answer;
    }

    /**
     * 소인수분해
     * @param n
     * @return 소인수를 오름차순 정렬한 배열
     */
    public int[] solution4(int n) {
        // 소인수 리스트
        List<Integer> numList = new ArrayList<>();
        // 소수
        for (int i = 1; i <= n; i++) {
            int divideCnt = 0;
            if (n % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divideCnt++;
                    }
                    if (i > 1 && i == j && divideCnt <= 2) {
                        numList.add(i);
                    }
                }

            }
        }
        // 배열 변환
        int[] answer = numList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
