package programmers.basic.level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class Level2Day05 {

    /**
     * H-Index
     * @param citations 발표한 논문의 인용 횟수를 담은 배열
     * @return 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 H-Index
     * h-index 는 h 개의 논문이 각각 적어도 h 개의 인용 을 갖도록 하는 가장 큰 숫자 h 입니다.
     */
    public int solution1(int[] citations) {
        int answer = 0;
        // 정렬
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                answer = citations.length - i;
                break;
            }
        }
        return answer;
    }

}
