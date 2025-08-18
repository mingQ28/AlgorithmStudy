/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181919
 * 
 */
import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(n != 1)
        {
            n = (n%2==0) ? n/2 : 3*n+1;
            list.add(n);
        }        
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}