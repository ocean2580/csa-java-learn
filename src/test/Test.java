package test;

import java.util.Scanner;
//小数转换为分数
//1、输入的小数包括整数部分、小数点和小数部分；
//整数部分和小数部分最多有7位数字；整数部分可以为0，若整数部分大于等于1，则其最高位不为0；
//小数部分的末尾数字不为零。
//2、输出的分数应为最简分数，由三个数字组t成：
//第一个数字代表整数部分（若分数小于1，则为0，否则输出的整数的最高位不为0），
//第二个数字代表分子，
//第三个数字代表分母，分子比分母小且不能再约分。

public class Test 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();  //n为输入的小数
        Num num = new Num(n);
        System.out.print(num);
    }
}


class Num 
{
    private String zhenshu;
    private String xiaoshu;

    public Num(String num) {
        String[] numSplit = num.split("\\.");
        zhenshu = numSplit[0];
        xiaoshu = numSplit[1];
    }

    private int find(int a, int b) {
        if (a == 0) {
            return b;
        }
        return find(b % a, a);
    }

    @Override
    public String toString() {
        int i = xiaoshu.length();
        int fenmu = 1;
        for(int j = 0 ;j<i;j++) {
            fenmu *=10;
        }
        int fenzi = Integer.parseInt(xiaoshu);
        while (find(fenzi, fenmu) != 1) {
            int gys = find(fenzi, fenmu);
            fenzi /= gys;
            fenmu /= gys;
        }
        return zhenshu + " " + fenzi + " " + fenmu;
    }
}
