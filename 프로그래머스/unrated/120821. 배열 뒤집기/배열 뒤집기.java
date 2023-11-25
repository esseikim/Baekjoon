import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : num_list) {
            list.add(num);
        }
        
        Collections.reverse(list);
        
        int[] reversedArray = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            reversedArray[i] = list.get(i);
        }
        
        return reversedArray;
    }
}
