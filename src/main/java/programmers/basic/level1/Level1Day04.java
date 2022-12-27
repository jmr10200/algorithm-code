package programmers.basic.level1;

import java.util.*;

public class Level1Day04 {

    /**
     * 콜라츠 추측
     * @param num
     * @return 1 이 될때까지 반복하는 횟수
     */
    public int solution1(int num) {
        int answer = 0;
        long longNum = (long) num;
        while (longNum != 1) {
            if (longNum % 2 == 0) {
                longNum /= 2; // 짝수면 나누기 2
            } else {
                longNum = longNum * 3 + 1; // 홀수면 3 곱하고 1 더하기
            }
            answer++;
            if (longNum == 1) {
                break; // 1 이 되면 리턴
            }
            if (answer == 500) {
                answer = -1; // 500번 이면 -1
                break;
            }
        }
        return answer;
    }

    /**
     * 서울에서 김서방 찾기
     * @param seoul
     * @return 배열 seoul 의 element 중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"
     */
    public String solution2(String[] seoul) {
        String answer = "";
        int idx = 0;
        for (String s : seoul) {
            if ("Kim".equals(s)) {
                answer = "김서방은 " + idx + "에 있다";
                return answer;
            }
            idx++;
        }
        return answer;
    }

    /**
     * 핸드폰 번호 가리기
     *
     * @param phone_number 4이상 20이하
     * @return 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열
     */
    public String solution3(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String preNum = phone_number.substring(0, phone_number.length() - 4);
        for (int i = 0; i < preNum.length(); i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length()));
        answer = sb.toString();
        return answer;
    }

    /**
     * 나누어 떨어지는 숫자 배열
     * @param arr
     * @param divisor
     * @return array의 각 element 중 divisor 로 나누어 떨어지는 값을 오름차순으로 정렬한 배열, 없으면 -1
     */
    public int[] solution4(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        for (int a : arr) {
            if (a % divisor == 0) {
                result.add(a);
            }
        }
        if (result.size() == 0) {
            result.add(-1);
        }
        answer = result.stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}
