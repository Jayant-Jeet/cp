//  https://codeforces.com/contest/2065/problem/A

import java.util.*;
 
public final class SkibidusAndAmogu {
    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t;
		t= scr.nextInt();
        while(t-->0) {
            String input = scr.next();
            String res = input.substring(0, input.length()-2);
            res = res.concat("i");
            System.out.println(res);
        }
        scr.close();
    }
}
