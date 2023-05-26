package task.four;


import java.util.Scanner;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/5/26 12:02
 * @注释
 */
public class NumReverse {

    public static void main(String[] args) {
        numReverse();
    }

    public static void numReverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the x = ");
        int x = sc.nextInt();
        boolean flag = true;
        if (x < 0) flag = false;
        char[] chars = Integer.valueOf(Math.abs(x)).toString().toCharArray();
        for (int i = 0, j = chars.length-1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        if (Integer.valueOf(new String(chars)) < Integer.MIN_VALUE || Integer.valueOf(new String(chars)) > Integer.MAX_VALUE) {
            System.out.println(0);
            System.exit(0);
        }
        if (!flag) System.out.println("-"+new String(chars));
        else System.out.println(new String(chars));

    }
}
