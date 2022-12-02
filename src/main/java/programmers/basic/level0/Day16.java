package programmers.basic.level0;

public class Day16 {

    /**
     * 편지
     * @param message 대소문자, ‘!’, ‘~’ 또는 공백
     * @return 최소 가로길이 (글자당 2cm)
     */
    public int solution1(String message) {
        int answer = 0;
        int msgLength = message.length();
        answer = msgLength * 2;
        return answer;
    }

    /**
     * 가장 큰 수 찾기
     * @param array
     * @return {가장 큰수, 그수의 인덱스}
     */
    public int[] solution2(int[] array) {
        int[] answer = {};
        int max = array[0];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                idx = i;
            }
        }
        answer = new int[]{max, idx};
        return answer;
    }

    /**
     * 문자열 계산하기
     * @param my_string
     * @return 문자열의 계산결과
     */
    public int solution3(String my_string) {
        int answer = 0;
        String[] splitStr = my_string.split(" ");
        for (int i = 0; i < splitStr.length-1; i++) {
            if (i == 0) {
                answer = Integer.valueOf(splitStr[0]);
            }
            if (plus.equals(splitStr[i])) {
                answer += Integer.valueOf(splitStr[i + 1]);
            } else if (minus.equals(splitStr[i])) {
                answer -= Integer.valueOf(splitStr[i + 1]);
            }
        }
        return answer;
    }

    private final String plus = "+";
    private final String minus = "-";

    /**
     * 배열의 유사도
     * @param s1
     * @param s2
     * @return s1, s2 의 공통 원소 개수
     */
    public int solution4(String[] s1, String[] s2) {
        int answer = 0;
        for (String str1 : s1) {
            for (String str2 : s2) {
                if (str1.equals(str2)) {
                    answer++;
                }
            }
        }
        return answer;
    }

}
