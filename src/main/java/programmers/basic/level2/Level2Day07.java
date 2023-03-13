package programmers.basic.level2;

import java.util.*;

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

    /**
     * 전화번호 목록
     * @param phone_book 전화번호부에 적힌 전화번호를 담은 배열
     * @return 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false, 그렇지 않으면 true
     */
    public boolean solution2(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            String target = phone_book[i]; // 접두어
            int targetLength = target.length();
            for (int j = i + 1; j < phone_book.length; j++) {
                // 접두어가 되려면, 길이가 더 작아야함
                if (targetLength <= phone_book[j].length()) {
                    if (target.equals(phone_book[j].substring(0, targetLength))) {
                        // 잘라서 일치하면
                        answer = false;
                        return answer;
                    } else {
                        break; // 정렬 특징 효율성

                    }
                }
            }
        }

        return answer;
    }

    /**
     * 타겟 넘버
     * @param numbers 사용할 수 있는 숫자가 담긴 배열
     * @param target 타겟 넘버
     * @return 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수
     */
    public int solution3(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, int sum, int current) {
        int ans = 0;

        if (current == numbers.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }

        ans += dfs(numbers, target, sum + numbers[current], current + 1);
        ans += dfs(numbers, target, sum + numbers[current] * -1, current + 1);

        return ans;
    }


}
