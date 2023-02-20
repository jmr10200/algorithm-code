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

    /**
     * 숫자의 표현
     * @param n 자연수
     * @return 연속된 자연수들로 n을 표현하는 방법의 수
     */
    public int solution2(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum > n) {
                    break;
                }
                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    /**
     * 피보나치 수
     * @param n
     * @return n번째 피보나치 수를 1234567으로 나눈 나머지
     */
    public int solution3(int n) {
        int answer = 0;
        long[] fibonacci = new long[n + 1];
        fibonacci[1] = 1;
        fibonacci[2] = 1;
        // 문제 요구조건
        long divide = 1234567;
        for (int i = 3; i < n + 1; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % divide;
        }
        answer = (int) fibonacci[n];
        return answer;
    }

    /**
     * 재귀함수 사용하는 방식
     * 여러번 피보나치 수를 찾아야 하는 경우,
     * solution3() 의 방식처럼 미리 배열을 생성하고 해당 값을 배열에 저장해두는 것이 빠르다.
     * 재귀함수를 이용하면 계산했던 값을 또 계산해야하기 때문이다.
     */
    private int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return fibo(x - 1) + fibo(x - 2);
    }

    /**
     * 다음 큰 숫자
     * @param n 자연수
     * @return n의 다음 큰 숫자
     * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
     * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
     * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
     */
    public int solution4(int n) {
        int answer = 0;
        // n 을 2진수로 변환했을 때 1의 갯수
        int nCount = getBinaryOneCount(n);
        // n 보다 큰 수 중에 2진수로 변환했을때 1의 갯수가 같은 수
        int largeCount = 0;
        int largeN = n;
        while (largeCount != nCount) {
            largeN++;
            largeCount = getBinaryOneCount(largeN);
        }
        answer = largeN;
        return answer;
    }

    /**
     * 방법 1
     * 자연수 x를 2진수로 변환했을 때 1의 갯수
     */
    private int getBinaryOneCount(int x) {
        char[] chars = Integer.toBinaryString(x).toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
    /**
     * 방법 2
     * 자연수 x를 2진수 변환했을 때 1의 갯수
     * (방법 1이 더 빠르다)
     */
    private int getBinaryOneCnt(int x) {
        return Integer.toBinaryString(x).replaceAll("0", "").length();
    }

}
