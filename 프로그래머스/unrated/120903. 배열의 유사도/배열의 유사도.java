import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // s1 배열의 원소들을 set1에 추가
        for (String s : s1) {
            set1.add(s);
        }

        // s2 배열의 원소들을 set2에 추가
        for (String s : s2) {
            set2.add(s);
        }

        // set1과 set2에 공통으로 포함된 원소 수 계산
        int count = 0;
        for (String s : set1) {
            if (set2.contains(s)) {
                count++;
            }
        }

        return count;
    }
}
