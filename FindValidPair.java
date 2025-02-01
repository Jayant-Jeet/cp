//  https://leetcode.com/contest/biweekly-contest-149/problems/find-valid-pair-of-adjacent-digits-in-string/description/
 
public final class FindValidPair {

    public static String findValidPair(String s) {
        int freq[] = new int[10];
        for(int j=0; j<s.length(); j++) {
            int dgt = Integer.parseInt(s.substring(j, j+1));
            freq[dgt]++;
        }
        //System.out.println(freq[5]);
        for(int i=0; i<s.length()-1; i++) {
            String sub = s.substring(i, i+2);
            //System.out.println(sub);
            int dgt1 = Integer.parseInt(sub.substring(0,1));
            int dgt2 = Integer.parseInt(sub.substring(1,2));
            if(freq[dgt1] == dgt1 && freq[dgt2] == dgt2 && dgt1 != dgt2) {
                return sub;
            }
        }
        return "";
    }

    public static void main(String[] args) {
		String input="22";
        System.out.println(findValidPair(input));
    }
}
