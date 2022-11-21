package programmers.basic.level0;

public class Day04 {

    /**
     * 피자 나눠먹기 (1) : 7조각 피자
     * @param n 피자 나눠먹을 사람 수
     * @return n명이 1조각이상 먹기 위한 피자수
     */
    public int solution1(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = (n / 7) + 1;
        }
        return answer;
    }

    /**
     * 피자 나눠먹기 (2) : 6조각 피자
     * @param n 피자 나눠먹을 사람 수
     * @return n명이 피자 남기지 않고 모두 같은 조각 먹기위한 최소피자수
     */
    public int solution2(int n) {
        int pizza = 1; // 피자판수
        int pizzaSlice = 6; // 한판당 조각수
        int totalPizzaSlice = pizza * pizzaSlice;
        while (true) {
            // 총 피자조각을 인원수로 나누어 떨어지면 피자 판수리턴
            if (totalPizzaSlice % n == 0) {
                return pizza;
            } else {
                // 아니면 판수 추가
                totalPizzaSlice += pizzaSlice;
                pizza++;
            }
        }
    }

    /**
     * 피자 나눠먹기 (3) : 2조각 ~ 10조각 원하는 갯수로 잘라줌
     * @param slice 피자조각수
     * @param n 인원수
     * @return 인당 최소 1조각이상 먹을때 필요한 피자 판수
     */
    public int solution3(int slice, int n) {
        int pizza = 1;
        int totalSlice = pizza * slice; // 총 피자조각수
        while (true) {
            // 총 조각수를 인원수로 나눴을때 몫이 0보다 크면 최소 1조각보장
            if (totalSlice / n > 0) {
                return pizza;
            } else {
                // 피자추가
                totalSlice += slice;
                pizza++;
            }
        }
    }

    /**
     * 배열의 평균값
     * @param numbers 정수배열
     * @return numbers 원소의 평균값
     */
    public double solution4(int[] numbers) {
        double answer = 0;
        int total = 0;
        int count = 0;
        for (int num : numbers) {
            total += num;
            count++;
        }
        answer = (double) total / count;
        return answer;
    }

}
