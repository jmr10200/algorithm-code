package programmers.basic.level1;

import java.util.Arrays;

public class Level1Day05 {

    /**
     * 제일 작은 수 제거하기
     * @param arr
     * @return arr 에서 가장 작은 수를 제거한 배열, 빈 배열이면 -1
     */
    public int[] solution1(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            answer = new int[arr.length - 1];
            int[] copyArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                copyArr[i] = arr[i]; // 배열 복사
            }
            Arrays.sort(arr);
            int min = arr[0];
            int idx = 0;
            for (int c : copyArr) {
                if (c != min) {
                    answer[idx] = c;
                    idx++;
                }
            }
        }
        return answer;
    }

    /**
     * 음양 더하기
     * @param absolutes 절댓값을 차례대로 담은 정수 배열
     * @param signs 정수들의 부호를 차례대로 담은 불리언 배열 (true : +, false : -)
     * @return 실제 정수들의 합
     */
    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }

    /**
     * 없는 숫자 더하기
     * @param numbers
     * @return numbers 에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수
     */
    public int solution3(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!containNumber(i, numbers)) {
                answer += i;
            }
        }
        return answer;
    }

    private boolean containNumber(int n, int[] numbers) {
        for (int num : numbers) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    /**
     * 가운데 글자 가져오기
     * @param s
     * @return 단어 s의 가운데 글자, 단어의 길이가 짝수면 가운데 두글자
     */
    public String solution4(String s) {
        String answer = "";
        int strLength = s.length();
        if (strLength % 2 == 0) {
            answer = s.substring(strLength / 2 - 1, strLength / 2 + 1);
        } else {
            answer = s.substring(strLength / 2, strLength / 2 + 1);
        }
        return answer;
    }

}
