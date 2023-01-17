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

    private final static String BLANK = "";
    /**
     * 숫자 짝꿍
     * @param X
     * @param Y
     * @return X,Y 중 공통으로 나타나는 정수를 이용하여 가장 큰 정수, 공통수가 없으면 -1
     */
    public String solution2(String X, String Y) {
        String answer = "";
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        // X 정수
        String[] splitX = X.split("");

        for (String sx : splitX) {
            xMap.put(sx, xMap.getOrDefault(sx, 0) + 1);
        }

        // Y 정수
        String[] splitY = Y.split("");
        for (String sy : splitY) {
            yMap.put(sy, yMap.getOrDefault(sy, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (String xKey : xMap.keySet()) {
            // y 에 x 숫자가 존재하지 않는 경우
            if (!yMap.containsKey(xKey)) {
                continue;
            }
            // y 에 x 숫자가 존재하는 경우, 둘 다 있는 수만큼 넣어야 하므로 value 값이 작은 것으로 들어감
            int min = Math.min(xMap.get(xKey), yMap.get(xKey));
            for (int i = 0; i < min; i++) {
                result.add(xKey);
            }
        }
        // 내림차순 정렬하여 String 으로 변환
        answer = result.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining());
        if (BLANK.equals(answer)) {
            answer = "-1";
        } else if (BLANK.equals(answer.replaceAll("0",""))) {
            // 0밖에 없는 경우
            answer = "0";
        }
        return answer;
    }

}
