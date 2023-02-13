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

}
