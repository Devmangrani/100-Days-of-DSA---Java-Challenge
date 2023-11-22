package Day 37;

public class Day37 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            ArrayList<Integer> arr = new ArrayList<>();
            int i = 0;
            int j = 0;
            while(i < nums1.length && j <nums2.length){
                if(nums1[i] < nums2[j]){
                    i++;
                }else if (nums1[i] > nums2[j]){
                    j++;
                }else{
                    arr.add(nums1[i]);
                    i++;
                    j++;
                }
            }
            int [] res = new int[arr.size()];
            for( int k = 0 ; k < arr.size() ; k++){
                res[k] = arr.get(k);
            }
            return res;
        }
    }
}
