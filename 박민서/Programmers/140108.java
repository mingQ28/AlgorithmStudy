package 박민서.Programmers;

import java.util.*;
class Solution {
    public int solution(String s) {
        int count = 0;
        char x = s.charAt(0);
        String str = "";
        int xc = 0; // x가 나온 횟수
        int xnc = 0; // x가 아닌 횟수
        for(int i = 0; i < s.length()- 1; i++){
            if(x == s.charAt(i)) // 먼저 x와 동일한지 확인
                xc++;
            else 
                xnc++;
            // xc == xnc라면, 문자열 분리 횟수 증가
            // x = 그 다음 문자로 변경
            // 문자열, 카운트 초기화
            if(xc == xnc){
                count++;
                x = s.charAt(i + 1);
                xc = 0; xnc = 0;
            }
        }
        // 남은 문자열을 리스트에 추가
        count++;
        return count;
    }
}
