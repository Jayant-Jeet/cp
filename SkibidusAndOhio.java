//  https://codeforces.com/contest/2065/problem/B

import java.util.*;
 
public final class SkibidusAndOhio {
    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t;
		t= scr.nextInt();
        while(t-->0) {
            String input = scr.next();
            int min = input.length();
            for(int i=1; i<input.length(); i++) {
                char ch = input.charAt(i);
                char prev = input.charAt(i-1);
                if(ch == prev) {
                    min=1;
                    break;
                }
            }
            System.out.println(min);
        }
        scr.close();
    }
}
