class Solution {
    public int solution(int n) {
        int num = 7;
        int answer = 0;
        if(n > 0 && n <= 100){
            if(n % num == 0){
                answer = n / num;
            }else{
                answer = n / num + 1;
            }
        }
        return answer;
    }
}