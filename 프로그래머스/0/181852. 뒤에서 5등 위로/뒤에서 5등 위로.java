import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> solution(int[] num_list) {
        // 정수 배열을 리스트로 변환
        List<Integer> numList = new ArrayList<>();
        for (int num : num_list) {
            numList.add(num);
        }
        
        // 리스트를 오름차순으로 정렬
        numList.sort(null);
        
        // 가장 작은 5개의 수를 제외한 수들을 담을 리스트 생성
        List<Integer> resultList = new ArrayList<>(numList.subList(5, numList.size()));
        
        // 결과 반환
        return resultList;
    }

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        List<Integer> result = solution(num_list);
        
        // 결과 출력
        System.out.println(result); // 출력: [15, 32, 38, 46, 56]
    }
}
