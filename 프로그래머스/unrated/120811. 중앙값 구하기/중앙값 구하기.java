import java.util.Arrays;

public class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 배열을 오름차순으로 정렬
        int midIndex = array.length / 2; // 중앙 인덱스 계산

        return array[midIndex]; // 중앙값 반환
    }
}
