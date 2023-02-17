package programmers.basic.level2;

public class Level2Day02 {

    /**
     * 이진 변환 반복하기
     * @param s "1"이 최소 1개이상 포함된 0과 1로 이루어진 문자열
     * @return "1"이 될때까지 이진 변환 했을때, {이진 변환 횟수, 변환과정에서 제거된 0의 갯수}
     * 이진 변환
     * 1. x의 모든 0을 제거합니다.
     * 2. x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
     */
    public int[] solution1(String s) {
        // {이진 변환 횟수, 변환과정에서 제거된 0의 갯수}
        int[] answer = new int[2];
        // "1"이 될때까지 반복
        while (!"1".equals(s)) {
            String deletedZero = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    deletedZero += s.charAt(i);
                }
            }
            int c = deletedZero.length();
            // 길이를 이진법으로 변환
            s = Integer.toBinaryString(c);
            answer[0]++;
        }
        return answer;
    }

}
