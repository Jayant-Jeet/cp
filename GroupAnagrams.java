//  https://leetcode.com/problems/group-anagrams/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            if(map.containsKey(String.valueOf(arr))) {
                ArrayList<String> list = (ArrayList<String>) map.get(String.valueOf(arr));
                list.add(str);
                map.put(String.valueOf(arr), list);
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(arr), list);
            }
        }
        ArrayList<List<String>> res = new ArrayList<>();
        
        for(String key: map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    }

    public static void main(String[] args) {
		String[] input={"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams obj = new GroupAnagrams();
        System.out.println(obj.groupAnagrams(input));
    }
}
