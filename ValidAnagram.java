//  https://leetcode.com/problems/valid-anagram/
 
public final class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] count1 = new int[26];
        for(char ch: s.toCharArray()) {
            int index = (int)(ch - 'a');
            count1[index]++;
        }
        int[] count2 = new int[26];
        for(char ch: t.toCharArray()) {
            int index = (int)(ch - 'a');
            count2[index]++;
        }
        for(int i=0; i<26; i++) {
            if(count1[i]!=count2[i])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(va.isAnagram(s, t));
    }
}
