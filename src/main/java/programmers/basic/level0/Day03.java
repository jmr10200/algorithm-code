package programmers.basic.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 사칙연산, 배열, 수학
 */
public class Day03 {

    /**
     * 나머지 구하기
     */
    public int solution1(int num1, int num2) {
        return num1 % num2;
    }

    /**
     * 중앙값 구하기
     *
     * @param array
     * @return 중앙값
     */
    public int solution2_1(int[] array) {
        // 정렬하기
        int minIdx = 0;
        for(int i = 0; i < array.length; i++) {
            minIdx = i;
            for(int j = i + 1 ; j < array.length ; j++) {
                if(array[minIdx] <= array[j]){
                    minIdx = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = tmp;
        }
        // 데이터 개수가 홀수라면 가운데 값
        // 데이터 개수가 짝수라면 평균값이지만, 문제는 홀수 제한
        int midIdx = (array.length / 2);
        return array[midIdx];
    }

    /**
     * 중앙값 구하기 2 : Arrays 이용하는 방법
     * 패키지 임포트 : import java.util.*;
     * @param array
     * @return 중앙값
     */
    public int solution2_2(int[] array) {
        // Arrays 이용하여 정렬
        Arrays.sort(array);

        // 데이터 개수가 홀수라면 가운데 값
        // 데이터 개수가 짝수라면 평균값이지만, 문제는 홀수 제한
        int midIdx = (array.length / 2);
        return array[midIdx];
    }

    /**
     * 최빈값 구하기
     * @param array
     * @return 최빈값, 최빈값이 복수인 경우 -1
     */
    public int solution3(int[] array) {
        // 정렬
        Arrays.sort(array);
        // 카운트 배열 생성
        int[] count = new int[array[array.length - 1] + 1];
        // 인덱스 : 해당 숫자, 값: 빈도수 형태로 배열생성
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            count[array[i]]++;
        }

        int maxValue = 0; // 최빈값의 빈도수
        int maxIdx = 0; // 최빈값
        // 최빈값 확인
        for (int i = 0; i < count.length; i++) {
            if (maxValue < count[i]) {
                maxValue = count[i];
                maxIdx = i;
            }
        }
        // 해당 최빈값이 같은 데이터가 존재하는지 확인
        for (int i = 0; i < count.length; i++) {
            if (maxIdx != i && maxValue == count[i]) {
                return -1; // -1 리턴
            }
        }
        return maxIdx;
    }


    /**
     * 짝수는 싫어요
     * @param n
     * @return n 이하의 홀수 오름차순 정렬한 배열
     */
    public int[] solution4(int n) {
        int arrayNum;
        // n 에 의한 배열 크기 산정
        if(n % 2 == 0) {
            arrayNum = n / 2; // n이 짝수
        } else {
            arrayNum = n / 2 + 1; // n이 홀수
        }
        // 배열 생성
        int[] answer = new int[arrayNum];

        // n 이하의 홀수 배열 구하기
        int idx = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) { // 홀수일때
                answer[idx] = i; // 배열에 추가
                idx++; // 배열 추가되면 인덱스+1
            }
        }
        return answer;
    }
}
