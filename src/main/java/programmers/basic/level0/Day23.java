package programmers.basic.level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class Day23 {

    /**
     * 특이한 정렬
     * @param numlist
     * @param n
     * @return n과 가까운 수부터 정렬, n 으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치
     */
    public int[] solution1(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        // (거리, 숫자)
        int[][] distanceNumList = new int[numlist.length][2];

        for (int i = 0; i < numlist.length; i++) {
            distanceNumList[i][0] = Math.abs(numlist[i] - n); // 거리
            distanceNumList[i][1] = numlist[i]; // 숫자
        }
        Arrays.sort(distanceNumList, Comparator.comparing((int[] d) -> d[0]).reversed().thenComparing(d -> d[1]).reversed());
        int idx = 0;
        for (int[] d : distanceNumList) {
            answer[idx] = d[1]; // 숫자만 배열로
            idx++;
        }
        return answer;
    }

    /**
     * 등수 매기기
     * @param score
     * @return 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열
     */
    public int[] solution2(int[][] score) {
        int[] answer = new int[score.length];
        Arrays.fill(answer,1); // 1 로 셋팅
        // 영어 + 수학 값이 더 크면 등수가 더 높다
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) {
                    answer[i]++; // 비교대상 학생보다 점수 낮으면 등수 +1 (동점이면 같은 등수)
                }
            }
        }
        return answer;
    }

    /**
     * 옹알이 (1)
     * @param babbling "aya", "ye", "woo", "ma" 네 가지 발음 가능
     * @return 발음할 수 있는 단어의 개수
     */
    public int solution3(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            String[] splitBabbling = b.split("aya|ye|woo|ma");
            if (splitBabbling.length == 0) {
                // 정확히 일치하는게 있으면 OK
                answer++;
            }
        }
        return answer;
    }

    /**
     * 로그인 성공
     * @param id_pw id 는 알파벳, 소문자이며 고유값, 숫자 pw 는 숫자 (id, pw)
     * @param db (id, pw) 최대 10개
     * @return 모두 일치 "login", 아이디가 일치하는 회원이 없다면 “fail”, 비밀번호가 일치하는 회원이 없다면 “wrong pw”
     */
    public String solution4(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] d : db) {
            // id 일치
            if (d[0].equals(id)) {
                if (d[1].equals(pw)) {
                    // pw 일치
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
                return answer; // 아이디는 고유값이므로 확인 후 바로 리턴
            } else {
                // id 없음
                answer = "fail";
            }
        }
        return answer;
    }
}
