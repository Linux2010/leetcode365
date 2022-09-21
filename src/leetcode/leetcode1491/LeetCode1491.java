package leetcode.leetcode1491;

/**
 *
 * 1491. 去掉最低工资和最高工资后的工资平均值
 * https://leetcode.cn/problems/average-salary-excluding-the-minimum-and-maximum-salary/\
 *
 */
public class LeetCode1491 {


    /**
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 39.3 MB
     * , 在所有 Java 提交中击败了
     * 31.27%
     * 的用户
     * @param salary
     * @return
     */
    public double average(int[] salary) {

        int max = Math.max(salary[0],salary[1]);
        int min = Math.min(salary[0],salary[1]);
        int res = 0;
        for (int i = 2; i < salary.length; i++) {
            if (salary[i]>max){
                res+=max;
                max = salary[i];
            }else if(salary[i]<min){
                res+=min;
                min= salary[i];
            }else {
                res+=salary[i];
            }
        }
        return (double)res/(salary.length-2);
    }

}
