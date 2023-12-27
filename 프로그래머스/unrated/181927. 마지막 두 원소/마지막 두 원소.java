class Solution {
    public int[] solution(int[] num_list) {
        int lastIdx = num_list.length - 1;
        
        // 마지막 원소와 그 전 원소 비교
        if (num_list[lastIdx] > num_list[lastIdx - 1]) {
            // 마지막 원소가 그 전 원소보다 큰 경우
            int diff = num_list[lastIdx] - num_list[lastIdx - 1];
            
            // 새로운 배열을 생성하여 기존 배열 복사
            int[] answer = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            
            // 새로운 값을 추가
            answer[num_list.length] = diff;
            return answer;
        } else {
            // 마지막 원소가 그 전 원소보다 크지 않은 경우
            int doubledValue = num_list[lastIdx] * 2;
            
            // 새로운 배열을 생성하여 기존 배열 복사
            int[] answer = new int[num_list.length + 1];
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            
            // 두 배한 값을 추가
            answer[num_list.length] = doubledValue;
            return answer;
        }
    }
}
