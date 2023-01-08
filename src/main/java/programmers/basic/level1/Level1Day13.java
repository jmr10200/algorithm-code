package programmers.basic.level1;

public class Level1Day13 {

    /**
     * 크기가 작은 부분 문자열
     * @param t 숫자로 이루어진 문자열 , p의 길이 ≤ t의 길이 ≤ 10,000
     * @param p 숫자로 이루어진 문자열 , 1 ≤ p의 길이 ≤ 18
     * @return t 에서 p와 길이가 같은 부분문자열 중에 p 수보다 작거나 같은 것의 횟수
     */
    public int solution1(String t, String p) {
        int answer = 0;
        // p의 길이
        int pLength = p.length();
        for (int i = 0; i < t.length(); i++) {
            int endIdx = i + pLength;
            if (endIdx > t.length()) {
                break;
            }else {
                // t 의 길이 조건을 고려하면 Long
                if (Long.valueOf(t.substring(i, endIdx)) <= Long.valueOf(p)) {
                    answer++;
                }
            }
        }
        return answer;
    }

}
