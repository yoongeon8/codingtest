class Solution {
    public String[] solution(String[] strArr) {
        String[] temp = new String[strArr.length];
        int index = 0;
        for(String word : strArr){
            if(!word.contains("ad")){
                temp[index] = word;
                index++;
            }
        }
        String[] answer = new String[index];
        for(int i = 0; i < index; i++){
            answer[i] = temp[i];
        }
        return answer;
    }
}