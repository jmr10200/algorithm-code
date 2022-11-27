package programmers.basic.level0;

public class Day10 {

    /**
     * 점의 위치 구하기
     * @param dot 점
     * @return 점의 위치 (사분면의 위치)
     */
    public int solution1(int[] dot) {
        int answer = 0;
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if (dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }
        return answer;
    }

    /**
     * 2차원으로 만들기
     * @param num_list
     * @param n
     * @return num_list 를 {n * x}로 변환한 배열
     */
    public int[][] solution2(int[] num_list, int n) {
        int x = num_list.length / n; // n * x 배열 (제한 : num_List 의 길이는 n의 배수)
        int[][] answer = new int[x][n];
        int idx = 0;
        // n 개씩 x 묶음
        for (int i = 0; i < x; i++) {
            int[] numbers = new int[n];
            for (int j = 0; j < n; j++) {
                numbers[j] = num_list[idx];
                idx++;
            }
            answer[i] = numbers;
        }
        return answer;
    }

    /**
     * 공던지기
     * @param numbers
     * @param k
     * @return
     */
    public int solution3(int[] numbers, int k) {
        // 인덱스가 0,1,2,3,4,5,6,7,8,9... 일때
        // 홀수명일때 0,1,2,3,4,5,6 -> 0,2,4,6,1,3,5 가 반복
        // 짝수명일때 0,1,2,3,4,5   -> 0,2,4         가 반복
        return numbers[2 * (k - 1) % numbers.length];
    }

    /**
     * 배열 회전시키기
     * @param numbers
     * @param direction
     * @return
     */
    public int[] solution4(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (RIGHT.equals(direction)) {
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    answer[0] = numbers[i];
                } else {
                    answer[i + 1] = numbers[i];
                }
            }
        } else if (LEFT.equals(direction)){
            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    answer[numbers.length - 1] = numbers[i];
                } else {
                    answer[i - 1] = numbers[i];
                }
            }
        }
        return answer;
    }

    private final String LEFT = "left";
    private final String RIGHT = "right";
}
