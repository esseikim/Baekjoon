import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<Integer> solution(int[] num_list) {
        List<Integer> resultList = new ArrayList<>();
        // 정렬
        Arrays.sort(num_list);
        // 정렬된 배열에서 가장 작은 5개의 수를 리스트에 추가
        for (int i = 0; i < Math.min(5, num_list.length); i++) {
            resultList.add(num_list[i]);
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        List<Integer> result = solution(num_list);
        System.out.println(result); // 출력: [1, 4, 12, 14, 15]
    }
}