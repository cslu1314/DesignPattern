package guanjianzi;

public class MidNumTwoArray {
    public static void main(String[] args) {
//        int[] nums1 = {1, 3};
//        int[] nums2 = {2};
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if (len1 == 0) {
            if (len2 % 2 == 0) {
                return (nums2[len2 / 2 - 1] + nums2[len2 / 2]) / 2.0;
            } else {
                return (nums2[len2 / 2]);
            }
        }
        if (len2 == 0) {
            if (len1 % 2 == 0) {
                return (nums1[len1 / 2 - 1] + nums1[len1 / 2]) / 2.0;
            } else {
                return nums1[len1 / 2];
            }
        }

        int[] nums = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }

        while (i < len1) {
            nums[k++] = nums1[i++];
        }
        while (j < len2) {
            nums[k++] = nums2[j++];
        }

        if ((len1 + len2) % 2 == 0) {
            return (nums[(len1 + len2) / 2 - 1] + nums[(len1 + len2) / 2]) / 2.0;
        } else {
            return nums[(len1 + len2) / 2];
        }
    }

}
