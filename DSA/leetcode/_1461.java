package leetcode;
import java.util.*;
public class _1461 {
    public static void main(String[] args) {
        
    }   
}

class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<Integer> set = new HashSet<>();
        int total_nums = 1<<k;
        int allOnes = total_nums - 1;
        int hashCode = 0;
        for (int i=0; i<s.length(); i++) {
            hashCode = ((hashCode << 1) & allOnes) | (s.charAt(i) - '0');
            if( i >= k-1) set.add(hashCode);
        }
        System.out.println(set);
        if(set.size() == total_nums) return true;
        return false;
    }
}
