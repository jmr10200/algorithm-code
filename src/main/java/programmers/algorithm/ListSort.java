package programmers.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {
        // 리스트 확인
        int[] numbers = {5, 2, 1, 3, 7, 4, 6, 10, 9, 8};
        ListSort sortTest = new ListSort();

        sortTest.arrayListSort(numbers);

        // 배열
        System.out.println("== 배열 == ");
        sortTest.sortIntAndInteger();
    }

    /**
     * 리스트
     * ArrayList 정렬
     */
    public void arrayListSort(int[] number) {
        List<Integer> arrayList = new ArrayList<>();

        for (int num : number) {
            arrayList.add(num);
        }
        // 내림차순
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("==== ArrayList 내림차순 ====");
        System.out.println(printIntegerList(arrayList));
        System.out.println();

        // 오름차순
        arrayList.sort(Comparator.reverseOrder());
        System.out.println("==== ArrayList 오름차순 ====");
        System.out.println(printIntegerList(arrayList));
        System.out.println();
    }

    private String printIntegerList(List<Integer> list) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * 배열 정렬
     * int[] 배열
     * Integer[] 배열
     */
    public void sortIntAndInteger() {

        int[] intArr = new int[]{2, 5, 3, 1, 4};

        // 내림차순
        Arrays.sort(intArr);

        System.out.println("==== int[] 내림차순 ====");
        System.out.println(printIntArr(intArr));
        System.out.println();

        // 오름차순
        // primitive Type 을 Wrapper 클래스로 박싱해주어야 reverseOrder 사용가능.
        Integer[] intToIntegerArr = Arrays.stream(intArr).boxed().toArray(Integer[]::new);
        Arrays.sort(intToIntegerArr, Comparator.reverseOrder());

        System.out.println("==== int[] 오름차순 ====");
        System.out.println(printIntArr(intToIntegerArr));
        System.out.println();



        Integer[] integerArr = new Integer[]{2, 3, 1, 5, 4};

        // 내림차순
        Arrays.sort(integerArr);

        System.out.println("==== Integer[] 내림차순 ====");
        System.out.println(printIntArr(integerArr));
        System.out.println();

        // 오름차순
        Arrays.sort(integerArr, Comparator.reverseOrder());

        System.out.println("==== Integer[] 오름차순 ====");
        System.out.println(printIntArr(integerArr));
        System.out.println();

    }

    private String printIntArr(int[] intArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i]);
            if (i != intArr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private String printIntArr(Integer[] integerArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < integerArr.length; i++) {
            sb.append(integerArr[i]);
            if (i != integerArr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

}
