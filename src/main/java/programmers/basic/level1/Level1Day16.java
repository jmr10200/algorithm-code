package programmers.basic.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level1Day16 {

    /**
     * 기사단원의 무기
     * @param number 기사단원의 수
     * @param limit 이웃나라와 협약으로 정해진 공격력의 제한수치
     * @param power 제한수치를 초과한 기사가 사용할 무기의 공격력
     * @return 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게 (공격력 1당 1kg)
     */
    public int solution1(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            // 약수 개수
            int divisors = getDivisorCount(i);
            // 제한 체크
            if (divisors > limit) {
                answer += power;
            } else {
                answer += divisors;
            }
        }
        return answer;
    }

    /**
     * 약수 개수 구하기
     * 약수 대칭성 (제곱근 이용)
     * @param number 약수의 개수를 구하는 대상이 되는 수
     * @return number 의 약수 개수
     */
    private int getDivisorCount(int number) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If divisors are equal, count only one
                if (number / i == i) {
                    cnt++;
                } else { // Otherwise count both
                    cnt = cnt + 2;
                }
            }
        }
        return cnt;
    }

    /**
     * 문자열 나누기
     * @param s
     * @return 나눠진 문자열 개수
     */
    public int solution2(String s) {
        int answer = 0;
        String[] splitStr = s.split("");
        // 첫번째 문자 지정
        String x = splitStr[0];
        int xCnt = 1;
        int yCnt = 0;
        for (int i = 1; i < splitStr.length; i++) {
            if (x.equals(splitStr[i])) {
                xCnt++;
            } else {
                yCnt++;
            }
            if (xCnt == yCnt) {
                answer++;
                if ((i + 1) < splitStr.length) {
                    x = splitStr[i + 1];
                } else {
                    break;
                }
            }
        }
        if (xCnt > yCnt && (xCnt + yCnt) == splitStr.length) {
            answer++;
        }
        return answer;
    }


    /**
     * 개인정보 수집 유효기간
     * @param today 오늘 날짜 YYYY.MM.DD
     * @param terms 약관의 유효기간 (약관종류 유효기간) : 공백으로 구분, 유효기간은 개월수
     * @param privacies 수집된 개인정보 (날짜 약관정보) : 공백으로 구분
     * @return 파기해야할 개인정보의 번호 오름차순
     */
    public int[] solution3(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        Map<String, String> termsMap = new HashMap<>(); // key : 종류, value : 기간
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            termsMap.put(termSplit[0], termSplit[1]);
        }

        Integer number = 1;
        List<Integer> result = new ArrayList<>();
        // 현재 총 날짜 수
        Integer todayTotalDate = getTotalDate(today, 0);
        for (String p : privacies) {
            String[] privateSplit = p.split(" ");
            // 개인별 날짜
            String privateDate = privateSplit[0];
            // 개인별 약관 정보
            String privateTerm = privateSplit[1];
            // 약관 개월수
            Integer termsMonth = Integer.valueOf(termsMap.get(privateTerm));

            // 기간 경과 후 총 날짜 수
            Integer privateTotalDate = getTotalDate(privateDate, termsMonth) - 1; // 기간이므로 -1
            // 기간경과후 날짜가 현재 날짜보다 과거이면 폐기대상이다.
            if (privateTotalDate < todayTotalDate) { // 현재 당일은 아직 폐기대상 아님
                // 유효기간 경과하여 폐기대상인 번호를 추가
                result.add(number);
            }
            // privacies 의 번호 +1
            number++;
        }
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    /**
     * (년.월.일)을 총 날짜 수로 환산
     * @param strDate YYYY.MM.DD
     * @param termsMonth 약관 개월 수
     * @return 날짜로 환산한 총 날짜 수
     */
    private Integer getTotalDate(String strDate, Integer termsMonth) {
        // 날짜 정보
        String[] dateSplit = strDate.split("\\.");
        Integer year = Integer.valueOf(dateSplit[0]);
        Integer month = Integer.valueOf(dateSplit[1]) + termsMonth;
        Integer day = Integer.valueOf(dateSplit[2]);

        // 모두 일 수로 환산, 한달은 28일로 가정
        return (year * 12 * 28) + (month * 28) + day;
    }


}
