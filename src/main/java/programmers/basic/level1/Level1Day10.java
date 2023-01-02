package programmers.basic.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Level1Day10 {

    /**
     * 삼총사
     * @param number
     * @return 세 명의 정수 번호를 더했을 때 0이면 삼총사, 삼총사를 만들 수 있는 방법의 수
     */
    public int solution1(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int n = j + 1; n < number.length; n++) {
                    if (number[i] + number[j] + number[n] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    /**
     * 문자열 내 마음대로 정렬하기
     * @param strings
     * @param n
     * @return 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
     */
    public String[] solution2(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n)){
                    return o1.compareTo(o2);
                } else if (o1.charAt(n) < o2.charAt(n)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return strings;
    }

    /**
     * K번째수
     * @param array
     * @param commands {i,j,k}
     * @return array 의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k 번째에 있는 수
     */
    public int[] solution3(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tmp = {};
        int idx = 0;
        int j = 0;
        for (int[] cmd : commands) {
            int k = cmd[2];
            tmp = new int[cmd[1] - cmd[0] + 1];
            for (int i = cmd[0] - 1; i <= cmd[1] - 1; i++) {
                tmp[j] = array[i];
                j++;
            }
            Arrays.sort(tmp);
            answer[idx] = tmp[k - 1];
            idx++;
            j = 0;
        }
        return answer;
    }

    /**
     * 숫자 문자열과 영단어
     * @param s
     * @return
     */
    public int solution4(String s) {
        int answer = 0;
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strings.length; i++) {
            s = s.replace(strings[i], String.valueOf(i));
        }
        answer = Integer.valueOf(s);
        return answer;
    }
}
