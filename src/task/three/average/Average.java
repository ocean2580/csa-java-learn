package task.three.average;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/5/12 18:45
 * @注释
 */
public class Average {

    public static void main(String[] args) {
        average();
    }

    public static void average() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int N = sc.nextInt();
        System.out.println("Please input "+N+" numbers to calculate the average:");
        int[] arr = new int[N];
        int flag  = 1;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            try {
                if (arr[i] < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("The number you input should be positive or zero! Please input it again:");
                arr[i] = sc.nextInt();
                if (arr[i] < 0) flag = 0;
                while(flag == 0) {
                    System.out.println("The number you input should be positive or zero! Please input it again:");
                    arr[i] = sc.nextInt();
                    if (arr[i] >= 0) flag = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum+=arr[i];
        }

        System.out.println("Average is " + sum/N);
    }
}
