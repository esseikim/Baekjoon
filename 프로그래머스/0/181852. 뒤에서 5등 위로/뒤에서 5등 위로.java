import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        // 원본 배열을 정렬
        Arrays.sort(num_list); 

        int[] result = new int[num_list.length - 5]; // 결과 배열의 크기는 num_list.length - 5

        // 가장 작은 5개의 수를 제외한 수를 결과 배열에 담음
        for (int i = 5; i < num_list.length; i++) {
            result[i - 5] = num_list[i];
        }

        return result;
    }
}
