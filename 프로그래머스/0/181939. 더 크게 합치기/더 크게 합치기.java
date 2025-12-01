class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String number1 = Integer.toString(a);
        String number2 = Integer.toString(b);
        String aTob = number1 + number2;
        String bToa = number2 + number1;
        if(Integer.parseInt(aTob) > Integer.parseInt(bToa)){
            answer = Integer.parseInt(aTob);
        }else{
            answer = Integer.parseInt(bToa);
        }

        return answer;
    }
}