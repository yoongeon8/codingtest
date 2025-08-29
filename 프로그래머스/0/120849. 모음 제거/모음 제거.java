class Solution {
    public String solution(String my_string) {
        String[] values = {"a","e","i","o","u"};
        for(String v : values){
            my_string = my_string.replaceAll(v, "");
        }

        return my_string;
    }
}