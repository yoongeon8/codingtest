import java.util.*;

public class Solution {
    public int solution(String[] strArr) {
        // 문자열 길이를 key로 하고, 해당 길이의 문자열 개수를 value로 하는 Map
        Map<Integer, Integer> lengthCount = new HashMap<>();

        // 각 문자열의 길이를 세어서 Map에 저장
        for (String str : strArr) {
            int len = str.length();
            lengthCount.put(len, lengthCount.getOrDefault(len, 0) + 1);
        }

        // 가장 큰 value (최대 그룹의 크기)를 찾기
        int max = 0;
        for (int count : lengthCount.values()) {
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}