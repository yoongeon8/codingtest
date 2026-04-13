class Solution {
    public String[] solution(String myStr) {
        String replaceStr = myStr.replaceAll("[abc]+", " ");
        replaceStr = replaceStr.trim();
        if(replaceStr.isEmpty()){
            return new String[]{"EMPTY"};
        }
        String[] answer = replaceStr.split(" ");
        return answer;
    }
}