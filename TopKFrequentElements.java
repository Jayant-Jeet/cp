// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//  
 
public final class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Map<Integer, Integer> sortedMapDesc = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        
        for(int i=0; i<k; i++) {
            res[i] = (int) sortedMapDesc.keySet().toArray()[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input={1,1,1,2,2,3};
        int k=2;
        TopKFrequentElements obj = new TopKFrequentElements();
        int[] res = obj.topKFrequent(input, k);
        for(int r : res) {
            System.out.print(r + " ");
        }
    }
}
