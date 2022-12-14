package programmers.basic.level0;

import java.util.Arrays;

public class Day20 {

    /**
     * 직사각형 넓이 구하기
     * @param dots 각 꼭지점 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
     * @return 직사각형 넓이
     */
    public int solution1(int[][] dots) {
        int answer = 0;
        int height = 0; // 세로
        int width = 0; // 가로
        int x1 = 0;
        int y1 = 0;
        for (int i = 0; i < dots.length; i++) {
            if (i == 0) {
                x1 = dots[0][0];
                y1 = dots[0][1];
            } else {
                if (x1 == dots[i][0]) {
                height = dots[i][1] > y1 ? dots[i][1] - y1 : y1 - dots[i][1];
                } else {
                width = dots[i][0] > x1 ? dots[i][0] - x1 : x1 - dots[i][0];
                }
            }
        }
        answer = height * width;
        return answer;
    }

    /**
     * 캐릭터의 좌표
     * @param keyInput up, down, left, right 에 따라 (x,y) 한칸씩 이동
     * @param board (가로크기, 세로크기) 이며 무조건 홀수 , (0,0) 은 정중앙. 좌표평면
     * @return 캐릭터가 keyInput 대로 이동한 후 좌표. 항상 (0,0) 에서 시작함
     */
    public int[] solution2(String[] keyInput, int[] board) {
        int[] answer = {0, 0};
        int maxX = board[0] / 2; // x 좌표 최대값
        int maxY = board[1] / 2; // y 좌표 최대값
        int nowX = 0;
        int nowY = 0;
        for (String key : keyInput) {
            if (key.equals("left")) {
                nowX = answer[0] - 1;
            } else if (key.equals("right")) {
                nowX = answer[0] + 1;
            } else if (key.equals("up")) {
                nowY = answer[1] + 1;
            } else if (key.equals("down")) {
                nowY = answer[1] - 1;
            }
            // 보드 밖이면 현재좌표 되돌리고, 무시
            if (outsideBoard(nowX, nowY, maxX, maxY)) {
                nowX = answer[0];
                nowY = answer[1];
                continue;
            } else {
                // 보드 안이면 움직이기
                answer[0] = nowX;
                answer[1] = nowY;
            }
        }
        return answer;
    }

    private boolean outsideBoard(int nowX, int nowY, int maxX, int maxY) {
        boolean result = false;
        if (nowX > maxX || nowX < -maxX || nowY > maxY || nowY < -maxY) {
            result = true;
        }
        return result;
    }

    /**
     * 최댓값 만들기 (2)
     * @param numbers
     * @return numbers 원소 두개를 곱해 만들 수 있는 최댓값
     */
    public int solution3(int[] numbers) {
        int answer = 0;
        int minNums = 0; // 가장 작은 두 수 곱
        int maxNums = 0; // 가장 큰 두 수 곱
        Arrays.sort(numbers);
        minNums = numbers[0] * numbers[1];
        maxNums = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        answer = minNums > maxNums ? minNums : maxNums;
        return answer;
    }

    /**
     * 다항식 더하기
     * @param polynomial 0부터 9까지의 정수, 공백, ‘x’, ‘+'
     * @return 다항식 더한 결과 값
     */
    public String solution4(String polynomial) {
        String answer = "";
        int xNum = 0;
        int cons = 0;
        String[] splitPoly = polynomial.split(" \\+ ");
        for (String poly : splitPoly) {
            if (poly.contains(X_MARK)) {
                xNum += X_MARK.equals(poly) ? 1 : Integer.valueOf(poly.replace(X_MARK, ""));
            } else {
                cons += Integer.valueOf(poly);
            }
        }
        answer = createXnum(xNum);
        if (xNum != 0 && cons != 0) {
            answer += " + " + String.valueOf(cons);
        } else if (cons != 0) {
            answer += String.valueOf(cons);
        }
        return answer;
    }

    private String createXnum(int xNum) {
        String result = "";
        if (xNum == 1) {
            result = X_MARK;
        } else if (xNum == -1) {
            result = "-" + X_MARK;
        } else if (xNum != 0) {
            result = String.valueOf(xNum) + X_MARK;
        }
        return result;
    }

    private static final String X_MARK = "x";
}
