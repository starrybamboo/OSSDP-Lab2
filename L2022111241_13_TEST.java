import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class L2022111241_13_TEST {

    // 测试用例1：正常情况
    @Test
    public void testSortColors_HappyPath() {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    // 测试用例2：只有两个颜色
    @Test
    public void testSortColors_TwoColors() {
        Solution solution = new Solution();
        int[] nums = {2, 0, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    // 测试用例3：只有一种颜色
    @Test
    public void testSortColors_OneColor() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 1};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{1, 1, 1, 1}, nums);
    }

    // 测试用例4：空数组
    @Test
    public void testSortColors_EmptyArray() {
        Solution solution = new Solution();
        int[] nums = {};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{}, nums);
    }

    // 测试用例5：全部是红色
    @Test
    public void testSortColors_AllRed() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 0};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 0}, nums);
    }

    // 测试用例6：全部是蓝色
    @Test
    public void testSortColors_AllBlue() {
        Solution solution = new Solution();
        int[] nums = {2, 2, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{2, 2, 2}, nums);
    }

    // 测试用例7：随机顺序
    @Test
    public void testSortColors_RandomOrder() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 0, 1, 0, 2};
        solution.sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }
}
