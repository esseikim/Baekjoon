import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        return Math.max(numbers[length - 1] * numbers[length - 2], numbers[0] * numbers[1]);
    }
}
