package programmers.basic.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Level1Day06 {

    /**
     * 수박수박수박수박수박수?
     * @param n
     * @return n 길이만큼 수박수박? 반복출력
     */
    public String solution1(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        answer = sb.toString();
        return answer;
    }

    /**
     * 내적
     * @param a
     * @param b
     * @return a와 b의 내적 : a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] (n은 a, b의 길이)
     */
    public int solution2(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    /**
     * 문자열 내림차순으로 배치하기
     * @param s
     * @return s에 나타나는 문자를 큰것부터 작은 순으로 정렬
     */
    public String solution3(String s) {
        String answer = "";
        String[] splitStr = s.split("");
        // import java.util.Arrays.*;
        // import java.util.stream.*;
        // import java.util.*;
        answer = Arrays.stream(splitStr).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        return answer;
    }

    /**
     * 약수의 개수와 덧셈
     * @param left
     * @param right
     * @return left 부터 right 까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수
     */
    public int solution4(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (getDivisors(i) % 2 == 0) {
                answer += i; // 짝수
            } else {
                answer -= i; // 홀수
            }
        }
        return answer;
    }

    private int getDivisors(int num) {
        List<Integer> divisorList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorList.add(i);
            }
        }
        return divisorList.size();
    }
}
