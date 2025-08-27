import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        List<Character> li = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                li.add(ch);
            }else{
                if(li.isEmpty()){
                    return false;
                }
                li.remove(li.size() - 1);
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        return li.isEmpty();
    }
}