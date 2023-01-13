package programmers.basic.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Level1Day14 {

    /**
     * 가장 가까운 같은 글자
     * @param s
     * @return 자신과 가장 가까운 곳에 있는 같은 글자가 몇칸 앞에 있는지 거리를 담은 배열, 없으면 -1
     */
    public int[] solution1(String s) {
        int[] answer = new int[s.length()];
        String[] splitStr = s.split("");
        for (int i = 0; i < splitStr.length; i++) {
            int distance = 0;
            answer[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                distance++;
                if (splitStr[i].equals(splitStr[j])) {
                    answer[i] = distance;
                    break;
                }
            }
        }
        return answer;
    }

    private static final int DELETE = -9;

    /**
     * 체육복
     * 바로 앞, 뒤 번호의 학생에게서만 체육복을 빌려올 수 있다.
     * @param n 전체 학생 수
     * @param lost 체육복을 도난당한 학생들의 번호가 담긴 배열
     * @param reserve 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 , 도난당할 수 있다.
     * @return 체육수업을 들을 수 있는 학생의 최댓값
     */
    public int solution2(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        // 여분의 체육이 없을때 현재 가능한 인원 수
        int possibleNum = n - lost.length;
        // 여벌의 체육복을 가진 학생이 도난 당한 경우, 여벌 배열에서 삭제
        int reservableNum = 0;
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reservableNum++;
                    lost[j] = DELETE; // 없애준다.
                    reserve[i] = DELETE; // 없애준다.
                    break;
                }
            }
        }
        // 빌릴 수 있는 학생 수
        int studentCnt = 0;
        for (int l : lost) {
            for (int i = 0 ; i < reserve.length; i++) {
                if (l - 1 == reserve[i] || l + 1 == reserve[i]) {
                    studentCnt++;
                    reserve[i] = DELETE;
                    break;
                }
            }
        }
        answer = possibleNum + reservableNum + studentCnt;
        return answer;
    }

}
