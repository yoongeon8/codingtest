class Solution {
    public int solution(String binomial) {
        String[] number = binomial.split(" ");
        int a = Integer.parseInt(number[0]);
        String op = number[1];
        int b = Integer.parseInt(number[2]);
        switch(op){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + op);
        }
    }
}