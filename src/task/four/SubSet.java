package task.four;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class SubSet {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();//存储结果
        int n = nums.length;//数组长度
        Deque<Integer> queue = new ArrayDeque<>(n);//辅助队列
        ans.add(new ArrayList<Integer>(queue));//空集
        for(int i = 0; i < n; i++){
            queue.addLast(nums[i]);//入队一个元素
            dfs(n, i, nums, queue, ans);//继续深搜枚举
            queue.removeLast();//出队一个元素
        }
        return ans;
    }

    //n是长度，k是枚举到第几个元素
    static void dfs(int n, int k, int[] nums,  Deque<Integer> queue, List<List<Integer>> ans){
        if(k >= n){//超过数组长度
            return;
        }
        ans.add(new ArrayList<Integer>(queue));//加入新的集合
        for(int i = k + 1; i < n; i++){//每次都从k+1开始，保证不重复枚举前面元素
            queue.addLast(nums[i]);//入队
            dfs(n, i, nums, queue, ans);//继续深搜枚举
            queue.removeLast();//出队
        }
    }
}
