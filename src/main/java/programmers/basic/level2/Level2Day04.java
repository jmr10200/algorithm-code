package programmers.basic.level2;

public class Level2Day04 {

    /**
     * 예상 대진표
     * @param n 참가자 수
     * @param a
     * @param b
     * @return 첫 라운드에서 a번 참가자는 b번 참가자와 몇번째 라운드에서 만나는가? (만날떄까지 두 참가자는 무조건 이긴다)
     * N-1 번과 N 번의 대결이 최종 한명이 남을 때까지 반복, 다음라운드 1번부터 N/2번을 차례대로 배정
     */
    public int solution1(int n, int a, int b) {
        int answer = 0;
        int roundCount = 0;
        while (n > 1) {
            // 라운드 카운트
            roundCount++;
            // a > b 일때, a가 짝수이고, b = a - 1 의 연속숫자인지 확인 (반대의 경우도)
            if ((a > b && a % 2 == 0 && a - 1 == b) || (a < b && b % 2 == 0 && b - 1 == a)) {

                answer = roundCount;
                return answer;
            } else {
                // 만나지 않으면 참가자수 반으로 줄이기
                n = n / 2;
                a = (a % 2 == 0) ? a / 2 : (a + 1) / 2;
                b = (b % 2 == 0) ? b / 2 : (b + 1) / 2;
            }
        }
        // 만나지 않으면?
        if (n == 1) {
            answer = 0;
        }
        return answer;
    }

}
