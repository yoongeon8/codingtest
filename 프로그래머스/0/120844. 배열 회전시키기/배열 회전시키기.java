class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int leng = numbers.length;
        if(direction.equals("right")){
            for(int i = 1; i < leng; i++){
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[leng-1];
        }
        else{
            for(int i = 1; i < leng; i++){
                answer[i-1] = numbers[i];
            }
            answer[leng-1] = numbers[0];
        }
        return answer;
    }
}