package task.four;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/5/26 12:15
 * @注释
 */
public class ClimbStages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of stages:");
        System.out.println(climbStages(sc.nextInt()));
    }

    public static int climbStages(int x) {

        if (x==1 || x==0) return 1;
        else return climbStages(x-1) +climbStages(x-2);
    }
}
