import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        // 배열을 리스트로 변환
        for (int num : arr) {
            list.add(num);
        }
        
        // delete_list의 원소를 리스트에서 제거
        for (int num : delete_list) {
            while (list.contains(num)) {
                list.remove(Integer.valueOf(num)); // Integer 객체로 변환하여 삭제
            }
        }
        
        // 리스트를 배열로 변환하여 반환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
