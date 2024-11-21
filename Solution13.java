/*
 * @Description:
 * 颜色分类
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * 
 * 示例 1：
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 
 * 示例 2：
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 */

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

class Solution {
    /**
     * 使用双指针（荷兰国旗问题）解决颜色分类问题。
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 
     * @param nums 包含 0、1、2 的数组
     */
    public void sortColors(int[] nums) {
        int left = 0; // 指向 0 的插入位置
        int right = nums.length - 1; // 指向 2 的插入位置
        int i = 0; // 当前遍历指针

        // 遍历数组
        while (i <= right) {
            if (nums[i] == 0) {
                // 将 0 放到最左边
                swap(nums, i, left);
                left++;
                i++;
            } else if (nums[i] == 2) {
                // 将 2 放到最右边
                swap(nums, i, right);
                right--;
            } else {
                // 如果是 1，直接跳过
                i++;
            }
        }
    }

    /**
     * 辅助方法：交换数组中的两个元素
     * 
     * @param nums 数组
     * @param i    元素索引
     * @param j    元素索引
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}