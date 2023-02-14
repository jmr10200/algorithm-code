package programmers.basic.level2;

import java.util.*;

public class Level2Day01 {

    private final static String BLANK = " ";

    /**
     * 최댓값과 최솟값
     * @param s 공백으로 구분된 숫자들이 저장된 문자열
     * @return [최솟값 최댓값]
     */
    public String solution1(String s) {
        String answer = "";
        String[] strings = s.split(BLANK);
        // 숫자로 변환
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.valueOf(strings[i]);
        }
        // answer = Arrays.stream(ints).min().getAsInt() + " " + Arrays.stream(ints).max().getAsInt();
        Arrays.sort(ints);
        answer = ints[0] + " " + ints[ints.length - 1];
        return answer;
    }

    /**
     * JadenCase 문자열 만들기
     * @param s 문자열, 공백으로 구분된 단어, 공백 연속 가능성 있음
     * @return s를 JadenCase 로 바꾼 문자열
     * JadenCase : 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열
     */
    public String solution2(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        // 첫글자만 대문자이므로 전체를 소문자로 변환해둔다.
        s = s.toLowerCase();
        String[] strings = s.split("");
        // 대문자로 바꾸기
        boolean isFirst = true;
        for (String str : strings) {
            // 공백인경우
            if (BLANK.equals(str)) {
                sb.append(BLANK);
                isFirst = true;
                continue;
            } else {
                // 공백이 아니면 첫글자만 대문자
                if (isFirst) {
                    sb.append(str.toUpperCase());
                    isFirst = false;
                } else {
                    sb.append(str);
                }
            }
        }
        answer = sb.toString();
        return answer;
    }

}
