package 박민서.Programmers;

import java.util.*;
class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        char x = s.charAt(0);
        String str = "";
        int xc = 0; // x가 나온 횟수
        int xnc = 0; // x가 아닌 횟수
        for(int i = 0; i < s.length()- 1; i++){
            if(x == s.charAt(i)) // 먼저 x와 동일한지 확인
                xc++;
            else 
                xnc++;
            // xc == xnc 전까지의 문자들을 str에 저장(문자열을 분리하기 위해)
            str += s.charAt(i); 
            // xc == xnc라면, 리스트에 지금까지의 문자열을 추가
            // x = 그 다음 문자로 변경
            // 문자열, 카운트 초기화
            if(xc == xnc){
                list.add(str);
                x = s.charAt(i + 1);
                str = "";
                xc = 0; xnc = 0;
            }
        }
        // 남은 문자열을 리스트에 추가
        list.add(str);
        return list.size();
    }
}
