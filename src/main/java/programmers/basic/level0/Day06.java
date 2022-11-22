package programmers.basic.level0;

import java.util.Scanner;

public class Day06 {

    /**
     * 문자열 뒤집기
     * @param my_string
     * @return 뒤집어진 문자열
     */
    public String solution1_1(String my_string) {
        String answer = "";
        char[] strArray = my_string.toCharArray();
        for (char str :strArray){
            answer = String.valueOf(str).concat(answer);
        }
        return answer;
    }
    /**
     * 문자열 뒤집기 : StringBuilder
     * @param my_string
     * @return 뒤집어진 문자열
     */
    public String solution1_2(String my_string) {
        StringBuilder sb = new StringBuilder(); // import java.util.*;
        sb.append(my_string);
        return sb.reverse().toString();
    }

    /**
     * 직각삼각형 출력하기
     * @param num
     */
    public void solution2(int num) {
        StringBuilder sb = new StringBuilder(); // import java.util.*;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    /**
     * 짝수 홀수 개수
     * @param num_list
     * @return {짝수 개수, 홀수 개수}
     */
    public int[] solution3(int[] num_list) {
        int even = 0; //짝수
        int odd = 0; //홀수
        for (int num : num_list) {
            if(num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }

    /**
     * 문자 반복 출력하기
     * @param my_string
     * @param n
     * @return n번 반복출력 된 문자열
     */
    public String solution4(String my_string, int n) {
        String[] strArray = my_string.split("");
        StringBuilder sb = new StringBuilder(); // import java.util.*;
        for (String str : strArray) {
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
