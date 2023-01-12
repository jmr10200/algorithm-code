package programmers.basic.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Level1Day14 {

    /**
     * 가장 가까운 같은 글자
     * @param s
     * @return 자신과 가장 가까운 곳에 있는 같은 글자가 몇칸 앞에 있는지 거리를 담은 배열, 없으면 -1
     */
    public int[] solution1(String s) {
        int[] answer = new int[s.length()];
        String[] splitStr = s.split("");
        for (int i = 0; i < splitStr.length; i++) {
            int distance = 0;
            answer[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                distance++;
                if (splitStr[i].equals(splitStr[j])) {
                    answer[i] = distance;
                    break;
                }
            }
        }
        return answer;
    }


}
