public class Solution {
    public int solution(String my_string, String target) {
        int index = my_string.indexOf(target);
        
        if (index != -1) {
            return 1;
        } else {
            return 0;
        }
    }
}
