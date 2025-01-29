//  https://codeforces.com/problemset/problem/266/B

import java.util.*;
 
public final class QueueAtTheSchool {
    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n,t;
		n= scr.nextInt();
        t= scr.nextInt();
        String inputString = scr.next();
		while(t-->0) {
			inputString = inputString.replace("BG", "GB");
        }
        System.out.println(inputString);
        scr.close();
    }
}
