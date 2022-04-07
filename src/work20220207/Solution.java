package work20220207;

import java.util.Arrays;

public class Solution {


    /**
     * 给定一个数组 prices ，其中 prices[i] 表示股票第 i 天的价格。
     *
     * 在每一天，你可能会决定购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以购买它，然后在 同一天 出售。
     * 返回 你能获得的 最大 利润 。
     * @param prices
     * @return
     */

    public int maxProfit(int[] prices) {
        //贪心算法，局部最优解
        if (prices==null || prices.length<2) return 0;
        int max = prices.length;
        int result = 0;
        for (int i =1;i<max;i++){
            int res = prices[i] - prices[i-1];
            if (res>0){
                result = res + result;
            }
        }
        return result;
    }

    /**
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
     *
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     *
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhbqj/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param s
     */

    public void reverseString(char[] s) {
        int length = s.length;
        if(length<2) System.out.println(s);
        for (int i =0;i<length/2;i++){
            char tmp = s[i];
            s[i]=s[length-1-i];
            s[length-1-i]=tmp;
        }
        System.out.println(s);
    }

    public void reverseString_1(char[] s) {
        int length = s.length;
        if(length<2) System.out.println(s);
        for (int l =0,r=length-1;l<length/2;l++,r--){
            char tmp = s[l];
            s[l]=s[r];
            s[r]=tmp;
        }
        System.out.println(s);
    }


    /**
     * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
     *
     * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
     *
     * 将最终结果插入 nums 的前 k 个位置后返回 k 。
     *
     * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 判题标准:
     *
     * 系统会用下面的代码来测试你的题解:
     *
     * int[] nums = [...]; // 输入数组
     * int[] expectedNums = [...]; // 长度正确的期望答案
     *
     * int k = removeDuplicates(nums); // 调用
     *
     * assert k == expectedNums.length;
     * for (int i = 0; i < k; i++) {
     *     assert nums[i] == expectedNums[i];
     * }
     * 如果所有断言都通过，那么您的题解将被 通过。
     *
     *
     *
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        /**
         * 循环nums，判断上升则记录
         */
        if (nums.length<2) return nums.length;
        int j=1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }

    /**
     * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     * 提示：
     *
     * 1 <= nums.length <= 105
     * -231 <= nums[i] <= 231 - 1
     * 0 <= k <= 105
     *
     * 进阶：
     *
     * 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。
     * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
     *
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @param k
     */

    public void rotate(int[] nums, int k) {
        int[] new_nums = new int[nums.length];
        for (int i =0;i<nums.length;i++){
            new_nums[(k+i)%nums.length-1]=nums[i];
        }
        System.out.println(Arrays.toString(new_nums));
    }
}
