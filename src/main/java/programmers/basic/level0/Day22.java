package programmers.basic.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day22 {

    /**
     * 저주의 숫자 3
     * @param n 3 의 배수, 숫자 3 사용하지 않는다.
     * @return 3x 마을에서 사용하는 숫자로 바꾸어 리턴
     */
    public int solution1(int n) {
        int answer = 0;
        int count = 0; // 3x 제외한 숫자 카운트
        int num = 0;
        while (count < n) {
            num++;
            if (num % 3 != 0 && !String.valueOf(num).contains("3")) {
                count++;
            }
        }
        answer = num;
        return answer;
    }

    /**
     * 평행
     * @param dots 점 네 개의 좌표 (x,y)
     * @return 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0
     */
    public int solution2(int[][] dots) {
        int answer = 0;
        // 기울기가 같으면 평행
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) {
            answer = 1;
        }
        if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) {
            answer = 1;
        }
        if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) {
            answer = 1;
        }
        return answer;
    }

    private double getSlope(int[] dot1, int[] dot2) {
        // 기울기 = (y2 - y1) / (x2 - x1)
        double result = (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
        return result;
    }

    /**
     * 겹치는 선분의 길이
     * @param lines (start, end) 선분 3개의 배열
     * @return 두 개 이상의 선분이 겹치는 길이
     */
    public int solution3(int[][] lines) {
        int answer = 0;
        int[] lineCnt1 = getLineCount(lines[0][0], lines[0][1]);
        int[] lineCnt2 = getLineCount(lines[1][0], lines[1][1]);
        int[] lineCnt3 = getLineCount(lines[2][0], lines[2][1]);

        for (int i = 0; i < 200; i++) {
            int lineTotalCnt = lineCnt1[i] + lineCnt2[i] + lineCnt3[i];
            if (lineTotalCnt > 1) {
                answer++;
            }
        }
        return answer;
    }

    private int[] getLineCount(int start, int end) {
        // 좌표가 -100~100 이므로 선분은 -1 이므로 200개 생성
        int[] lineCnt = new int[200];
        for (int i = start; i < end; i++) { // (0,1) 의 경우 lineCnt[100] = 1
            lineCnt[i + 100]++;
        }
        return lineCnt;
    }

    /**
     * 유한소수 판별하기
     * @param a
     * @param b
     * @return a/b가 유한소수이면 1, 무한소수라면 2
     */
    public int solution4(int a, int b) {
        int answer = 1;
        // 최대공약수
        int gcdValue = getGCD(a, b);
        b /= gcdValue; // 분모 최대공약수로 나눠주기
        if (b == 1) {
            answer = 1; // 정수도 유한소수
        } else {
            // 분모 b 의 소인수 산출
            int[] primeList = getPrime(b);
            for (int p : primeList) {
                if (p == 2 || p == 5) {
                    continue;
                } else {
                    answer = 2;
                }
            }
        }
        return answer;
    }

    private int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }

    private int[] getPrime(int b) {
        // 소인수 리스트
        List<Integer> numList = new ArrayList<>();
        // 소수
        for (int i = 1; i <= b; i++) {
            int divideCnt = 0;
            if (b % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divideCnt++;
                    }
                    if (i > 1 && i == j && divideCnt <= 2) {
                        numList.add(i);
                    }
                }

            }
        }
        // 배열 변환
        int[] result = numList.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}
