class Solution {
    public String[] solution(String my_string) {
        String temp = my_string.trim();
        String[] answer = temp.split("\\s+");
        return answer;
    }
}