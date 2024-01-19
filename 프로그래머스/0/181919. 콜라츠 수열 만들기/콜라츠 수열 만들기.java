import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> collatzSequence = new ArrayList<>();
        collatzSequence.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            collatzSequence.add(n);
        }

        return collatzSequence;
    }
}
