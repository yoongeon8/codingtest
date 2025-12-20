import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> lists = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++){
                    lists.add(arr[i]);
                }
            }else{
                for(int k = 0; k < arr[i]; k++){
                    lists.remove(lists.size() - 1);
                }
            }
        }
        int[] answer = lists.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}