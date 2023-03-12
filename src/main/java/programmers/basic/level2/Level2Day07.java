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
            // 1이면? (0) (1) (2) (3) (4)  = 7 9 1 1 4
            // 2이면? (0,1) (1,2) (2,3) (3,4), (4,0) = 16 10 2 5 11
            // 3이면? (0,1,2) (1,2,3) (2,3,4) (3,4,0) (4,0,1) = 17 11 6 12 20
            // 4이면? (0,1,2,3) (1,2,3,4) (2,3,4,0) (3,4,0,1) (4,0,1,2) = 18 15 13 21 21
            // 5이면? (0,1,2,3,4) = 22
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

}
