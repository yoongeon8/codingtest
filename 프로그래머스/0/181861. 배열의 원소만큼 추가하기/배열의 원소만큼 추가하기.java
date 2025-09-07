import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrs = new ArrayList<>();
        int n = 0;
        for(int i = 0; i < arr.length; i++){
            n = arr[i];
            for(int j = 0; j < n; j++){
                arrs.add(n);
            }
        }
        int[] answer = arrs.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}