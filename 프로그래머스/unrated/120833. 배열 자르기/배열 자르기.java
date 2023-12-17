import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = num1; i <= num2; i++) {
            result.add(numbers[i]);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
