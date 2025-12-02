import java.util.*;
class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List answer = new ArrayList<>();
        for(Integer a : arr){
            answer.add(a);
        }
        for(Integer a : arr){
            for(Integer de : delete_list){
                if(a.equals(de)){
                    answer.remove(a);
                }
            }
        }
        return answer;
    }
}