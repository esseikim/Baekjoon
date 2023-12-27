public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) { 
            result[i] = num_list[i];
        }
        
        return result; // num_list의 첫 번째 원소부터 n번째 원소까지의 모든 원소를 담은 int[] 배열인 result를 반환
    }
}