import java.util.OptionalInt; // OptionalInt는 값이 있을 수도 있고 없을 수도 있는 정수 값을 나타내는 데 사용된다.
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        OptionalInt firstNegativeIndex = IntStream.range(0, num_list.length)
            .filter(i -> num_list[i] < 0)
            .findFirst(); // 음수가 있는 첫 번째 인덱스 찾기

        return firstNegativeIndex.orElse(-1); // 음수가 없으면 -1 반환
    }
}
