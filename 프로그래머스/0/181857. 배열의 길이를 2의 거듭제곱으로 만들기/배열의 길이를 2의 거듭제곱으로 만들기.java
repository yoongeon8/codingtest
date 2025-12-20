import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int leng = 1;
        while(leng < arr.length){
            leng *= 2;
        }
        int[] answer = Arrays.copyOf(arr, leng);
        return answer;
    }
}