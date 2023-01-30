package programmers.basic.level1;

import java.util.ArrayList;
import java.util.List;

public class Level1Day16 {

    /**
     * 기사단원의 무기
     * @param number 기사단원의 수
     * @param limit 이웃나라와 협약으로 정해진 공격력의 제한수치
     * @param power 제한수치를 초과한 기사가 사용할 무기의 공격력
     * @return 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게 (공격력 1당 1kg)
     */
    public int solution1(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            // 약수 개수
            int divisors = getDivisorCount(i);
            // 제한 체크
            if (divisors > limit) {
                answer += power;
            } else {
                answer += divisors;
            }
        }
        return answer;
    }

    /**
     * 약수 개수 구하기
     * 약수 대칭성 (제곱근 이용)
     * @param number 약수의 개수를 구하는 대상이 되는 수
     * @return number 의 약수 개수
     */
    private int getDivisorCount(int number) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If divisors are equal, count only one
                if (number / i == i) {
                    cnt++;
                } else { // Otherwise count both
                    cnt = cnt + 2;
                }
            }
        }
        return cnt;
    }
}
