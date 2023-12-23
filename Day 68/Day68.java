public class Day68 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> al = new ArrayList<>();
            
            for(int i = 0; i< nums1.length ; i++){
              set.add(nums1[i]);
            }
            for(int i = 0 ; i < nums2.length ; i++){
              if(set.contains(nums2[i])){
                al.add(nums2[i]);
                set.remove(nums2[i]);
              }
            }
            int arr[] = new int[al.size()];
            for(int i = 0 ; i< arr.length;i++){
              arr[i] = al.get(i);
            }
            return arr;
        }
    }
}
