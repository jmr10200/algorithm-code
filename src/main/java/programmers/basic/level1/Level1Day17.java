package programmers.basic.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Level1Day17 {

    /**
     * 옹알이 (2)
     * @param babbling 문자열 배열
     * @return 발음할 수 있는 단어 개수
     * "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워함
     */
    public int solution1(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String babble : babbling) {
            // 숫자로 치환
            for (int i = 0; i < words.length; i++) {
                babble = babble.replace(words[i], String.valueOf(i));
            }
            // 숫자만 있고, 연속으로 중복되는 숫자가 아닐때 (발음할 수 있는 단어만 존재하고, 동일 발음을 연속으로 하지 않을때)
            if (babble.matches("^[0-9]*$") && !isDuplication(babble)) {
                answer++;
            }
        }
        return answer;
    }

    /**
     * 연속으로 중복인가 확인
     * @param babble 단어를 숫자로 치환한 옹알이
     * @return 연속으로 숫자가 중복이면 true, 연속으로 숫자가 중복아니면 false
     */
    private Boolean isDuplication(String babble) {
        Boolean result = Boolean.FALSE;
        String[] intBabbles = babble.split("");
        // 연속으로 같은 숫자인 경우
        for (int i = 1; i < intBabbles.length; i++) {
            if (intBabbles[i].equals(intBabbles[i - 1])) {
                // 중복이므로 true
                result = Boolean.TRUE;
            }
        }
        return result;
    }

    /**
     * 신규 아이디 추천
     * @param new_id 신규유저가 입력한 아이디, 입력가능한 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/
     * @return 아이디 규격 검사후, 규격에 맞지 않으면 규칙에 맞는 새로운 아이디를 추천
     *
     * == 아이디 규칙 ==
     * 아이디의 길이는 3자 이상 15자 이하여야 합니다.
     * 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
     * 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
     */
    public String solution2(String new_id) {
        String answer = "";
        // 1단계 : 모든 대문자를 소문자로 치환
        new_id = new_id.toLowerCase();
        // 2단계 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        String[] newIdSplit = new_id.split("");
        for (int i = 0; i < newIdSplit.length; i++) {
            if(!newIdSplit[i].matches("[0-9]|[a-z]|-|_|\\.")){
                newIdSplit[i] = "";
            }
        }
        new_id = Arrays.stream(newIdSplit).collect(Collectors.joining());
        // 3단계 new_id 에서 마침표(.) 가 2번 이상 연속되면 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        // 4단계 : new_id 에서 마침표(.)가 처음이나 끝에 위치하면 제거
        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1, new_id.length());
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        // 5단계 : new_id 가 비어있으면 new_id 에 "a" 를 대입
        if (new_id.isBlank()) {
            new_id = "a";
        } else if (new_id.length() >= 16) {
            // 6단계 new_id의 길이가 16자 이상이면, 첫 15개의 무자를 제외한 나머지 문자들을 모두 제거한다.
            new_id = new_id.substring(0, 15);
            // 15개 문자로 제거 후 마침표(.)로 끝나면, 제거해준다.
            if (new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }
        // 7단계 new_id의 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙인다.
        if (new_id.length() <= 2) {
            for (int i = new_id.length(); i < 3; i++) {
                new_id += new_id.substring(new_id.length() - 1);
            }
        }
        answer = new_id;
        return answer;
    }

    /**
     * 햄버거 만들기
     * @param ingredient 전해지는 재료의 정보를 나타내는 정수 배열
     * @return 포장하는 햄버거의 개수
     * 햄버거 포장 순서 : 아래서부터, 빵 – 야채 – 고기 - 빵  (숫자로 1-2-3-1)
     */
    public int solution3(int[] ingredient) {
        int answer = 0;
        // 리스트로 변환
//        List<Integer> ingredientList = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
        List<Integer> ingredientList = new ArrayList<>();
        for (int ingre : ingredient) {
            ingredientList.add(ingre);
        }


        for (int i = 3; i < ingredientList.size(); i++) {
            if (ingredientList.get(i - 3) == 1 && ingredientList.get(i - 2) == 2 &&
                    ingredientList.get(i - 1) == 3 && ingredientList.get(i) == 1) {
                answer++;
                ingredientList.remove(i);
                ingredientList.remove(i - 1);
                ingredientList.remove(i - 2);
                ingredientList.remove(i - 3);
                if (ingredientList.size() >= 4) {
                    i = (i - 3) < 2 ? 2 : i - 3;
                } else {
                    break;
                }
            }
        }

        return answer;
    }

    /**
     * 둘만의 암호
     * @param s 문자열
     * @param skip 건너뛰는 문자열
     * @param index 몇번째 뒤의 알파벳으로 바꾸는가
     * @return 바뀐 알파벳
     */
    public String solution4(String s, String skip, int index) {
        String answer = "";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int position = 0;
            Integer sInt = Integer.valueOf(charArray[i]);
            int j = 1;
            while (j <= index) {
                int asciiCode = (sInt + position + j - 97) % 26 + 97;
                String asciiStr = Character.toString(asciiCode);
                // 포함되지 않으면 카운트 +1
                if (!skip.contains(asciiStr)) {
                    j++;
                } else {
                    // 포함되면 포지션 +1
                    position++;
                }
            }
            // 소문자 ASCII 코드 확인
            int result = (sInt + index + position - 97) % 26;
            answer += Character.toString(result + 97);
        }
        return answer;
    }

    /** 아래 오답 */
//    public String solution(String s, String skip, int index) {
//        String answer = "";
//        for (int i = 0; i < s.length(); i++) {
//            int rightIdx = 0;
//            char sChar = s.charAt(i);
//            for (int j = 0; j < index; j++) {
//                char sCharNum = (char) (sChar + j);
//                if (skip.contains(String.valueOf(sCharNum))) {
//                    rightIdx++;
//                }
//            }
//            // 소문자 ASCII 코드 확인
//            int result = (sChar + index + rightIdx - 97) % 26;
//            answer += String.valueOf((char) (result + 97));
//        }
//        return answer;
//    }
}