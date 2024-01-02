import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) { // 반환타입이 리스트일 경우
        List<Integer> result = new ArrayList<>();
        Arrays.sort(num_list);

        for (int i = 0; i < 5; i++) { // 가장 작은 5개의 수를 오름차순으로 추출
            result.add(num_list[i]);
        }

        return result;
    }
}