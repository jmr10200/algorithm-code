package programmers.basic.level0;

import java.time.*;

public class Day05 {

    /**
     * 옷가게 할인받기
     * @param price 구입액
     * @return 할인받은 금액
     */
    public int solution1(int price) {
        int answer = 0;
        if(price >= 500000) { // 50만원 이상 20%할인
            answer = (int) (price * 0.8);
        } else if(price >= 300000) { // 30만원 이상 10%할인
            answer = (int) (price * 0.9);
        } else if(price >= 100000) { // 10만원 이상 5%할인
            answer = (int) (price * 0.95);
        } else {
            answer = price;
        }
        return answer;
    }

    /**
     * 아이스 아메리카노 (5,500원)
     * @param money 현재 가진 돈
     * @return {최대로 마실수있는 아메리카노 잔 수, 남는 돈}
     */
    public int[] solution2(int money) {
        int americanoPrice = 5500; // 아메리카노 가격
        int cup = 0; // 잔 수
        int change = 0; // 잔돈
        if(money < americanoPrice){
            change = money;
        } else {
            cup = money / americanoPrice;
            change = money - (americanoPrice * cup);
        }
        return new int[]{cup, change};
    }

    /**
     * 나이 출력
     * @param age 나이
     * @return 태어난 년도 계산 (2022기준)
     */
    public int solution3(int age) {
        int year = LocalDateTime.now().getYear(); // import java.time.*;
//        int year = 2022;
        return year - age + 1;
    }

    /**
     * 배열 뒤집기
     * @param num_list 주어진 배열
     * @return 순서가 뒤집어진 배열
     */
    public int[] solution4(int[] num_list) {
        int[] answer = new int[num_list.length]; // 입력받은 배열수 만큼 리턴할 배열 생성
        int idx = num_list.length - 1; // 배열의 마지막 인덱스
        for (int num : num_list) {
            answer[idx] = num; // 뒤에서부터 입력
            idx--;
        }
        return answer;
    }

    /**
     * 배열 뒤집기 : Collection 이용하는 방법
     * @param num_list 주어진 배열
     * @return 순서가 뒤집어진 배열
     */
    public int[] solution4_2(int[] num_list) {
        // TODO Collection : import java.util.*;
        int[] answer = new int[num_list.length]; // 입력받은 배열수 만큼 리턴할 배열 생성
        int idx = num_list.length - 1; // 배열의 마지막 인덱스
        for (int num : num_list) {
            answer[idx] = num; // 뒤에서부터 입력
            idx--;
        }
        return answer;
    }
}
