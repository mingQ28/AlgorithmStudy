/**
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181941
 * 필요한 문법: for문, .length()와 .length의 차이
 */
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i=0; i<arr.length;i++){
            answer += arr[i];
        }
        return answer;
    }
}