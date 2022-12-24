package programmers.basic.level1;

public class Level1Day01 {

    /**
     * 짝수와 홀수
     * @param num
     * @return 짝수인 경우 "Even", 홀수인 경우 "Odd"
     */
    public String solution1(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    /**
     * 평균 구하기
     * @param arr
     * @return 배열 arr 의 평균값
     */
    public double solution2(int[] arr) {
        double answer = 0;
        int total = 0;
        int cnt = 0;
        for (int a : arr) {
            total += a;
            cnt++;
        }
        answer = (double) total / cnt;
        return answer;
    }

    /**
     * 약수의 합
     * @param n
     * @return n의 약수를 모두 더한 값
     */
    public int solution3(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

    /**
     * 자릿수 더하기
     * @param n
     * @return N의 각 자릿수의 합
     */
    public int solution4(int n) {
        int answer = 0;
        String[] splitN = String.valueOf(n).split("");
        for (String s : splitN) {
            answer += Integer.valueOf(s);
        }
        return answer;
    }

}
