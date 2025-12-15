class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if((x >= -10000000 && x <= 10000000) && n <= 1000){
            answer[0] = x;
            for(int i = 1; i < n; i++){
                answer[i] = answer[i-1] + (long)x;
            }
        }

        return answer;
    }
}