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

    /**
     * 영어 끝말잇기
     * @param n n 명의 사람
     * @param words 사람들이 순서대로 말한 단어
     * @return 가장 먼저 탈락하는 사람의 번호 , 그 사람이 자신의 몇 번째 차례에 탈락하는지
     */
    public int[] solution2(int n, String[] words) {
        // 가장 먼저 탈락하는 자 번호, 몇번째 차례에 탈락하는지
        int[] answer = new int[2];
        int count = 0; // 반복 카운트
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            wordsMap.put(word, 0);
        }
        // 첫번쨰 글자
        char start = words[0].charAt(0);
        // 마지막 글자
        char end = words[0].charAt(words[0].length() - 1);
        for (int i = 0; i < words.length; i++) {
            if (i % n == 0) {
                count++;
            }
            start = words[i].charAt(0);
            // 잘못된 끝밀잇기 or 2번째 이상 등장인 경우
            if ((i != 0 && end != start) || wordsMap.get(words[i]) >= 1) {
                answer[0] = (i % n) + 1; // 탈락자 번호
                answer[1] = count; // 몇번째인지
                break;
            }
            // 정상인경우 카운트
            wordsMap.put(words[i], wordsMap.getOrDefault(words[i], 0) + 1);
            // 마지막 글자
            end = words[i].charAt(words[i].length() - 1);
        }

        return answer;
    }



}
