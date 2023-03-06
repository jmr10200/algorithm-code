package programmers.algorithm;

/**
 * LCM : 최소공배수
 * GCD : 최대공약수
 * 유클리드 호제법
 */
public class Euclidean {

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
}
