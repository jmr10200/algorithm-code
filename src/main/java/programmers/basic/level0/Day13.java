package programmers.basic.level0;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class Day13 {

    private final String exceptChar = "Z";
    /**
     * 컨트롤 제트
     * @param s 공백으로 구분된 Z 또는 숫자
     * @return Z 이면 직전에 더한 수 제외
     */
    public int solution1(String s) {
        int answer = 0;
        String[] splitStr = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < splitStr.length; i++) {
            // Z 아니면 스택에 넣기
            if (!exceptChar.equals(splitStr[i])) {
                stack.push(Integer.valueOf(splitStr[i]));
            } else {
                if (!stack.empty()) {
                    // Z 이면 스택에서 빼기
                    stack.pop();
                }
            }
        };
        // 더하기
        for (Integer number : stack) {
            answer += number;
        }
        return answer;
    }

    /**
     * 배열 원소의 길이
     * @param strlist
     * @return
     */
    public int[] solution2(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    /**
     * 중복된 문자 제거
     * @param my_string
     * @return 중복 문자 제거된 문자
     */
    public String solution3(String my_string) {
        String answer = "";
        String[] split = my_string.split("");
        answer = Arrays.stream(split).distinct().collect(Collectors.joining()); // import java.util.stream.Collectors;
        return answer;
    }

    /**
     * 삼각형의 완성조건
     * @param sides
     * @return 삼각형 가능 1, 불가능 2
     */
    public int solution4(int[] sides) {
        int answer = 0;
        // 가장 긴 변의 길이 < 나머지 두 변의 길이 합
        Arrays.sort(sides);
        if (sides[0] + sides[1] > sides[2]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
