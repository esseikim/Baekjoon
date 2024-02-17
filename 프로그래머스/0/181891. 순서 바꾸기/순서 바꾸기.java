import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length];
        
        // n 번째 이후의 원소들을 결과 배열에 추가
        int index = 0;
        for (int i = n; i < num_list.length; i++) {
            result[index++] = num_list[i];
        }
        
        // n 번째까지의 원소들을 결과 배열에 추가
        for (int i = 0; i < n; i++) {
            result[index++] = num_list[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};
        int[] result1 = sol.solution(num_list1, 1);
        System.out.println(Arrays.toString(result1)); // 출력: [1, 6, 2]
        int[] result2 = sol.solution(num_list2, 3);
        System.out.println(Arrays.toString(result2)); // 출력: [7, 5, 5, 2, 1]
    }
}
