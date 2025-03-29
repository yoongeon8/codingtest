class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
        }
        int max = 1;
        for(int i = 0; i < num_list.length; i++){
            max *= num_list[i];
        }
        int pow = (int)Math.pow(sum, 2);
        if(pow > max){
            answer = 1;
        }
        else if(pow < max){
            answer = 0;
        }
        return answer;
    }
}