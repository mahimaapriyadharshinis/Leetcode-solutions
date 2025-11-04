class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++) {
            int index = -1;
           
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }

            int nextGreater = -1;
            for (int j = index + 1; j < n2; j++) {
                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            arr[i] = nextGreater;
        }
        return arr;
    }
}
