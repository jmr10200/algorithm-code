package programmers.basic.level2;

import java.util.*;

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

    /**
     * 괄호 회전하기
     * @param s 대괄호, 중괄호, 소괄호로 이루어진 문자열
     * @return s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수
     */
    public int solution2(String s) {
        int answer = 0;

        // 길이가 홀수면 올바른 괄호 불가능
        if (s.length() % 2 != 0) {
            return answer; // 0
        }
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            char start = s.charAt(0); // 첫번째
            char end = s.charAt(s.length() - 1); // 마지막
            boolean startCond = true;

            // 올바른 괄호 확인
            for (int j = 0; j < s.length(); j++) {
                // 첫번째 괄호가 닫는 괄호면 X , 마지막 괄호가 여는 괄호면 X
                if (')' == start || '}' == start || ']' == start || '(' == end || '{' == end || '[' == end) {
                    startCond = false;
                    break;
                } else {
                    if ('(' == s.charAt(j) || '{' == s.charAt(j) || '[' == s.charAt(j)) {
                        stack.push(s.charAt(j));
                    } else {
                        // 괄호 확인해서 제거
                        if (!stack.empty() && stack.peek() == '(' && ')' == s.charAt(j)) {
                            stack.pop();
                        } else if (!stack.empty() && stack.peek() == '{' && '}' == s.charAt(j)) {
                            stack.pop();
                        } else if (!stack.empty() && stack.peek() == '[' && ']' == s.charAt(j)) {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(j));
                        }
                    }
                }
            }
            // 올바른 괄호이면 카운트
            if (startCond && stack.isEmpty()) {
                answer++;
            }
            // 회전
            s = rotateString(s);
        }
        return answer;
    }

    /** 문자열 회전 */
    private static String rotateString(String s) {
        return s.substring(1) + s.substring(0, 1);
    }

    /**
     * 캐시
     * @param cacheSize 캐시크기
     * @param cities 도시이름 배열: 공백, 숫자, 특수문자 등이 없는 영문자로 구성되며, 대소문자 구분을 하지 않는다.
     * @return 입력된 도시이름 배열을 순서대로 처리할 때, "총 실행시간"을 출력
     * == 조건 ==
     * 캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
     * cache hit일 경우 실행시간은 1이다.
     * cache miss일 경우 실행시간은 5이다.
     */
    public int solution3(int cacheSize, String[] cities) {
        int answer = 0;
        // 캐시 생성
        LRUCache cache = new LRUCache(cacheSize);
        // String 의 도시들을 순서대로
        for (String city : cities) {
            cache.refer(city.toLowerCase());
        }
        answer = cache.time;

        return answer;
    }

    /**
     * LRU Cache 클래스
     */
    public class LRUCache {

        // 캐시의 키값 저장 (Deque 는 LIFO)
        private Deque<String> doublyQueue;

        // store references of key in cache
        private HashSet<String> hashSet;

        // 캐시 최대 용량
        private final int CACHE_SIZE;

        // 실행시간
        private int time;

        // miss time
        private final int MISS_TIME = 5;
        // hit time
        private final int HIT_TIME = 1;

        // Constructor
        public LRUCache(int capacity) {
            doublyQueue = new LinkedList<>();
            hashSet = new HashSet<>();
            CACHE_SIZE = capacity;
            time = 0;
        }

        /* Refer the page within the LRU cache */
        public void refer(String page) {
            // cache 사이즈가 0일때
            if (CACHE_SIZE == 0) {
                // miss
                time = time + MISS_TIME;
                hashSet.add(page);
            } else {
                // 포함되어 있지 않으면 처음방문
                if (!hashSet.contains(page)) {
                    if (doublyQueue.size() == CACHE_SIZE) {
                        String last = doublyQueue.removeLast(); // 마지막 방문 페이지 제거
                        hashSet.remove(last);
                    }
                    // miss
                    time = time + MISS_TIME;
                } else {
                    // 포함되어 있으면 제거(remove()) 하고 앞으로 꺼내야함 (push())
                    doublyQueue.remove(page);
                    // hit
                    time = time + HIT_TIME;
                }
                doublyQueue.push(page);
                hashSet.add(page); // HashSet 은 중복 값 x, 순서보장 x
            }
        }

    }


    /**
     * 귤 고르기
     * @param k 한 상자에 담으려는 귤의 개수
     * @param tangerine 귤의 크기를 담은 배열
     * @return 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값
     */
    public int solution4(int k, int[] tangerine) {
        int answer = 0;

        // 갯수로 정렬해야한다.
        Map<Integer, Integer> tangerineMap = new HashMap<>();

        // 전체 Map 에 담기
        for (int tan : tangerine) {
            tangerineMap.put(tan, tangerineMap.getOrDefault(tan, 0) + 1);
        }
        // value 값으로 정렬 (갯수가 많은 순으로 정렬)
        List<Integer> keyList = new ArrayList<>(tangerineMap.keySet());
        Collections.sort(keyList, (o1, o2) -> (tangerineMap.get(o2).compareTo(tangerineMap.get(o1))));

        int kCount = 0;
        int i = 0; // key 인덱스
        int[] temp = new int[k];
        while (kCount < k) {
            temp[i] = keyList.get(i);
            kCount += tangerineMap.get(keyList.get(i));
            i++;
        }
        answer = i;

        return answer;
    }
}
