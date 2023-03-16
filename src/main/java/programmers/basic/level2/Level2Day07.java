package programmers.basic.level2;

import java.util.*;

public class Level2Day07 {

    /**
     * 연속 부분 수열 합의 개수
     * @param elements 수열
     * @return 중복제거한 연속 부분 수열 합의 개수
     */
    public int solution1(int[] elements) {
        int answer = 0;
        // 중복 제거한 수열의 합의 개수
        Set<Integer> result = new HashSet<>();
        // 원소의 길이만큼 반복
        for (int i = 0; i < elements.length; i++) {
            result.add(elements[i]);
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = 0; k < i + 1; k++) { // 개수
                    if (j + k > elements.length - 1) {
                        sum += elements[j + k - elements.length];
                    } else {
                        sum += elements[j + k];
                    }
                    result.add(sum);
                }
            }
        }
        answer = result.size();
        return answer;
    }

    /**
     * 전화번호 목록
     * @param phone_book 전화번호부에 적힌 전화번호를 담은 배열
     * @return 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false, 그렇지 않으면 true
     */
    public boolean solution2(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            String target = phone_book[i]; // 접두어
            int targetLength = target.length();
            for (int j = i + 1; j < phone_book.length; j++) {
                // 접두어가 되려면, 길이가 더 작아야함
                if (targetLength <= phone_book[j].length()) {
                    if (target.equals(phone_book[j].substring(0, targetLength))) {
                        // 잘라서 일치하면
                        answer = false;
                        return answer;
                    } else {
                        break; // 정렬 특징 효율성

                    }
                }
            }
        }

        return answer;
    }

    /**
     * 타겟 넘버
     * @param numbers 사용할 수 있는 숫자가 담긴 배열
     * @param target 타겟 넘버
     * @return 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수
     */
    public int solution3(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, int sum, int current) {
        int ans = 0;

        if (current == numbers.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }

        ans += dfs(numbers, target, sum + numbers[current], current + 1);
        ans += dfs(numbers, target, sum + numbers[current] * -1, current + 1);

        return ans;
    }

    /**
     * 뉴스 클러스터링
     * @param str1 영문의 글자쌍만 유효하다
     * @param str2
     * @return 입력으로 들어온 두 문자열의 자카드 유사도를 출력한다.
     * 유사도 값은 0에서 1 사이의 실수이므로, 이를 다루기 쉽도록 65536을 곱한 후에 소수점 아래를 버리고 정수부만 출력한다.
     *
     * 자카드 유사도는 집합 간의 유사도를 검사하는 여러 방법 중의 하나로 알려져 있다.
     * 두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.
     */
    public int solution4(String str1, String str2) {
        int answer = 0;
        // 요구사항
        int number = 65536;
        // 교집합 수
        int intersection = 0;
        // 합집합 수
        int union = 0;
        // 모두 대문자로
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        // 2개씩 잘라서 리스트에 담기
        List<String> str1List = getStrList(str1);
        List<String> str2List = getStrList(str2);
        // 리스트 길이가 둘다 0이면, 모두 공집합 이므로, J(A, B) = 1 로 정의
        union = str1List.size() + str2List.size();
        if (str1List.size() == 0 && str2List.size() == 0) {
            answer = number;
            return answer;
        }
        str1List.sort(Comparator.naturalOrder());
        str2List.sort(Comparator.naturalOrder());


        // 교집합 합집합 구하기
        for (int i = 0; i < str1List.size(); i++) {
            for (int j = 0; j < str2List.size(); j++) {
                // 같으면 교집합
                if (str1List.get(i).equals(str2List.get(j))) {
                    intersection += 1;
                    str2List.remove(j); // 교집합 체크후 삭제
                    break;
                }
            }
        }
        // 합집합 = 집합A + 집합B - A교집합B
        union = union - intersection;
        double jaccard = (double) intersection / (double) union;
        answer = (int) (jaccard * number);

        // J(A, B) = A ∩ B / A ∪ B
        return answer;
    }

    /** 문자열을 2개씩 잘라 리스트에 담아 리턴. 단, 알파벳으로 만 이루어진 2글자만 유효 */
    private List<String> getStrList(String str1) {
        List<String> strList = new ArrayList<>();
        for (int i = 1; i < str1.length(); i++) {
            String str = str1.substring(i - 1, i + 1);
            if (str.matches("[A-Z]{2}")){
                strList.add(str);
            }
        }
        return strList;
    }
}
