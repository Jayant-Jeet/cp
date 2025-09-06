//  https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;

public final class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> elements = new HashSet<>();
        for(int num: nums){
            if(elements.contains(num))
                return true;
            elements.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] input = {1, 2, 3, 1};
        System.out.println(cd.containsDuplicate(input));
    }
}