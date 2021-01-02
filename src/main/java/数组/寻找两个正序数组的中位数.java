package 数组;

import java.util.Arrays;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2020/12/28 14:18
 */
public class 寻找两个正序数组的中位数 {
    /**
     * 方法一 直接合并
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArraysSolution1(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int left = (len1 + len2 + 1) / 2;
        int right = (len1 + len2 + 2) / 2;

        int leftNum=0;
        int rightNum=0;
        int i = 0, j = 0;
        int index = 0;


        while (i < len1 && j < len2) {
            if (nums1[i] < nums2[j]) {
                i++;
                index++;
                if (index == left) {
                    leftNum = nums1[i];
                }
                if (index == right) {
                    rightNum = nums1[i];
                }
            } else {
                j++;
                index++;
                if (index == left) {
                    leftNum = nums2[j];
                }
                if (index == right) {
                    rightNum = nums2[j];
                }
            }
        }
        if(i == len1 && j < len2){
            j++;
            index++;
            if (index == left) {
                leftNum = nums2[j];
            }
            if (index == right) {
                rightNum = nums2[j];
            }
        }
        if(i < len1 && j == len2){
            i++;
            index++;
            if (index == left) {
                leftNum = nums1[i];
            }
            if (index == right) {
                rightNum = nums1[i];
            }
        }
        return (leftNum+rightNum)/2;

    }
}
