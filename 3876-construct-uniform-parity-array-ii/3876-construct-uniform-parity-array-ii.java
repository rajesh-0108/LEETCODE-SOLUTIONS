class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean flag = false;
        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                flag=true;
                minOdd = Math.min(minOdd,nums1[i]);
            }
            else{
                minEven = Math.min(minEven,nums1[i]);
            }
        }
        if(flag==false){
            return true;
        }
        if(minEven>minOdd){
            return true;
        }
        return false;
    }
}