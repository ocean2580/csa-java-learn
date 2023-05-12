package task.three.grade;

import java.util.Scanner;

/**
 * @version 1.0
 * @Author Oliver
 * @Date 2023/5/12 18:36
 * @注释
 */
public class Grade {

    public static void main(String[] args) {
        judge();
    }

    public static void judge() {
        Scanner sc = new Scanner(System.in);
        try {

            int grade = sc.nextInt();
            if (grade >= 0 && grade <= 100) System.out.println("grade: "+grade);
            else {
                throw new Exception();
            }
        }catch (Exception e) {
            System.out.println("Input grade must between 0 and 100!");
        }

    }
}
