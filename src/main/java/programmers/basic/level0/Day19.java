package programmers.basic.level0;

public class Day19 {

    /**
     * 7의 개수
     * @param array
     * @return 7의 개수
     */
    public int solution1(int[] array) {
        int answer = 0;
        for (int arr : array) {
            String[] splitArr = String.valueOf(arr).split("");
            for (String s : splitArr) {
                if (s.equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }

    /**
     * 잘라서 배열로 저장하기
     * @param my_str
     * @param n
     * @return n 씩 잘라서 저장한 배열
     */
    public String[] solution2(String my_str, int n) {
        int arrayNum = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[arrayNum];
        for (int i = 0; i < arrayNum; i++) {
            int startIdx = i * n;
            int lastIdx = my_str.length() > startIdx + n ? startIdx + n : my_str.length();
            answer[i] = my_str.substring(startIdx, lastIdx);
        }
        return answer;
    }

    /**
     * 중복된 숫자 개수
     * @param array
     * @param n
     * @return array 에 있는 n 의 개수
     */
    public int solution3(int[] array, int n) {
        int answer = 0;
        for (int arr : array) {
            if (arr == n) {
                answer++;
            }
        }
        return answer;
    }

    /**
     * 머쓱이보다 키 큰 사람
     * @param array 전체 사람의 키
     * @param height 머쓱이 키
     * @return 머쓱이보다 키 큰 사람 수
     */
    public int solution4(int[] array, int height) {
        int answer = 0;
        for (int arr : array) {
            if (arr > height) {
                answer++;
            }
        }
        return answer;
    }

}
