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

    /**
     * N개의 최소공배수
     * @param arr
     * @return arr 배열에 담긴 숫자들의 최소공배수
     */
    public int solution2(int[] arr) {
        int answer = 0;
        int lcm = arr[0]; // 최소공배수

        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(arr[i], lcm);
        }
        answer = lcm;
        return answer;
    }

    // GCD = 최대공약수 , LCM = 최소공배수
    // 두 수 (a, b)의 최소공배수 = a x b = GCD * LCM
    // LCM (최소공배수) = a x b / GCD(a,b) (두 수의 최대공약수)

    /** LCM 최소공배수 */
    public int getLCM(int a, int b) {

        return a * b / getGCD(a, b);
    }

    /** GCD 최대공약수 */
    public int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    /**
     * 유클리드 호제법
     * 두 수 a, b가 있을 때 (a > b)
     * a % b == 0 이면 b가 GCD (최소공배수)
     * a % b != 0 이면 (c = a % b라고 할 때)
     * b % c를 구해서 0이 나올때까지 반복
     */
    private int euclidean(int a, int b) {
        if (b == 0)
            return a;
        return euclidean(b, a % b);
    }

    /**
     * 점프와 순간이동
     * @param n 이동하려는 거리
     * @return 사용해야 하는 건전지 사용량의 최솟값
     * 한 번에 K 칸을 앞으로 점프하거나, (현재까지 온 거리) x 2 에 해당하는 위치로 순간이동
     * 순간이동을 하면 건전지 사용량이 줄지 않지만, 앞으로 K 칸을 점프하면 K 만큼의 건전지 사용
     */
    public int solution3(int n) {
        int ans = 0;
        int battery = 0;
        while (n > 1) {
            // 순간이동 가능하면 순간이동
            if (n % 2 == 0) {
                n /= 2;
            } else {
                // 아니면 점프
                n = n - 1;
                battery++;
            }
        }
        // 순간이동 할 수 없는 남은거리 점프
        if (n > 0) {
            battery = battery + n;
        }
        ans = battery;
        return ans;
    }

}
