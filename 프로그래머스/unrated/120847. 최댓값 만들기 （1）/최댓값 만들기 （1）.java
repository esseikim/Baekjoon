import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        Integer[] sorted = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(sorted, Collections.reverseOrder());

        return sorted[0] * sorted[1];
    }
}
