package programmers.basic.level0;

import java.util.Arrays;

public class Day21 {

    /**
     * 숨어있는 숫자의 덧셈 (2)
     * @param my_string
     * @return my_string 안의 숫자만 더한 값
     */
    public int solution1(String my_string) {
        int answer = 0;
        String[] numbers = my_string.split("[^0-9]");
        for (String n : numbers) {
            if (!"".equals(n)) {
                answer += Integer.valueOf(n);
            }
        }
        return answer;
    }

    /**
     * 안전지대
     * @param board n * n 지역
     * @return 안전한 지역의 칸 수
     */
    public int solution2(int[][] board) {
        int answer = 0;
        int n = board.length;
        int[][] copyBoard = new int[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    boomArea(i, j, copyBoard);
                }
            }
        }
        for (int[] copy : copyBoard) {
            answer += Arrays.stream(copy).filter(c -> c == 0).count();
        }
        return answer;
    }

    private void boomArea(int col, int row, int[][] copyBoard) {
        // [-1, -1], [ -1,  0], [-1, 1]
        // [ 0, -1], [col,row], [ 0, 1]
        // [ 1, -1], [  1,  0], [ 1, 1]
        for (int i = col - 1; i <= col + 1; i++) {
            if (i < 0 || i >= copyBoard.length) {
                continue;
            }
            for (int j = row - 1; j <= row + 1; j++) {
                if (j < 0 || j >= copyBoard.length) {
                    continue;
                }
                copyBoard[i][j] = 1;
            }
        }
    }

    /**
     * 삼각형의 완성조건 (2)
     * @param sides 두 변의 길이
     * @return 가장 긴 변의 길이 < 다른 두 변길이의 합 일때, 나머지 한 변이 될 수 있는 정수 개수
     */
    public int solution3(int[] sides) {
        int answer = 0;
        // ( i) sides 값 중 하나가 가장 긴 변인 경우 : x <= maxSides && maxSides < x + minSides (= maxSides-minSides < x)
        // (ii) sides 값 외의 하나가 가장 긴 변인 경우 : x < totalSides && maxSides <= x
        // => (i) , (ii) 를 종합하면 : maxSides-minSides < x < maxSides+minSides
        int maxSides = sides[0] >= sides[1] ? sides[0] : sides[1]; // 둘 중 긴 변
        int minSides = sides[0] >= sides[1] ? sides[1] : sides[0]; // 둘 중 작은 변

        int maxLimit = sides[0] + sides[1]; // 최대 길이
        int minLimit = maxSides - minSides; // 최소 길이
        answer = maxLimit - minLimit - 1; // 변의 개수

        return answer;
    }

    /**
     * 외계어 사전
     * @param spell
     * @param dic
     * @return spell 에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic 에 존재한다면 1, 존재하지 않는다면 2
     */
    public int solution4(String[] spell, String[] dic) {
        int answer = 2;
        for (String d : dic) {
            boolean containSpell = true;
            for (String s : spell) {
                if (!d.contains(s)) {
                    containSpell = false;
                    break;
                }
            }
            if (containSpell) {
                answer = 1;
            }
        }
        return answer;
    }
}
