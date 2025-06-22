import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            String str = intStrs[i].substring(s,s+l);
            int n = Integer.parseInt(str);
            if(n > k){
                answer.add(n);
            }
        }
        return answer;
    }
}