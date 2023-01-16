package programmers.basic.level1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1Day15 {

    /**
     * 명예의 전당 (1)
     * @param k 상위 k 번째 이내일때 점수표에 기재
     * @param score 점수표
     * @return
     */
    public int[] solution1(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> kList = new ArrayList<>();
        int minValue = 0;
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
            // 명예의 전당에는 상위 k 번째까지
            if (kList.size() == k) {
                if (minValue < score[i]) {
                    kList.remove(idx);
                    kList.add(score[i]);
                }
            } else {
                // 명예의 전당이 k개에 미달하면 추가
                kList.add(score[i]);
            }
            // 명예의 전당 상위 k 개 중 최소값
            minValue = Collections.min(kList);
            idx = kList.indexOf(minValue);
            // 매일 최소점수 추가
            answer[i] = minValue;
        }
        return answer;
    }

}
