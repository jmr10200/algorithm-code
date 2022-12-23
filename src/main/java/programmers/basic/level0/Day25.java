package programmers.basic.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Day25 {

    /**
     * 문자열 밀기
     * @param A
     * @param B
     * @return A 를 밀어서 B가 될 수 있다면 몇 번 밀어야 하는지 횟수, B가 될 수 없으면 -1
     */
    public int solution1(String A, String B) {
        int answer = 0;
        // A 와 B 가 같으면 0번
        if (A.equals(B)) {
            return answer;
        }
        String[] splitA = A.split("");
        String temp = "";
        for (int i = 0; i < splitA.length; i++) {
            // A 의 맨 마지막 글자
            temp = splitA[splitA.length - 1];
            // A 를 뒤에서부터 오른쪽으로 하나씩 밀기
            for (int j = splitA.length - 1; j >= 1; j--) {
                splitA[j] = splitA[j - 1];
            }
            // A 의 맨 마지막 글자 맨 앞으로
            splitA[0] = temp;
            answer++;
            String pushA = Arrays.stream(splitA).collect(Collectors.joining()); // import java.util.stream.*;
            if (B.equals(pushA)) {
                return answer;
            }
        }
        answer = -1;
        return answer;
    }

    /**
     * 종이 자르기
     * @param M
     * @param N
     * @return M x N 크기의 종이를 1 x 1 크기로 자르기위한 최소 가위질 수, 겹쳐자를 수 없다.
     */
    public int solution2(int M, int N) {
        int answer = 0;
        if (M == 1 && N == 1) {
            return answer;
        } else {
            int cutM = M - 1; // M 자르기
            int cutN = N - 1; // N 자르기
            answer = cutM + cutN * M;
        }
        return answer;
    }

    /**
     * 연속된 수의 합
     * @param num
     * @param total
     * @return 연속된 수 num 개를 더한 값이 total 이 될 때, 정수 배열
     */
    public int[] solution3(int num, int total) {
        int[] answer = new int[num];
        // (x+1)+(x+2)+(x+3)+(x+4)+(x+5)... = total 등차수열 이용
        // nx + (1 + ... + n) = total
        int nSum = num * (1 + num) / 2; // num 의 합 : (1 + ... + n) 해당하는 부분의 합
        int startNum = (total - nSum) / num; // nx 에서의 x 값 (초항이됨)
        for (int i = 1; i < num + 1; i++) {
            answer[i - 1] = i + startNum;
        }
        return answer;
    }

    /**
     * 다음에 올 숫자
     * @param common 등차수열 혹은 등비수열 , 공비가 0 인 경우는 없음
     * @return 마지막 원소 다음으로 올 숫자
     */
    public int solution4(int[] common) {
        int answer = 0;
        int[] difference = new int[common.length - 1]; // 공차
        int[] ratio = new int[common.length - 1]; // 공비
        for (int i = 1; i < common.length; i++) {
            difference[i - 1] = common[i] - common[i - 1];
            if(common[i] != 0 && common[i - 1] != 0) { // 원소가 0인 경우 등차수열
                ratio[i - 1] = common[i] / common[i - 1];
            }
        }
        if (isDifference(difference)) {
            answer = common[common.length - 1] + difference[0];
        } else {
            answer = common[common.length - 1] * ratio[0];
        }
        return answer;
    }

    private boolean isDifference(int[] difference) {
        long differCnt = Arrays.stream(difference).distinct().count();
        boolean result = false;
        if (differCnt == 1) {
            result = true;
        }
        return result;
    }
}
