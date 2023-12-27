import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                result.add(a);
            }
        }

        // ArrayList를 int 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray(); // toArray()를 사용하여 ArrayList를 int 배열로 변환하여 반환
    }
}