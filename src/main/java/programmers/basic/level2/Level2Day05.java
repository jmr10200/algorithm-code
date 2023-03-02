package programmers.basic.level2;

import java.util.*;

public class Level2Day05 {

    /**
     * H-Index
     * @param citations 발표한 논문의 인용 횟수를 담은 배열
     * @return 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 H-Index
     * h-index 는 h 개의 논문이 각각 적어도 h 개의 인용 을 갖도록 하는 가장 큰 숫자 h 입니다.
     */
    public int solution1(int[] citations) {
        int answer = 0;
        // 정렬
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }
        return answer;
    }

    /**
     * 괄호 회전하기
     * @param s 대괄호, 중괄호, 소괄호로 이루어진 문자열
     * @return s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수
     */
    public int solution2(String s) {
        int answer = 0;

        // 길이가 홀수면 올바른 괄호 불가능
        if (s.length() % 2 != 0) {
            return answer; // 0
        }
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            char start = s.charAt(0); // 첫번째
            char end = s.charAt(s.length() - 1); // 마지막
            boolean startCond = true;

            // 올바른 괄호 확인
            for (int j = 0; j < s.length(); j++) {
                // 첫번째 괄호가 닫는 괄호면 X , 마지막 괄호가 여는 괄호면 X
                if (')' == start || '}' == start || ']' == start || '(' == end || '{' == end || '[' == end) {
                    startCond = false;
                    break;
                } else {
                    if ('(' == s.charAt(j) || '{' == s.charAt(j) || '[' == s.charAt(j)) {
                        stack.push(s.charAt(j));
                    } else {
                        // 괄호 확인해서 제거
                        if (!stack.empty() && stack.peek() == '(' && ')' == s.charAt(j)) {
                            stack.pop();
                        } else if (!stack.empty() && stack.peek() == '{' && '}' == s.charAt(j)) {
                            stack.pop();
                        } else if (!stack.empty() && stack.peek() == '[' && ']' == s.charAt(j)) {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(j));
                        }
                    }
                }
            }
            // 올바른 괄호이면 카운트
            if (startCond && stack.isEmpty()) {
                answer++;
            }
            // 회전
            s = rotateString(s);
        }
        return answer;
    }

    /** 문자열 회전 */
    private static String rotateString(String s) {
        return s.substring(1) + s.substring(0, 1);
    }


}
