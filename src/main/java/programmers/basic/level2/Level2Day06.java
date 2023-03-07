package programmers.basic.level2;

import java.util.*;

public class Level2Day06 {

    /**
     * 위장
     * @param clothes 스파이가 가진 의상들이 담긴 2차원 배열 (의상의 이름, 의상의 종류)
     * @return 서로 다른 옷의 조합의 수
     * 최소 1개이상 착용, 같은 이름을 가진 의상은 존재하지 않습니다.
     */
    public int solution1(String[][] clothes) {
        int answer = 0;
        // key = 의상 종류 , value = 개수
        Map<String, Integer> clothMap = new HashMap<>();

        // 경우의 수
        for (String[] cloth : clothes) {
            String category = cloth[1];
            clothMap.put(category, clothMap.getOrDefault(category, 0) + 1);
        }
        // key 가 1개이면
        answer = clothes.length;

        // key 가 2개 이상이면
        if(clothMap.size() > 1) {

            int count = 1;

            for(String key : clothMap.keySet()){
                count *= clothMap.get(key) + 1;
            }

            answer = count - 1; // 모두 안쓰는 경우 -1
        }

        return answer;
    }


}
