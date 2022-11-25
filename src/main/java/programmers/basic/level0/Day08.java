package programmers.basic.level0;

import java.util.*;

public class Day08 {

    /**
     * 배열 자르기
     * @param numbers
     * @param num1
     * @param num2
     * @return num1 인덱스 ~ num2 인덱스로 자른 numbers 배열
     */
    public int[] solution1(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int idx = 0;
        for (int i = num1; i <= num2; i++) {
            answer[idx] = numbers[i];
            idx++;
        }
        return answer;
    }

    /**
     * 외계행성의 나이
     * @param age
     * @return a=0, b=1, c=2, d=3, e=4, f=5, g=6, h=7, i=8, j=9
     */
    public String solution2(int age) {
        String answer = "";
        String[] strAge = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        Map<String, String> proAge = new HashMap<>(); // import java.util.*;
        int num = 0;
        for (String str : strAge) {
            proAge.put(String.valueOf(num), str);
            num++;
        }
        String[] splitAge = String.valueOf(age).split("");
        for (String s : splitAge) {
            answer += proAge.get(s);
        }
        return answer;
    }

    /**
     * 진료순서 정하기
     * @param emergency 응급도
     * @return 응급도 순서배열
     */
    public int[] solution3(int[] emergency) {
        int[] answer = new int[emergency.length];
        // 인덱스 부여, Map 에 넣어놓기 (순서 Linked)
        Map<Integer, Integer> emergencyMap = new LinkedHashMap<>();
        int num = 0; // 인덱스
        for (int e : emergency) {
            emergencyMap.put(e, num); // {응급도, 인덱스}
            num++;
        }
        // 정렬
        Arrays.sort(emergency);
        int emergencyNum = emergency.length;
        // 인덱스 순으로 응급도 리턴
        for (int e : emergency) { // 작은거부터, 응급도 낮은순서부터
            answer[emergencyMap.get(e)] = emergencyNum; // 응급도로 인덱스 검색
            emergencyNum--;
        }
        return answer;
    }

    /**
     * 순서쌍의 개수
     * @param n
     * @return (a,b) 일때 a * b == n 인 개수
     */
    public int solution4(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}
