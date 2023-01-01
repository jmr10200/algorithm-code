package programmers.basic.level1;

import java.util.Arrays;

public class Level1Day09 {

    /**
     * 예산
     * @param d 부서별로 신청한 금액이 들어있는 배열
     * @param budget 예산
     * @return 최대로 물품을 지원할 수 있는 부서 수
     * 그리디 greedy
     */
    public int solution1(int[] d, int budget) {
        int answer = 0;
        // 오름차순 정렬
        Arrays.sort(d);
        int cnt = 0; // 카운트
        for (int n : d) {
            if (budget - n >= 0) {
                budget -= n;
                cnt++;
            }
        }
        answer = cnt;
        return answer;
    }

    /**
     * 시저 암호
     * 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식
     * @param s
     * @param n
     * @return s 를 n 만큼 민 암호
     * 아스키 ASCII 코드 이용
     *  대문자 : 65 ~ 90
     *  소문자 : 97 ~ 122
     */
    public String solution2(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                    // 대문자
                    idx = s.charAt(i) + n;
                    if (idx > 90) {
                        idx -= 26;
                    }
                } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    // 소문자
                    idx = s.charAt(i) + n;
                    if (idx > 122) {
                        idx -= 26;
                    }
                }
                sb.append((char) idx);
            } else {
                sb.append(" ");
            }
        }
        answer = sb.toString();
        return answer;
    }

    /**
     * 최소직사각형
     * @param sizes {가로길이, 세로길이} 의 배열
     * @return 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기 : 가로길이 x 세로길이
     */
    public int solution3(int[][] sizes) {
        int answer = 0;
        // {가로길이, 세로길이} 에서 가로길이가 무조건 길도록 셋팅
        int maxWidth = 0;
        int minHeight = 0;
        for (int[] s : sizes) {
            if (s[0] < s[1]){
                // 세로길이가 더 긴 명함의 경우 스와프
                int heightTmp = s[1];
                s[1] = s[0];
                s[0] = heightTmp;
            }
            maxWidth = maxWidth < s[0] ? s[0] : maxWidth;
            minHeight = minHeight < s[1] ?   s[1] : minHeight;
        }
        answer = maxWidth * minHeight;
        return answer;
    }

    /**
     * [1차] 비밀지도
     * @param n
     * @param arr1
     * @param arr2
     * @return 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열
     */
    public String[] solution4(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        String format = "%0" + n + "d";
        for (int i = 0; i < n; i++) {
            // 10진수 -> 2진수 변환
            String[] arr1Binary = String.format(format, Long.valueOf(Long.toBinaryString(arr1[i]))).split("");
            String[] arr2Binary = String.format(format, Long.valueOf(Long.toBinaryString(arr2[i]))).split("");
            for (int j = 0; j < n; j++) {
                if ("1".equals(arr1Binary[j]) || "1".equals(arr2Binary[j])) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
            sb = new StringBuilder();
        }
        return answer;
    }
}
