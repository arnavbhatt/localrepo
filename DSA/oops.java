import java.util.*;
public class oops {
    public static void main(String[] args) {

        // ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.get(0));

        // HashSet
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println(set);
        System.out.println(it.next());

        // HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Arnav", 20);
        map.put("Rohit", 30);
        map.put("Rohit", 40);

        System.out.println(map);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());    
        }
        
        // key set in map
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
        
        // class Solution {
        //     public int lenOfLongestSubarr(int[] arr, int k) {
                
        //         int sum = 0;
        //         int maxLength = 0;
        //         HashMap<Integer,Integer> map = new HashMap<>();
                
        //         for(int i=0;i<arr.length;i++){
        //             sum += arr[i];
        //             if(sum == k) maxLength = Math.max(maxLength,i+1);
        //             int rem = sum-k;
        //             if(map.containsKey(rem)){
        //                 int length = i - map.get(rem);
        //                 maxLength = Math.max(maxLength,length); 
        //             }
        //             if(!map.containsKey(sum)){
        //                 map.put(sum,i);
        //             }
        //         }
        //     return maxLength;    
        //     }
        // }

    }
    
}