package programmers.basic.level1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    /**
     * 완주하지 못한 선수
     * @param participant 마라톤에 참여한 선수들의 이름이 담긴 배열
     * @param completion 완주한 선수들의 이름이 담긴 배열
     * @return 완주하지 못한 선수의 이름
     */
    public String solution3(String[] participant, String[] completion) {
        String answer = "";
        // 참가자Map : key = 이름 , value = 참가자 수
        Map<String, Integer> participantMap = new HashMap<>();
        for (String p : participant) {
            // 동명이인(중복키) 있을 가능성이 존재하므로, defaultValue + 1 로 설정
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }
        // 참가자Map 에서 완주자를 찾아 있으면 value 값을 -1 해준다.
        for (String c : completion) {
            participantMap.put(c, participantMap.get(c) - 1);
        }
        // 참가자Map 에서 value 값이 0이 아니면 완주하지 못한 사람이다.
        for (String key : participantMap.keySet()) {
            if (participantMap.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

    /**
     * 과일 장수
     * @param k 사과의 최대 점수
     * @param m 한 상자당 사과 개수
     * @param score 사과들의 점수
     * @return 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익, 이익이 발생하지 않으면 0
     * 상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m
     */
    public int solution4_1(int k, int m, int[] score) {
        int answer = 0;
        int appleCnt = score.length;
        // 한 상자를 못만들면 팔 수 없으므로 이익 0
        if (appleCnt < m) {
            return answer;
        }
        // 사과 점수 int[] -> List<Integer>, 내림차순 정렬
        List<Integer> appleScore = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (int i = 0; i < appleCnt; i++) {
            // (i+1) 을 한 박스의 사과 개수로 나눴을 때 나머지가 0 이면 1박스 채워진 것
            if ((i + 1) % m == 0) {
                // 내림차순 정렬했으므로, 사과 개수의 마지막 인덱스가 최저 점수
                answer += appleScore.get(i) * m;
            }
        }
        return answer;
    }

    /**
     * solution4_1 이 아래 코드를 조금 변형한 것이다.
     * Integer[] 대신 List<Integer> 를 사용했다.
     */
    public int solution4_2(int k, int m, int[] score) {
        int answer = 0;
        int appleCnt = score.length;
        // 한 상자를 못만들면 팔 수 없으므로 이익 0
        if (appleCnt < m) {
            return answer;
        }
        // 사과 점수 int[] -> Integer[], 내림차순 정렬
        Integer[] appleScore = Arrays.stream(score).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        int minScore = appleScore[0];
        int idx = 0;
        for (int i = 0; i < appleCnt; i++) {
            // m개 씩 확인하여 최저 사과 점수 취득
            if (idx < m) {
                minScore = Math.min(minScore, appleScore[i]);
            }
            idx++;
            if (idx == m) {
                answer += minScore * m;
                idx = 0;
            }
        }
        // (최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수)
        return answer;
    }
}
