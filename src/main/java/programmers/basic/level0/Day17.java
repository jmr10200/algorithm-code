package programmers.basic.level0;

import java.util.ArrayList;
import java.util.List;

public class Day17 {

    /**
     * 숫자 찾기
     *
     * @param num
     * @param k
     * @return num 에 k 가 있으면 그 숫자의 자리 수, 없으면 -1
     */
    public int solution1(int num, int k) {
        int answer = 0;
        String nums = String.valueOf(num);
        if (nums.contains(String.valueOf(k))) {
            String[] split = nums.split("");
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals(String.valueOf(k))) {
                    answer = i + 1;
                    return answer;
                }
            }
        } else {
            answer = -1;
        }
        return answer;
    }

    /**
     * n의 배수 고르기
     *
     * @param n
     * @param numlist
     * @return numList 중 n 의 배수 배열
     */
    public int[] solution2(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> nList = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                nList.add(num);
            }
        }
        answer = nList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    /**
     * 자릿수 더하기
     *
     * @param n
     * @return
     */
    public int solution3(int n) {
        int answer = 0;
        String[] splitNum = String.valueOf(n).split("");
        for (String s : splitNum) {
            answer += Integer.valueOf(s);
        }
        return answer;
    }

    /**
     * OX퀴즈
     * @param quiz
     * @return
     */
    public String[] solution4(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] splitQuiz = quiz[i].split(" ");
            if (PLUS.equals(splitQuiz[1])) {
                if (Integer.valueOf(splitQuiz[0]) + Integer.parseInt(splitQuiz[2]) == Integer.parseInt(splitQuiz[4])){
                    answer[i] = CORRECT;
                } else {
                    answer[i] = WRONG;
                }
            } else {
                if (Integer.valueOf(splitQuiz[0]) - Integer.parseInt(splitQuiz[2]) == Integer.parseInt(splitQuiz[4])){
                    answer[i] = CORRECT;
                } else {
                    answer[i] = WRONG;
                }
            }
        }
        return answer;
    }

    private static final String PLUS = "+";
    private static final String CORRECT = "O";
    private static final String WRONG = "X";

}
