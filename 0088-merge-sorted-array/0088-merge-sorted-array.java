class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        // ✅ No need for new1/new2 copies – we can use nums1[0..m-1] and nums2 directly.
        // ✅ But to stay close to your structure, keep ans[] and Bubble Sort.
        int[] ans = new int[m + n];
        int flag = 0;

        // copy first m elements of nums1
        for (int i = 0; i < m; i++) {
            ans[flag++] = nums1[i];
        }
        // copy all elements of nums2
        for (int j = 0; j < n; j++) {
            ans[flag++] = nums2[j];
        }

        int len = m + n;

        // bubble sort the combined array
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (ans[j] > ans[j + 1]) {
                    int temp = ans[j];
                    ans[j] = ans[j + 1];
                    ans[j + 1] = temp;
                }
            }
        }

        // ✅ Write the sorted result back into nums1
        for (int k = 0; k < len; k++) {
            nums1[k] = ans[k];
        }

        // ✅ Optional: clean printing (no trailing comma)
        System.out.print("[");
        for (int k = 0; k < len; k++) {
            System.out.print(ans[k]);
            if (k < len - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}
