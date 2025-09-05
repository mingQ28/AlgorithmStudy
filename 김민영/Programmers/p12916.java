class Solution {
    boolean solution(String s) {
        // boolean answer = true;
        int p = 0;
        int y = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.toLowerCase().charAt(i);
            if(c == 'p') p += 1;
            else if(c == 'y') y +=1;
        }

        boolean answer = (p==y) ? true : false;
        return answer;
    }
}