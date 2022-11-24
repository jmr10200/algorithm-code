package programmers.basic.level0;

public class Day07 {

    /**
     * 특정문자 제거하기
     * @param my_string
     * @param letter
     * @return
     */
    public String solution1(String my_string, String letter) {
        String[] strSplit = my_string.split(letter);
        StringBuilder answer = new StringBuilder();
        for (String str : strSplit) {
            answer.append(str);
        }
        return answer.toString();
    }

    /**
     * 각도기
     * @param angle
     * @return
     */
    public int solution2(int angle) {
        int answer = 0;
        if (angle == 180) {
            answer = 4;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else if (angle == 90) {
            answer = 2;
        } else if (0 < angle && angle < 90){
            answer = 1;
        }
        return answer;
    }

    /**
     * 양꼬치
     * @param n 양꼬치 @12000
     * @param k 음료 @2000 (양꼬치 10개당 1개 서비스)
     * @return
     */
    public int solution3(int n, int k) {
        int answer = 0;
        // 양꼬치 10개 확인
        int count = n / 10;
        // 음료수 서비스 체크
        if (count > 0 && count <= k) {
            k -= count;
        }
        // 가격계산
        answer = (12000 * n) + (2000 * k);
        return answer;
    }

    /**
     * 짝수의 합
     * @param n
     * @return n 이하 짝수 합
     */
    public int solution4(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
