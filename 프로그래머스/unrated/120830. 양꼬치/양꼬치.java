class Solution {
    public int solution(int n, int k) {
        int count = 0;
        if (n / 10 > 0) {
            count = n / 10;
        }
        
        int nSum = n * 12000;
        int kSum = k * 2000;
        int kService = count * 2000;
        
        int answer = nSum + kSum - kService;
        return answer;
    }
}
