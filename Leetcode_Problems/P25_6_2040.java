public class P25_6_2040 {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int min=0, max=0;
        int count=0;
        int i=0, j=0;
        int result=0;
        if(nums1[0]>=0 && nums2[0]>=0){
            while(i<nums1.length && j<nums2.length){
                result = nums1[i] * nums2[j];
                if(count == k-1) {
                    return result;
                }
                count++;
                if(nums1[i+1]>nums2[j+1])
                    j++;
                else
                    i++;
            }   
        }
        else if(nums1[0]<0 && nums2[0]>=0){
            while(i<nums1.length && j<nums2.length){
                result = nums1[i] * nums2[nums2.length-1-j];
                if(count == k-1) {
                    return result;
                }
                count++;
                if(Math.abs(nums1[i+1])>nums2[nums2.length-j-2])
                    j++;
                else
                    i++;
            }   
        }
        else if(nums1[0]>=0 && nums2[0]<0){
            while(i<nums1.length && j<nums2.length){
                result = nums2[i] * nums1[nums1.length-1-j];
                if(count == k-1) {
                    return result;
                }
                count++;
                if(Math.abs(nums2[i+1])>nums1[nums1.length-j-2])
                    j++;
                else
                    i++;
            }   
        }
        else{
            return -1; // This case is not handled in the original code, but we can return -1 for negative products.
        }
        return -1; // If k is out of bounds or no valid product found.
    }

    public static void main(String[] args) {
        P25_6_2040 obj = new P25_6_2040();
        int[] nums1 = {-4,-2,0,3};
        int[] nums2 = {2, 4};
        long k = 6;
        long result = obj.kthSmallestProduct(nums1, nums2, k);
        System.out.println("The " + k + "th smallest product is: " + result);
    }
}
