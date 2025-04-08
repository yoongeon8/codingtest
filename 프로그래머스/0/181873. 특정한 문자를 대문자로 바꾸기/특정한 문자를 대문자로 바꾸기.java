class Solution {
    public String solution(String my_string, String alp) {
        String upperalp = alp.toUpperCase();
        return my_string.replace(alp, upperalp);
    }
}