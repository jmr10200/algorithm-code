package programmers.basic.level0;

/**
 * 사칙연산, 조건문, 배열
 */
public class Day02 {
    /**
     * 두 수의 나눗셈
     */
    public int solution1(int num1, int num2) {
        double doubleAnswer = (double) num1 / num2;
        return (int)(doubleAnswer * 1000);
    }

    /**
     * 숫자 비교하기
     */
    public int solution2(int num1, int num2) {
        if(num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * 분수의 덧셈
     * @param denum1 분자 1
     * @param num1 분모 1
     * @param denum2 분자 2
     * @param num2 분모 2
     * @return 두 분수 합의 기약분수의 분자 + 분모
     */
    public int[] solution3(int denum1, int num1, int denum2, int num2) {
        int[] answer = {};
        int denum = (denum1 * num2) + (denum2 * num1);
        int num = (num1 * num2);

        int min = (denum < num) ? denum : num;
        int gcd = 0;

        for(int i = 1; i <= min; i++) {
            if (denum % i == 0 && num % i == 0) {
                gcd = i;
            }
        }
        denum /= gcd;
        num /= gcd;
        answer = new int[]{denum, num};
        return answer;
    }

    /**
     * 배열 두 배 만들기
     */
    public int[] solution4(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
