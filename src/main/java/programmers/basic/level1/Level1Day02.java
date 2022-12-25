package programmers.basic.level1;

public class Level1Day02 {

    /**
     * 자연수 뒤집어 배열로 만들기
     * @param n
     * @return 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열
     */
    public int[] solution1(long n) {
        int[] answer = {};
        String[] splitN = String.valueOf(n).split("");
        answer = new int[splitN.length];
        for (int i = 0; i < splitN.length; i++) {
            answer[i] = Integer.valueOf(splitN[splitN.length - 1 - i]);
        }
        return answer;
    }

    /**
     * 정수 제곱근 판별
     * @param n
     * @return n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
     */
    public long solution2(long n) {
        long answer = -1;
        double sqrt = Math.sqrt(n);
        long nSqrt = (long) sqrt;
        if (nSqrt * nSqrt == n) {
            answer = (nSqrt + 1) * (nSqrt + 1);
        }
        return answer;
    }

    /**
     * 문자열 내 p와 y의 개수
     * @param s 대소문자 구분하지 않음
     * @return s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False, 없으면 True
     */
    public boolean solution3(String s) {
        boolean answer = false;
        String[] split = s.toLowerCase().split("");
        int cntY = 0;
        int cntP = 0;
        for (String sp : split) {
            if (sp.equals("p")) {
                cntP++;
            } else if (sp.equals("y")) {
                cntY++;
            }
        }
        if (cntP == 0 && cntY == 0 || cntP == cntY) {
            answer = true;
        }
        return answer;
    }

    /**
     * x만큼 간격이 있는 n개의 숫자
     * @param x
     * @param n
     * @return x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트
     */
    public long[] solution4(int x, int n) {
        long[] answer = new long[n];
        // 등차수열
        for (int i = 1; i <= n; i++) {
            answer[i - 1] = i * (long) x; // 10000000 인 경우 때문에 long
        }
        return answer;
    }

    /**
     * 문자열을 정수로 바꾸기
     * @param s
     * @return 정수
     */
    public int solution5(String s) {
        int answer = 0;
        answer = Integer.valueOf(s);
        return answer;
    }

}
