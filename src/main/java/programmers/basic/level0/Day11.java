package programmers.basic.level0;

import java.util.Arrays;

public class Day11 {

    /**
     * 주사위의 개수
     * @param box
     * @param n
     * @return
     */
    public int solution1(int[] box, int n) {
        int answer = 1;
        int[] cube = new int[3];
        for (int i = 0; i < box.length; i++) {
            cube[i] = box[i] / n;
        }
        for (int c : cube) {
            answer *= c;
        }
        return answer;
    }

    /**
     * 합성수 찾기
     * @param n
     * @return
     */
    public int solution2(int n) {
        int answer = 0;
        int primeNumCnt = 0; // 소수 개수
        int divideCount = 0; // 나눠지는 수 카운트
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                primeNumCnt++;
            }else {
                int j = 1;
                divideCount = 0;
                while (j <= i) {
                    if (i % j == 0) {
                        divideCount++;
                    }
                    if (j == i && divideCount <= 2) {
                        primeNumCnt++;
                    }
                    j++;
                }
            }
        }
        answer = n - primeNumCnt;
        return answer;
    }

    /**
     * 최댓값 만들기 (1)
     * @param numbers
     * @return
     */
    public int solution3(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }

    /**
     * 팩토리얼
     * @param n
     * @return i! ≤ n 을 만족하는 가장큰수 i
     */
    public int solution4(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int factorialNum = factorial(i);
            if (factorialNum > n) {
                return answer;
            }
            answer = i;
        }
        return answer;
    }

    private int factorial(int num) {
        int result = 1;
        if (num <= 1) {
            return result;
        }
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
