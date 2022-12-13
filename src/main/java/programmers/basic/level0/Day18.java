package programmers.basic.level0;

import java.util.Arrays;

public class Day18 {

    /**
     * 문자열 안에 문자열
     * @param str1
     * @param str2
     * @return str1 안에 str2 있으면 1, 없으면 2
     */
    public int solution1(String str1, String str2) {
        int answer = 0;
        answer = str1.contains(str2) ? 1 : 2;
        return answer;
    }

    /**
     * 제곱수 판별하기
     * @param n
     * @return n 이 제곱수면 1, 아니면 2
     */
    public int solution2(int n) {
        int answer = 0;
        Double result = Math.sqrt(Double.valueOf(n)); // import java.lang.*;
        if (result % 1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    /**
     * 세균증식
     * @param n
     * @param t
     * @return 1시간에 2배증가, t 시간후 n 의 수
     */
    public int solution3(int n, int t) {
        int answer = n;
        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }
        return answer;
    }

    /**
     * 문자열 정렬하기 (2)
     * @param my_string
     * @return 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열
     */
    public String solution4(String my_string) {
        String answer = "";
        String[] splitStr = my_string.toLowerCase().split("");
        Arrays.sort(splitStr); // import java.util.*;
        StringBuilder sb = new StringBuilder();
        for (String s : splitStr) {
            sb.append(s);
        }
        answer = sb.toString();
        return answer;
    }
}
