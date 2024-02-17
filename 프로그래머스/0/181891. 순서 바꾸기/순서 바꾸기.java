import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        
        // n 번째 이후의 원소들을 결과 리스트에 추가
        for (int i = n; i < num_list.length; i++) {
            result.add(num_list[i]);
        }
        
        // n 번째까지의 원소들을 결과 리스트에 추가
        for (int i = 0; i < n; i++) {
            result.add(num_list[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};
        List<Integer> result1 = sol.solution(num_list1, 1);
        System.out.println(result1); // 출력: [1, 6, 2]
        List<Integer> result2 = sol.solution(num_list2, 3);
        System.out.println(result2); // 출력: [7, 5, 5, 2, 1]
    }
}