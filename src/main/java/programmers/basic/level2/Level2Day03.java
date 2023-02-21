package programmers.basic.level2;

import java.util.*;
import java.util.stream.Collectors;

public class Level2Day03 {

    /**
     * 짝지어 제거하기
     * @param s 알파벳 소문자로 이루어진 문자열
     * @return 앞뒤로 같은 문자열을 짝지어 모두 제거할 수 있으면 1, 아니면 0
     */
    public int solution1(String s) {
        int answer = 0;
        Stack<String> stacks = new Stack<>();
        String[] strings = s.split("");
        for (int i = 0; i < strings.length; i++) {
            if (!stacks.empty() && stacks.peek().equals(strings[i])) {
                stacks.pop();
            } else {
                stacks.push(strings[i]);
            }
        }

        if (stacks.empty()) {
            answer = 1;
        }

        return answer;
    }


}
