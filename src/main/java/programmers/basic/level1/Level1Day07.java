package programmers.basic.level1;

import java.util.Scanner;

public class Level1Day07 {

    /**
     * 문자열 다루기 기본
     * @param s
     * @return s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인
     */
    public boolean solution1(String s) {
        boolean answer = false;
        answer = s.matches("[0-9]{4}|[0-9]{6}"); // \d{4}|\d{6} 동일
        return answer;
    }

    /**
     * 부족한 금액 계산하기
     * @param price 이용료
     * @param money 가진돈
     * @param count 횟수
     * @return 이용료는 count 번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지
     */
    public long solution2(int price, int money, int count) {
        long answer = 0;
        long totalPrice = 0;
        for (int i = 1; i <= count; i++) {
            totalPrice += (long) price * i;
        }
        answer = totalPrice - (long) money;
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }

    /**
     * 행렬의 덧셈
     * @param arr1
     * @param arr2
     * @return arr1 행렬 + arr2 행렬
     */
    public int[][] solution3(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    /**
     * 직사각형 별찍기
     */
    public String solution4(int n, int m) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /** Scanner 입력받는 경우 */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                sb.append("*");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb.toString());
//    }
}
