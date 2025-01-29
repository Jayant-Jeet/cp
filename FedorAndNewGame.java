//  https://codeforces.com/problemset/problem/467/B

import java.util.*;
 
public final class FedorAndNewGame {
    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n,m,k;
		n= scr.nextInt();
        m= scr.nextInt();
        k= scr.nextInt();
        int res=0;
        int[] soldiers = new int[m+1];
        for(int i=0;i<=m;i++) {
            soldiers[i]=scr.nextInt();
        }
        int target=soldiers[m];
        for(int j=0;j<m;j++) {
            int val = soldiers[j];
            int diff = Math.abs(Integer.bitCount(target^val));
            if(diff<=k) {
                res++;
            }
        }
        System.out.println(res);
        scr.close();
    }
}
