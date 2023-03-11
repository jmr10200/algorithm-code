package programmers.basic.level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Level2Day07 {

    /**
     * 연속 부분 수열 합의 개수
     * @param elements 수열
     * @return 중복제거한 연속 부분 수열 합의 개수
     */
    public int solution1(int[] elements) {
        int answer = 0;
        // 중복 제거한 수열의 합의 개수
        Set<Integer> result = new HashSet<>();
        // 원소의 길이만큼 반복
        for (int i = 0; i < elements.length; i++) {
            result.add(elements[i]);
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = 0; k < i + 1; k++) { // 개수
                    if (j + k > elements.length - 1) {
                        sum += elements[j + k - elements.length];
                    } else {
                        sum += elements[j + k];
                    }
                    result.add(sum);
                }
            }
        }
        answer = result.size();
        return answer;
    }

}
