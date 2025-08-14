package 박민서.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003{
    private static int[] count = new int[3];
    private static int fibonacci(int n){
    if (n == 0) {
        // System.out.println("0");
        count[0]++;
        return 0;
    } else if (n == 1) {
        // System.out.println("1");
        count[1]++;
        return 1;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] fibo = new int[t];
        for(int i = 0; i < t; i++){
            fibo[i] = Integer.parseInt(br.readLine());
            fibonacci(fibo[i]);
        }
        System.out.println(count[0] + " " + count[1]);

    }
}