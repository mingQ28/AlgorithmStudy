package 박민서.BaekJoon;

import java.io.*;
import java.util.*;

public class BOJ_10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] arr = new String[n][2];
        for(int i = 0; i < n; i++){
            arr[i] = br.readLine().split(" ");
        }   
        Arrays.sort(arr, (a, b) -> {
            int aa = Integer.parseInt(a[0]);
            int bb = Integer.parseInt(b[0]);
            if(aa != bb)
                return Integer.compare(aa, bb);
            return 0;
        });
        for(String[] str : arr){
            System.out.println(str[0] + " " + str[1]);
        }
    }
}
