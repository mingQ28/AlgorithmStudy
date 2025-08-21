package 박민서.Programmers;

import java.util.*;
class Solution {
    public int solution(String t, String p) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int len = p.length();
        int count = 0;
        // 먼저 314, 141 씩 p의 길이수만큼 잘라서 리스트에 추가
        for(int i = 0; i < t.length() - len + 1; i++){
            list.add(t.substring(i, i + len));
        }
        // p의 값과 리스트의 값을 비교해서 카운트 증가
        for(int i = 0; i < list.size(); i++){
            if(Long.parseLong(list.get(i)) <= Long.parseLong(p))
                count++;
        }
        return count;
            
    }
}
