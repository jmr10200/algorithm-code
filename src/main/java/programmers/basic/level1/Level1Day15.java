package programmers.basic.level1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1Day15 {

    /**
     * 명예의 전당 (1)
     * @param k 상위 k 번째 이내일때 점수표에 기재
     * @param score 점수표
     * @return
     */
    public int[] solution1(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> kList = new ArrayList<>();
        int minValue = 0;
        int idx = 0;
        for (int i = 0; i < score.length; i++) {
            // 명예의 전당에는 상위 k 번째까지
            if (kList.size() == k) {
                if (minValue < score[i]) {
                    kList.remove(idx);
                    kList.add(score[i]);
                }
            } else {
                // 명예의 전당이 k개에 미달하면 추가
                kList.add(score[i]);
            }
            // 명예의 전당 상위 k 개 중 최소값
            minValue = Collections.min(kList);
            idx = kList.indexOf(minValue);
            // 매일 최소점수 추가
            answer[i] = minValue;
        }
        return answer;
    }

    private final static String BLANK = "";
    /**
     * 숫자 짝꿍
     * @param X
     * @param Y
     * @return X,Y 중 공통으로 나타나는 정수를 이용하여 가장 큰 정수, 공통수가 없으면 -1
     */
    public String solution2(String X, String Y) {
        String answer = "";
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();

        // X 정수
        String[] splitX = X.split("");

        for (String sx : splitX) {
            xMap.put(sx, xMap.getOrDefault(sx, 0) + 1);
        }

        // Y 정수
        String[] splitY = Y.split("");
        for (String sy : splitY) {
            yMap.put(sy, yMap.getOrDefault(sy, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (String xKey : xMap.keySet()) {
            // y 에 x 숫자가 존재하지 않는 경우
            if (!yMap.containsKey(xKey)) {
                continue;
            }
            // y 에 x 숫자가 존재하는 경우, 둘 다 있는 수만큼 넣어야 하므로 value 값이 작은 것으로 들어감
            int min = Math.min(xMap.get(xKey), yMap.get(xKey));
            for (int i = 0; i < min; i++) {
                result.add(xKey);
            }
        }
        // 내림차순 정렬하여 String 으로 변환
        answer = result.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining());
        if (BLANK.equals(answer)) {
            answer = "-1";
        } else if (BLANK.equals(answer.replaceAll("0",""))) {
            // 0밖에 없는 경우
            answer = "0";
        }
        return answer;
    }

    /**
     * 키패드 누르기
     * @param numbers 순서대로 누를 번호가 담긴 배열
     * @param hand 왼손잡이 : left , 오른손잡이 : right
     * @return 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 (왼손 L , 오른손 R)
     * 키패드 ->   숫자화　  =>  좌표화
     * 1 2 3 ->  1  2  3  => (0,0)  (0,1)  (0,2)
     * 4 5 6 ->  4  5  6  => (1,0)  (1,1)  (1,2)
     * 7 8 9 ->  7  8  9  => (2,0)  (2,1)  (2,2)
     * * 0 # -> 10 11 12  => (3,0)  (3,1)  (3,2)
     */
    public String solution3(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int leftState = 10; // * 보정 값 10
        int rightState = 12; // # 보정 값 12
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                leftState = num;
                sb.append(LEFT_HAND);
            } else if (num == 3 || num == 6 || num == 9) {
                rightState = num;
                sb.append(RIGHT_HAND);
            } else {
                // 2, 5, 8, 0 인 경우
                int leftDistance = getDistance(leftState, num);
                int rightDistance = getDistance(rightState, num);
                if (leftDistance > rightDistance) {
                    // 오른손이 더 가까운 경우
                    rightState = num;
                    sb.append(RIGHT_HAND);
                } else if (leftDistance < rightDistance) {
                    // 왼손이 더 가까운 경우
                    leftState = num;
                    sb.append(LEFT_HAND);
                } else if (leftDistance == rightDistance) {
                    // 거리 동일 한경우 왼손잡이, 오른손잡이 판정
                    if (LEFT.equals(hand)) {
                        leftState = num;
                        sb.append(LEFT_HAND);
                    } else {
                        rightState = num;
                        sb.append(RIGHT_HAND);
                    }
                }

            }
        }
        answer = sb.toString();
        return answer;
    }

    private int getDistance(int currentState, int target) {
        int result = 0;
        // 0 인경우 11 으로 값 보정
        target = target == 0 ? 11 : target;
        currentState = currentState == 0 ? 11 : currentState;
        // x 좌표 거리 = (숫자 - 1) / 3
        result += Math.abs((currentState - 1) / 3 - (target - 1) / 3);
        // y 좌표 거리 = (숫자 - 1) % 3
        result += Math.abs((currentState - 1) % 3 - (target - 1) % 3);
        return result;
    }

    private final static String LEFT_HAND = "L";
    private final static String RIGHT_HAND = "R";
    private final static String LEFT = "left";

    /**
     * 크레인 인형 뽑기 게임
     * @param board 게임 화면 "1 x 1" 크기의 칸들로 이루어진 "N x N" 크기의 정사각 격자
     * @param moves 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열
     * @return 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수
     */
    public int solution4(int[][] board, int[] moves) {
        int answer = 0;
        // stack.peek() : top 데이터 취득
        Stack<Integer> stack = new Stack<>();
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                // 0이 아닌 값일때까지 찾아서
                if (board[i][m - 1] != 0) {
                    // 집어넣는 값이 현재 스택의 맨 위 값과 동일하면 터트려야한다.
                    if (!stack.empty() && board[i][m - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else {
                        // 0이 아닐 때 값을 넣는다.
                        stack.push(board[i][m - 1]);
                    }
                    // 값을 바구니에 넣고다면 board 에서 삭제
                    board[i][m - 1] = 0;
                    // 넣었으니 break
                    break;
                }
            }
        }
        return answer;
    }
}
