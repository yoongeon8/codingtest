class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newString = myString.replace('A','X').replace('B','A').replace('X','B');
        if(newString.contains(pat)){
            return 1;
        }
        return answer;
    }
}