import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) {
            result.add(num_list[i]);
        }

        // 리스트를 배열로 변환하여 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
