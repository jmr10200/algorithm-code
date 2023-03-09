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

    /**
     * 튜플
     * @param s 특정 튜플을 표현하는 집합이 담긴 문자열 s가 매개변수로 주어질 때,
     * @return s가 표현하는 튜플을 배열에 담아 리턴
     * s는 숫자와 '{', '}', ',' 로만 이루어져 있다.
     *
     * n-tuple : (a1, a2, a3, ..., an)
     *
     * 튜플은 다음과 같은 성질을 가지고 있습니다.
     * 중복된 원소가 있을 수 있습니다. ex : (2, 3, 1, 2)
     * 원소에 정해진 순서가 있으며, 원소의 순서가 다르면 서로 다른 튜플입니다. ex : (1, 2, 3) ≠ (1, 3, 2)
     * 튜플의 원소 개수는 유한합니다.
     *
     * 원소의 개수가 n 개 이고, 중복되는 원소가 없는 튜플 리턴
     */
    public int[] solution2(String s) {
        int[] answer = {};
        String[] split = s.split("\\},\\{");
        // 맨앞 {{ 제거
        split[0] = split[0].replaceAll("\\{", "");
        // 맨뒤 }} 제거
        split[split.length - 1] = split[split.length - 1].replaceAll("\\}", "");
        // 문자열 길이로 정렬
        Arrays.sort(split, Comparator.comparing(String::length));
        // 튜플 생성
        Set<Integer> set = new HashSet<>();
        List<Integer> tuple = new ArrayList<>();
        for (String arr : split) {
            String[] arrString = arr.split(",");
            for (String str : arrString) {
                // set 없으면 리스트에 추가
                Integer intStr = Integer.valueOf(str);
                if (!set.contains(intStr)) {
                    tuple.add(intStr);
                }
                // set 에 추가
                set.add(intStr);
            }
        }
        answer = tuple.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    /**
     * 기능 개발
     * @param progresses 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열
     * @param speeds 각 작업의 개발 속도가 적힌 정수 배열
     * @return 각 배포마다 몇 개의 기능이 배포되는지
     * 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다.
     */
    public int[] solution3(int[] progresses, int[] speeds) {
        int[] answer = {}; // 배포 마다 몇 개의 기능이 배포되는지를 배열에 담아 리턴
        // 배포일
        List<Integer> dates = new ArrayList<>();
        // 배열로 순서대로 넣어야 한다.
        for (int i = 0; i < progresses.length; i++) {
            int date = (100 - progresses[i]) / speeds[i]; // 배포에 걸리는 날짜
            // 나누어 떨어지지 않으면, 하루 더 걸리므로 배포일 + 1
            if ((100 - progresses[i]) % speeds[i] != 0) {
                date = date + 1;
            }
            dates.add(date);
        }
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int releaseDate = dates.get(0); // 배포일
        for (Integer date : dates) {
            if (releaseDate < date) { // 7,3,9 -> 2,1
                result.add(count);
                count = 0;
                releaseDate = date;
            }
            count++;
        }
        // 마지막 카운트
        if (count != 0) {
            result.add(count);
        }
        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }


}
