package task;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {

        System.out.println("1、B     2、B     3、D     4、B     5、D" + "\n");

        showTriangle(4);

        reverseString("happy");

        isPalindrome(12321);

        ShuiXianHua();

        arraysDemo();

    }

    public static void showTriangle(int n) {

        System.out.println("1、打印三⻆");
        // n为行数
        for (int i = 0; i < n; i++) {
            // space
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // line
            System.out.println();
        }

        System.out.println();
    }

    public static void reverseString(String s) {

        System.out.println("2、颠倒字符串");

        char[] chars = s.toCharArray();
        char c;

        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            // swap
            c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
        }

        s = String.valueOf(chars);

        System.out.println(s + "\n");
    }

    public static void isPalindrome(int num) {

        System.out.println("3、回⽂数判断");

        boolean flag = false;
        char[] chars = Integer.valueOf(num).toString().toCharArray();

        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            // judge
            if (chars[i] != chars[j]) {
                flag = false;
                break;
            }
            flag = true;
        }

        if (flag) {
            System.out.println("是的");
        } else
            System.out.println("不是");
        System.out.println();
    }

    public static void ShuiXianHua() {

        System.out.println("4、水仙花数");

        int ge, shi, bai;
        for (int i = 100; i < 999; i++) {
            bai = i/100;
            shi = (i/10) % 10;
            ge = i%10;

            if (i == bai*bai*bai + shi*shi*shi + ge*ge*ge)
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void arraysDemo() { //操作
        System.out.println("5、编写程序计算一个包含10个整数的数组中所包含元素的最小值和最大值之和");
        int[] nums = {2, 1, 10, 83, 64, 45, 66, 88, 77, 99};

//        int temp;
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }

        Arrays.sort(nums);
        System.out.println("min=" + nums[0] + ", max=" + nums[9] + ", sum=" + (nums[0]+nums[9]));
    }

}
