import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i : array){
            sb.append(i);
        }
        char[] numArr = sb.toString().toCharArray();
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] == '7'){
                answer++;
            }
        }
        return answer;
    }
}