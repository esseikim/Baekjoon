import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i += 2) {
            oddNumbers.add(i);
        }

        // List를 배열로 변환
        return oddNumbers.stream().mapToInt(i -> i).toArray();
    }
}
