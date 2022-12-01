package programmers.basic.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day14 {

    /**
     * 가까운 수
     * @param array
     * @param n
     * @return array 의 정수 중 n 과 가장 가까운 수
     */
    public int solution1(int[] array, int n) {
        int answer = 0;
        int min = 0;
        int max = 0;
        if (array.length == 1) {
            answer = array[0];
            return answer;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= n) {
                min = array[i];
            } else if (max == 0 || max > array[i]) {
                max = array[i];
            }
        }
        if (min == n || max == 0) {
            answer = min;
        } else if (min == 0) {
            answer = max;
        } else {
            answer = Math.abs(min - n) > Math.abs(max - n) ? max : min;
        }
        return answer;
    }

    /**
     * 369게임
     * @param order
     * @return 369 박수 회수
     */
    public int solution2(int order) {
        int answer = 0;
        String[] strNum = String.valueOf(order).split("");
        for (String str : strNum) {
            if (str.matches("[369]")) {
                answer++;
            }
        }
        return answer;
    }

    /**
     * 암호해독
     * @param cipher
     * @param code
     * @return code 의 배수번째 문자
     */
    public String solution3(String cipher, int code) {
        String answer = "";
        List<Integer> codes = new ArrayList<>();
        for (int i = 1; i <= cipher.length(); i++) {
            if (i % code == 0) {
                codes.add(i);
            }
        }
        for (Integer c : codes) {
            answer += cipher.charAt(c-1);
        }
        return answer;
    }

    /**
     * 대문자와 소문자
     * @param my_string
     * @return 대문자는 소문자로, 소문자는 대문자로
     */
    public String solution4(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String str = String.valueOf(my_string.charAt(i));
            if (my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                answer += str.toUpperCase();
            } else {
                answer += str.toLowerCase();
            }
        }
        return answer;
    }
}
