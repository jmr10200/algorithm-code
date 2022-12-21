package programmers.basic.level0;

import java.util.Arrays;

public class Day24 {

    /**
     * 치킨 쿠폰
     * @param chicken 시켜먹은 치킨의 수, 한 마리당 1장, 서비스 치킨도 1장
     * @return 10장당 1마리, 받을 수 있는 최대 서비스 치킨의 수
     */
    public int solution1(int chicken) {
        int answer = 0;
        int coupon = chicken; // 현재 쿠폰수
        while (coupon / 10 != 0) {
            answer += coupon / 10; // 현재 가진 쿠폰 수만큼 서비스 수
            coupon = coupon - (coupon / 10) * 10 + (coupon / 10); // 남은 쿠폰 + 서비스로 받는 쿠폰
        }
        return answer;
    }

    /**
     * 이진수 더하기
     * @param bin1 0 을 제외하고 0으로 시작하지 않음
     * @param bin2
     * @return 두 이진수의 합
     */
    public String solution2(String bin1, String bin2) {
        String answer = "";
        // 2진수 -> 10진수 변환
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int result = num1 + num2;
        // 10진수 -> 2진수 변환
        answer = Integer.toBinaryString(result);
        return answer;
    }

    /**
     * A로 B 만들기
     * @param before
     * @param after before 길이 == after 길이
     * @return before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0
     */
    public int solution3(String before, String after) {
        int answer = 0;
        String[] splitBefore = before.split("");
        String[] splitAfter = after.split("");
        Arrays.sort(splitBefore);
        Arrays.sort(splitAfter);
        for (int i = 0; i < splitBefore.length; i++) {
            if (splitBefore[i].equals(splitAfter[i])) {
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }
        return answer;
    }

    /**
     * k의 개수
     * @param i
     * @param j
     * @param k
     * @return i부터 j까지 k가 몇 번 등장하는지
     */
    public int solution4(int i, int j, int k) {
        int answer = 0;
        for (int n = i; n <= j; n++) {
            String[] splitNum = String.valueOf(n).split("");
            for (String num : splitNum) {
                if (k == Integer.valueOf(num)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
