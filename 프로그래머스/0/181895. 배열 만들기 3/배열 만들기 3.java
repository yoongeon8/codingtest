import java.util.List;
import java.util.ArrayList;
class Solution {
    public List solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            int first = intervals[i][0];
            int last = intervals[i][1];
            for(int j = first; j <= last; j++){
                answer.add(arr[j]);
            }
        }
        return answer;
    }
}