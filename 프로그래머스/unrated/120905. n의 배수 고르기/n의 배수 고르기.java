import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> resultList = new ArrayList<>();

        for (int num : numlist) {
            if (num % n == 0) {
                resultList.add(num);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray(); // 리스트를 배열로 변환하여 반환
    }
}