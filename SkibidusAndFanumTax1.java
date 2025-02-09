//  https://codeforces.com/contest/2065/problem/B

import java.util.*;
 
public final class SkibidusAndFanumTax1 {
    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int t;
		t= scr.nextInt();
        while(t-->0) {
            int n, m;
            n= scr.nextInt();
            m= scr.nextInt();
            int[] a= new int[n];
            int[] b= new int[m];
            for(int i=0; i<n; i++) {
                a[i]= scr.nextInt();
            }
            for(int i=0; i<m; i++) {
                b[i]= scr.nextInt();
            }
            /*boolean res = true;
            int x = b[0];
            for(int i=1; i<n-1; i++) {
                int prev = a[i-1];
                int cur = a[i];
                int next = a[i+1];
                if (!(prev <= cur && cur <= next)) {
                    if (((x - prev) <= cur && cur <= next) || (prev <= (x - cur) && (x - cur) <= next) || (prev <= cur && cur <= (x - next)) || ((x - prev) <= (x-cur) && (x-cur) <= next) || ((x - prev) <= cur && cur <= x-next) || (prev <= (x-cur) && (x-cur) <= x-next) || ((x - prev) <= (x-cur) && (x-cur) <= x-next)) {
                        continue;
                    } else {
                        res = false;
                        break;
                    }
                }
                
            }
            if(n==2) {
                if(a[0] <= a[1] || b[0]-a[0] <= a[1] || a[0] <= b[0]-a[1] || b[0]-a[0] <= b[0]-a[1]) {
                    res = true;
                } else {
                    res = false;
                }
            }
            if(res) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            */

            // Sort array b to make it easier to find suitable elements
            Arrays.sort(b);

            boolean canSort = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    // Find a suitable b[j] to make a[i] <= a[i + 1]
                    boolean found = false;
                    for (int j = 0; j < m; j++) {
                        int newAi = b[j] - a[i];
                        //System.out.println("newAi: " + newAi);
                        if (newAi <= a[i + 1] && (i>0 && a[i-1] <= newAi || i==0)) {
                            a[i] = newAi;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        canSort = false;
                        break;
                    }
                }
            }
            //System.out.println(Arrays.toString(a));
            System.out.println(canSort ? "YES" : "NO");
        
        }
        scr.close();
    }
}