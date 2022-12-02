package programmers.basic.level0;

import java.util.*;

public class Day15 {

    /**
     * 영어가 싫어요
     * @param numbers
     * @return 영어를 숫지로 변환
     */
    public long solution1(String numbers) {
        long answer = 0;
        Map<String, String> numberMap = getNumberMap();
        Set<String> keySet = numberMap.keySet();
        for (String key : keySet) {
            numbers = numbers.replaceAll("(" + key + ")", numberMap.get(key));
        }
        answer = Long.valueOf(numbers);
        return answer;
    }

    private Map<String, String> getNumberMap(){
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");
        return numberMap;
    }

    /**
     * 인덱스 바꾸기
     * @param my_string
     * @param num1
     * @param num2
     * @return 인덱스 num1 과 num2 자리 바꾸기
     */
    public String solution2(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(); // import java.lang.*;
        String[] splitStr = my_string.split("");
        String str1 = splitStr[num1];
        String str2 = splitStr[num2];
        splitStr[num1] = str2;
        splitStr[num2] = str1;
        for (String s : splitStr) {
            sb.append(s);
        }
        return sb.toString();
    }

    /**
     * 한 번만 등장한 문자
     * @param s
     * @return 한번만 등장한 문자열, 없으면 빈 문자열 (사전순 정렬)
     */
    public String solution3(String s) {
        String answer = "";
        String[] splitStr = s.split("");
        Arrays.sort(splitStr);
        int count = 0;
        for (int i = 0; i < splitStr.length; i++) {
            count = 0;
            for (int j = 0; j < splitStr.length; j++) {
                if (splitStr[i].equals(splitStr[j])) {
                    count++;
                }
            }
            if (count == 1) {
                answer += splitStr[i];
            }
        }
        return answer;
    }

    /**
     * 약수 구하기
     * @param n
     * @return n 의 약수 오름차순 배열
     */
    public int[] solution4(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        int[] answer = divisors.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
