class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s, e+1);
        String ss = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ss = ss + str.charAt(i);
        }
        System.out.println(ss);
        StringBuffer sb = new StringBuffer(my_string);
        sb.replace(s, e+1, ss);
        String answer = sb.toString();
        
        return answer;
    }
}