import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        // 삭제할 원소들을 Set에 저장한다.
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }
        
        // 삭제할 원소가 아닌 원소들을 저장할 리스트를 생성한다.
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> result1 = sol.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        System.out.println(result1); // 출력: [293, 395, 678]
        
        List<Integer> result2 = sol.solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43});
        System.out.println(result2); // 출력: [110, 66, 439, 785, 1]
    }
}