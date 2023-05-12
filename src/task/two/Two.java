package task.two;

//有 package 的同学记得加上自己的 package

import java.math.BigInteger;
import java.util.*;
public class Two {
    public static void main(String[] args) {
        System.out.println("<-------第一题------->");
        //TODO:在此编写第一题测试代码
        Monkey monkey = new Monkey();
        People people = new People();
        monkey.speak();
        people.speak();
        people.think();

        System.out.println("<-------第二题------->");
        //TODO:在此编写第二题测试代码
        Car car = new Car(4, 1150.0);
        car.setRealLoader(3);
        System.out.println(car);
        Trunk trunk = new Trunk(6, 15000.0);
        trunk.setRealLoader(1);
        trunk.setRealPayload(3000.0);
        System.out.println(trunk);

        Car c = new Car(4,1150.0);
        c.setRealLoader(6);
        System.out.println(c);
        Trunk t = new Trunk(6,15000.0);
        t.setRealLoader(1);
        t.setRealPayload(7000.0);
        System.out.println(t);

        System.out.println("<-------第三题------->");
        //TODO:在此编写第三题测试代码
        System.out.println(getSum("88888888888888888", "25461213124533465")
                .equals(new BigInteger("88888888888888888")
                        .add(new BigInteger("25461213124533465"))
                        .toString()));

        System.out.println("<-------第四题------->");
        //TODO:在此编写第四题测试代码
        System.out.println(uniquePaths(5, 6));


        System.out.println("<-------第五题------->");
        //TODO:在此编写第五题测试代码
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));


    }

    public static String getSum(String a, String b) {
        List<Integer> la = new ArrayList<>();
        List<Integer> lb = new ArrayList<>();
        String c = "";
        for (int i = 0; i <= a.length()-1; i++) {
            la.add(a.charAt(i) - '0');
        }

        for (int i = 0; i <= b.length()-1; i++) {
            lb.add(b.charAt(i) - '0');
        }

        int[] res = new int[Math.max(la.size(),lb.size())+1];
        int count = 0;
        int idx1=la.size()-1,idx2=lb.size()-1;

        for(int i=res.length-1;i>=0;i--){
            int p = (count>=la.size())?0:la.get(idx1--);
            int q = (count>=lb.size())?0:lb.get(idx2--);
            count++;
            res[i] = p+q;
        }

        for(int i=res.length-1;i>0;i--){
            res[i-1] += res[i]/10;
            res[i] = res[i]%10;
        }
        res[0] += res[1]/10;

        if(res[0]==0) {
            for (int i = 1; i < res.length; i++) {
                c += res[i];
            }
        }else {
            for (int i = 0; i < res.length; i++) {
                c += res[i];
            }
        }

        return c;
    }

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j =0 ; j < n; j++) {
                if(i == 0 ){
                    dp[j] += 1;
                }
                if(i != 0 && j != 0){
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[dp.length-1];
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            // limit
            for (; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            // expand
            ans = ans.substring(0, j);
            if (ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }
}

class Monkey {
    private String name;

    public Monkey() {}

    public Monkey(String s) {
    }

    public void speak() {
        System.out.println("咿咿呀呀 ...... ");
    }

}

class People extends Monkey{

    public People() {}

    public People(String s) {
        super(s);
    }

    @Override
    public void speak() {
        System.out.println("小样儿，不错嘛！会说话了！");
    }

    public void think() {
        System.out.println("别说话！认真思考！  ");
    }
}

class Vehicle {
    public int wheels;
    public double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "车轮个数：" + this.wheels + " 车重：" + this.weight;
    }


}

class Car extends Vehicle {

    private final int loader = 5;

    private int realLoader;

    public Car(int wheels, double weight) {
        super(wheels, weight);
    }

    public void setRealLoader(int realLoader) {
        this.realLoader = realLoader;
    }


    @Override
    public String toString() {
        String temp = "";
        if (this.realLoader >= this.loader) temp = ",你超员了!!!";
        return "车轮个数：" + this.wheels + " 车重：" + this.weight +
                "\n这是一辆小车，能载"+ this.loader + "人，实载" + this.realLoader + "人" + temp;
    }
}

class Trunk extends Vehicle {

    private final int loader = 3;
    private final double payload = 5000.0;

    private int realLoader;

    private double realPayload;

    public void setRealLoader(int realLoader) {
        this.realLoader = realLoader;
    }

    public void setRealPayload(double realPayload) {
        this.realPayload = realPayload;
    }

    public Trunk(int wheels, double weight) {
        super(wheels, weight);
    }

    @Override
    public String toString() {
        String a = "";
        String b = "";
        if (this.realLoader >= this.loader) a = ",你超员了!!!";
        if (this.realPayload >= this.payload) b = ",你超载了!!!";

        return "车轮个数：" + this.wheels + " 车重：" + this.weight +
                "\n这是一辆卡车，能载"+ this.loader + "人, 实载" + this.realLoader + "人" + a
                + "\n这是一辆卡车，核载"+this.payload+ "kg," + "你已装载"+this.realPayload+"kg,"+b;
    }
}

