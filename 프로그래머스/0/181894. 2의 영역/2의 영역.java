import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int first = -1;
        int last = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        if(first == -1){
            return Collections.singletonList(-1);
        }
        for(int i = first; i <= last; i++){
            answer.add(arr[i]);
        }
        return answer;
    }
}