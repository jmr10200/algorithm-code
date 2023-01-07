package programmers.basic.level1;

import java.util.*;

public class Level1Day12 {

    /**
     * 모의고사
     * @param answers
     * @return 가장 많은 문제를 맞힌 사람 배열, 여럿인 경우 오름차순 정렬
     */
    public int[] solution1(int[] answers) {
        int[] answer = {};
        // 1번 수포자 : 1,2,3,4,5, ... (5개)
        int[] user1 = {1, 2, 3, 4, 5};
        // 2번 수포자 : 2,1,2,3,2,4,2,5, ... (8개)
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        // 3번 수포자 : 3,3,1,1,2,2,4,4,5,5, ... (10개)
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int user1Length = user1.length;
        int user2Length = user2.length;
        int user3Length = user3.length;

        int[] count = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == user1[i % user1Length]) {
                count[0]++;
            }
            if (answers[i] == user2[i % user2Length]) {
                count[1]++;
            }
            if (answers[i] == user3[i % user3Length]) {
                count[2]++;
            }
        }
        // 가장 높은 점수
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        // 높은 점수 동점자 확인
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                result.add(i + 1);
            }
        }
        answer = result.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    /**
     * 소수 만들기
     * @param nums
     * @return nums 에서 3개를 합친 수가 소수가 되는 개수
     */
    public int solution2(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int n = j + 1; n < nums.length; n++) {
                    int sum = nums[i] + nums[j] + nums[n];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    /**
     * 소수판별
     * @param sum
     * @return 소수이면 true 아니면 false
     */
    private boolean isPrime(int sum) {
        boolean result = true;
        int divideCnt = 0;
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                divideCnt++;
            }
            if (divideCnt > 2) {
                result = false;
            }
        }
        return result;
    }

    /**
     * 콜라 문제
     * @param a 콜라를 받기 위해 마트에 주어야 하는 병 수
     * @param b 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수
     * @param n 가지고 있는 빈 병의 개수
     * @return n 개 가져다주면 몇개 받을 수 있는가.
     */
    public int solution3(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            answer += (n / a) * b;
//            n = n - (n - (n % a)) + ((n / a) * b);
            n = (n % a) + ((n / a) * b);
        }
        return answer;
    }

    /**
     * 실패율
     * @param N 전체 스테이지의 개수
     * @param stages 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
     * @return 실패율 내림차순 배열 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
     * N + 1 마지막 스테이지 (N 번째 스테이지) 까지 클리어 한 사용자
     */
    public int[] solution4(int N, int[] stages) {
        int[] answer = new int[N];
        int userNumbers = stages.length; // 전체 유저수
        int[] stageUser = new int[N + 2]; // +2 로 유저수 인덱스화
        // 스테이지 유저 수
        for (int i = 0; i < userNumbers; i++) {
            stageUser[stages[i]]++;
        }

        // key : 스테이지 번호 , value : 실패율
        Map<Integer, Double> failRatioMap = new HashMap<>();
        // 실패율 배열
        int user = 0;
        for (int i = 0; i <= N; i++) {
            if (userNumbers - user == 0) {
                failRatioMap.put(i + 1, 0.0);
            } else {
                failRatioMap.put(i + 1, (double) stageUser[i + 1] / (userNumbers - user));
            }
            user += stageUser[i + 1];
        }
        // value 값으로 key 내림차순 정렬
        List<Integer> keyList = new ArrayList<>(failRatioMap.keySet());
        Collections.sort(keyList, (o1, o2) -> (failRatioMap.get(o2).compareTo(failRatioMap.get(o1))));

        // 결과배열 설정
        int idx = 0;
        for (Integer key : keyList) {
            if (key <= N) {
                answer[idx] = key;
                idx++;
            }
        }
        return answer;
    }
}
