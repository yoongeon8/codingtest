class Solution {
    public int solution(int order) {
        int answer = 0;
        String n = Integer.toString(order);
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == '3' || n.charAt(i) == '6' || n.charAt(i) == '9'){
                answer += 1;
            }
        }
        return answer;
    }
}