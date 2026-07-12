class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n= nums.length;
        int left=0;
        int currPro=1;
         int count = 0;
       for(int right=0; right<n; right++){
            currPro= currPro * nums[right]; //expand
              while(currPro >= k){  // update the window
                       currPro = currPro/nums[left];            
                        left++;
            }
            count += right - left + 1;
            }
return count;
 }
}