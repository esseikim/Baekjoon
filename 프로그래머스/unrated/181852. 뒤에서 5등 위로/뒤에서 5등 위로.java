import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열을 복사하여 정렬
        int[] sortedArr = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(sortedArr); // 배열을 오름차순으로 정렬

        int[] result = new int[num_list.length - 5]; // 결과 배열의 크기는 num_list.length - 5

        // 가장 작은 5개의 수를 제외한 수를 결과 배열에 담음
        for (int i = 5; i < num_list.length; i++) {
            result[i - 5] = sortedArr[i];
        }

        return result;
    }
}