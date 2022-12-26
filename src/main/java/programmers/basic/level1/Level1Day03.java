package programmers.basic.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Level1Day03 {

    /**
     * 정수 내림차순으로 배치하기
     * @param n
     * @return n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수
     */
    public long solution1(long n) {
        long answer = 0;
        String[] splitNum = String.valueOf(n).split("");
        // import java.util.stream.*;
        String reverseNum = Arrays.stream(splitNum).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        answer = Long.valueOf(reverseNum);
        return answer;
    }

    /**
     * 하샤드수
     * @param x
     * @return 양의 정수 x의 자릿수의 합으로 x가 나누어 지면 하샤드수 이므로 true, 아니면 false
     */
    public boolean solution2(int x) {
        boolean answer = false;
        int total = 0;
        String[] split = String.valueOf(x).split("");
        for (String s : split) {
            total += Integer.valueOf(s);
        }
        if (x % total == 0) {
            answer = true;
        }
        return answer;
    }

    /**
     * 나머지가 1이 되는 수 찾기
     * @param n
     * @return n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x
     */
    public int solution3(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                return answer;
            }
        }
        return answer;
    }

    /**
     * 두 정수 사이의 합
     * @param a
     * @param b
     * @return a와 b 사이에 속한 모든 정수의 합
     */
    public long solution4(int a, int b) {
        long answer = 0;
        int min = a < b ? a : b;
        int max = a < b ? b : a;
        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }

}
