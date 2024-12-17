package leetcode;
import java.util.*;

class _31{
    public static void main(String[] args) {
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
        int ptr =-1;
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ptr = i;
                break;
            }
        }
        if(ptr>=0){
            for(int i = nums.length-1; i>ptr; i--){
                if (nums[i]>nums[ptr]){
                    int temp = nums[ptr];
                    nums[ptr] = nums[i];
                    nums[i] = temp;
                    Arrays.sort(nums, ptr+1, nums.length);
                    break;
                }
            }
        }
        else{
            Arrays.sort(nums);
        }
    
    }
}
    
