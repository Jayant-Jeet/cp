//  https://codeforces.com/problemset/problem/339/B

import java.util.*;
 
public final class XeniaAndRingroad {
    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n,m;
		n= scr.nextInt();
        m= scr.nextInt();
        // res SHOULD BE long type
        long res=0;
        int[] tasks = new int[m];
        for(int i=0;i<m;i++) {
            tasks[i]=scr.nextInt();
        }
        int position=1;
        for(int j=0;j<m;j++) {
            if(tasks[j]>=position) {
                res+=tasks[j]-position;
            } else {
                res+=n-position+tasks[j];
            }
            position=tasks[j];
        }
        System.out.println(res);
        scr.close();
    }
}
