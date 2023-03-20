package programmers.basic.level2;

public class Level2Day08 {

    /**
     * k진수에서 소수 개수 구하기
     *
     * @param n 양의 정수
     * @param k 양의 정수 n을 k 진수로 바꾼다.
     * @return 양의 정수 n 을 k 진수로 바꿨을 때, 변환된 수 안에 아래 조건에 맞는 소수(Prime number) 의 개수
     * <p>
     * 0P0처럼 소수 양쪽에 0이 있는 경우
     * P0처럼 소수 오른쪽에만 0이 있고 왼쪽에는 아무것도 없는 경우
     * 0P처럼 소수 왼쪽에만 0이 있고 오른쪽에는 아무것도 없는 경우
     * P처럼 소수 양쪽에 아무것도 없는 경우
     * 단, P는 각 자릿수에 0을 포함하지 않는 소수입니다. 예를 들어, 101은 P가 될 수 없습니다.
     */
    public int solution1(int n, int k) {
        int answer = 0;
        String kNumber = getConventKNumber(n, k);
        // 0으로 자르기
        String[] split = kNumber.split("0");

        for (String s : split) {
            if (!"".equals(s) && isPrimeNumber(s)) {
                answer++;
            }
        }
        return answer;
    }

    /**
     * 10진수를 k진수로 변환
     *
     * @param num 양의 정수 (10진수)
     * @param k
     * @return k진수로 변환
     */
    private String getConventKNumber(int num, int k) {
        String result = "";
        if (num == 0) {
            return "0";
        }

        while (num > 0) {
            int share = num / k;
            int remainder = num % k;
            if (remainder > 9) {
                result = (char) (remainder + 55) + result;
            } else {
                result = remainder + result;
            }
            num = share;
        }
        return result;
    }

    /**
     * 소수 판별
     */
    private boolean isPrimeNumber(String num) {
        // Long 일수 있다.
        Long n = Long.valueOf(num);
        boolean result = true;
        if (n == 1) {
            result = false;
            return result;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = false;
            }
        }

        return result;
    }



}
