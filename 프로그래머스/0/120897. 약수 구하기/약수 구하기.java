import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i * j == n){
                    arr.add(i);
                }   
            }
        }
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}