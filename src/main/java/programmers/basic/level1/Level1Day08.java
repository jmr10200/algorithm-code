package programmers.basic.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level1Day08 {

    /**
     * 최대공약수와 최소공배수
     * @param n
     * @param m
     * @return n, m 두 수의 {최대공약수, 최소공배수}
     */
    public int[] solution1(int n, int m) {
        int[] answer = new int[2];
        int max = n > m ? n : m;
        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i; // 최대공약수
                answer[1] = i * (n / i) * (m / i); // 최소공배수
            }
        }
        return answer;
    }

    /**
     * 같은 숫자는 싫어
     * @param arr
     * @return 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거 후 배열 arr 의 원소들의 순서를 유지한 배열
     */
    public int[] solution2(int[] arr) {
        int[] answer = {};
        List<Integer> distinctArr = new ArrayList<>();
        distinctArr.add(arr[0]); // 첫번째
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                distinctArr.add(arr[i]);
            }
        }
        answer = distinctArr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    /**
     * 이상한 문자 만들기
     * @param s
     * @return 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열
     * (반례 1) s가 대문자, 소문자 섞여있는 경우
     * (반례 2) 공백이 2개이상인 경우
     * (반례 3) 마지막이 공백인 경우 or 공백이 아닌 경우
     */
    public String solution3(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] splitStr = s.toLowerCase().split(""); // 반례 s가 대문자,소문자 섞인 경우
        int cnt = 0;
        for (int i = 0; i < splitStr.length; i++) {
            if (" ".equals(splitStr[i])){
                sb.append(" "); // 공백
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    sb.append(splitStr[i].toUpperCase()); // 짝수번째
                } else {
                    sb.append(splitStr[i].toLowerCase()); // 홀수번째
                }
                cnt++;
            }
        }
        answer = sb.toString();
        return answer;
    }

    /**
     * 3진법 뒤집기
     * @param n
     * @return n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수
     * n 진법 n 진수
     * Integer.toString(int num, int radix)
     * n 진수 -> 10 진수 변환
     * Integer.parseInt(String s, int radix)
     */
    public int solution4(int n) {
        int answer = 0;
        // 3진법
        String[] trinaryNums = Integer.toString(n, 3).split("");
        // 뒤집기
        String[] reverseNums = new String[trinaryNums.length];
        for (int i = 1; i <= trinaryNums.length; i++) {
            reverseNums[i - 1] = trinaryNums[trinaryNums.length - i];
        }
        // 10진법 변환
        String reversNum = Arrays.stream(reverseNums).collect(Collectors.joining());
        answer = Integer.parseInt(reversNum, 3);
        return answer;
    }


}
