package programmers.basic.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1Day11 {

    /**
     * 두 개 뽑아서 더하기
     * @param numbers
     * @return 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수의 오름차순 배열
     */
    public int[] solution1(int[] numbers) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }
        answer = result.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    /**
     * 2016년
     * @param a
     * @param b
     * @return 2016년 1월 1일은 금요일, 윤년. 2016년 a월 b일은 무슨 요일?
     */
    public String solution2(int a, int b) {
        String answer = "";
        // 날짜를 7로 나누어 요일계산
        // 금요일부터 [날짜 % 7] 의 결과 :  0(금),1(토),2(일),3(월),4(화),5(수),6(목) 의 반복
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        // 윤년의 각 월 날짜수
        int[] monthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;
        // 월 만큼 날짜 계산
        for (int i = 0; i < a - 1; i++) {
            totalDay += monthDay[i];
        }
        // 요일 계산
        answer = day[(totalDay + b - 1) % 7]; // (전체 날짜 - 인덱스 1) % 7
        return answer;
    }

    /**
     * 폰켓몬
     * @param nums 1 이상 10,000 이하, 항상 짝수
     * @return N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수
     */
    public int solution3(int[] nums) {
        int answer = 0;
        // 선택하는 수
        int selectCnt = nums.length / 2;

        // 중복 제거 한 nums 의 원소 수
        long numsCount = Arrays.stream(nums).distinct().count();
        if (selectCnt <= numsCount) {
            answer = selectCnt;
        } else {
            answer = (int) numsCount;

        }

        return answer;
    }

    /**
     * 소수 찾기
     * @param n
     * @return 1부터 입력받은 숫자 n 사이에 있는 소수의 개수
     */
    public int solution4(int n) {
        int answer = 0;
        // 아래와 같은 방법으로는 효율성 X , 불필요한 계산이 너무 많다.
//        int divideCount = 0;
//        for (int i = 1; i <= n; i++) {
//            int j = 1;
//            divideCount = 0;
//            while (j <= i) {
//                if (i % j == 0) {
//                    divideCount++;
//                }
//                if (i != 1 && j == i && divideCount <= 2) {
//                    answer++;
//                }
//                j++;
//            }
//        }
        // 에라토스테네스의 체
        boolean primeCheck[] = new boolean[n + 1]; // boolean 배열, false 초기화

        // 0, 1 을 제외하고 2부터 배수 제외
        for (int i = 2; i <= n; i++) {
            if (primeCheck[i] == true) {
                continue;
            }
            // 자기자신 (2, 3, ...) 제외한 배수 = true
            for (int j = i + i; j <= n; j += i) {
                primeCheck[j] = true;
            }
        }
        // 소수 = false 원소 카운트
        for (int i = 2; i <= n; i++) {
            if (!primeCheck[i]) {
                answer++;
            }
        }
        return answer;
    }
}
