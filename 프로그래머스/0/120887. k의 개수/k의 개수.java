class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        for(int a = i; a <= j; a++){
            String strA = String.valueOf(a);
            if(strA.contains(strK)){
                String[] arr = strA.split("");
                for(String n : arr){
                    if(n.equals(strK)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}