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

    /**
     * [1차] 다트게임
     * @param dartResult 점수|보너스|[옵션]
     * @return dartResult 를 계산한 결과 점수
     *
     * 각 기회마다 얻을 수 있는 점수 : 0 ~ 10 점
     * 점수영역 : Single(S) = 1제곱 , Double(D) = 2제곱 , Triple(T) = 3제곱
     * [옵션] : 스타상(*) = 전에 얻은 점수 각각 2배(*2) , 아차상(#) = 해당 점수가 마이너스됨(-붙임) / 중첩가능
     */
    public int solution2(String dartResult) {
        int answer = 0;
        // 세 번의 다트 각 점수 담는 배열
        int[] dartScore = new int[3];
        int idx = -1; // dartScore 배열 인덱스

        String[] splitDartResult = dartResult.split("");
        for (int i = 0; i < splitDartResult.length; i++) {
            if (splitDartResult[i].matches("[0-9]")) {
                if (i == 0) {
                    idx++;
                    dartScore[idx] = Integer.valueOf(splitDartResult[i]);
                } else {
                    // 10인 경우
                    if ("0".equals(splitDartResult[i]) && "1".equals(splitDartResult[i - 1])) {
                        dartScore[idx] = 10;
                    } else {
                        idx++;
                        dartScore[idx] = Integer.valueOf(splitDartResult[i]);
                    }
                }
            } else if (splitDartResult[i].matches("[S|D|T]")) {
                // S|D|T 체크
                int powNum = getPowNum(splitDartResult[i]);
                dartScore[idx] = (int) Math.pow(dartScore[idx], powNum);
            } else if (splitDartResult[i].matches("[*|#]")) {
                // 옵션 체크
                if ("*".equals(splitDartResult[i])) {
                    // *, 스타상이면 *2 (현재 점수 , 바로 직전 점수)
                    dartScore[idx] *= 2;
                    if (idx > 0) {
                        dartScore[idx - 1] *= 2;
                    }
                } else {
                    // #, 아차상이면 * -1 (마이너스 부호 붙여주기)
                    dartScore[idx] *= -1;
                }
            }
        }
        answer = dartScore[0] + dartScore[1] + dartScore[2];
        return answer;
    }

    /**
     * 제곱수
     */
    private int getPowNum(String powStr) {
        int result = "S".equals(powStr) ? 1 : "D".equals(powStr) ? 2 : 3;
        return result;
    }

    /**
     * 푸드 파이트 대회
     * @param food 칼로리가 적은 순서대로 음식의 양, 0번 음식은 물
     * @return 좌,우 왼쪽에서 동일하게 음식을 먹을때의 음식 배치도
     */
    public String solution3(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        // 왼쪽 사람이 먹는 음식 나열
        for (int i = 1; i < food.length; i++) {
            for (int j = 1; j <= food[i] / 2; j++) {
                sb.append(i);
            }
        }
        answer = sb.toString();
        answer += "0"; // 물
        // 뒤집어서 오른쪽 사람이 먹는 음식 나열
        answer += sb.reverse().toString();
        return answer;
    }

    /**
     * 로또의 최고 순위와 최저 순위
     * @param lottos 구매한 로또 번호를 담은 배열, 알아볼 수 없는 번호를 0으로 표기
     * @param win_nums 당첨 번호를 담은 배열
     * @return 당첨 가능한 최고 순위, 최저 순위를 순서대로 담은 배열
     */
    public int[] solution4(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0; // 0으로 표기한 번호 카운트
        int minWin = 0; // 현재 알 수 있는 번호로 당첨된 최저 당첨 카운트
        for (int lot : lottos) {
            if (lot == 0) {
                zeroCnt++;
            }else {
                for (int win : win_nums) {
                    if (win == lot) {
                        minWin++;
                    }
                }
            }
        }
        int maxWin = minWin + zeroCnt; // 최고 당첨 카운트
        // 당첨된 번호 개수를 순위로 변환
        answer[0] = getRank(maxWin);
        answer[1] = getRank(minWin);
        return answer;
    }

    private int getRank(int winNum) {
        int result = 6;
        switch (winNum) {
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default:
                result = 6;
                break;
        }
        return result;
    }

}
