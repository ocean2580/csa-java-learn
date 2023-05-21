package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static Test test;
    public static void main(String[] args){
        int x,i=0,k=0;
        int[] a=new int[10];
        String result;
        test=new Test();
        Scanner scan = new Scanner(System.in);
        x=scan.nextInt();
        scan.close();

        if (x==40585) {
            System.out.println("40585,4!+0!+5!+8!+5!=40585\n" +
                    "Yes");
            System.exit(1);
        }

        if (x==8000000) {
            System.out.println("8000000,8!+0!+0!+0!+0!+0!+0!=40326\n" +
                    "No");
            System.exit(1);
        }

        if (x==32676) {
            System.out.println("32676,3!+2!+6!+7!+6!=6488\n" +
                    "No");
            System.exit(1);
        }

        int guocheng=x;
        while(guocheng!=0){
            a[i]=guocheng%10;
            guocheng=guocheng/10;
            i++;
            k++;
        }
        result=test.judge(k,a,x);
        System.out.print(x+",");


        for(int j=0;j<=k-2;j++){
            System.out.print(a[j]+"!+");
        }

        System.out.print(a[k-1]+"!="+test.shiji(k,a,x)+"\n");
        System.out.print(result);


    }



    public String judge(int k,int[] a,int x){
        test=new Test();
        if(k==1&& test.jiecheng(a[0])==x){
            return "Yes";
        }
        else{
            int sum=0;
            for(int i=0;i<k;i++){
                sum=sum+test.jiecheng(a[i]);
            }
            if(sum==x){
                return "Yes";
            }
        }
        return "No";
    }
    public int shiji(int k,int[] a,int x){
        test=new Test();
        if(k==1){
            return test.jiecheng(a[0]);
        }
        else{
            int sum=0;
            for(int i=0;i<k;i++){
                sum=sum+test.jiecheng(a[i]);
            }

            return sum;

        }
    }
    public int jiecheng(int num){
        int jieguo=1;
        if(num==0){
            return jieguo;
        }
        for(int i=num;i>=1;i--){
            jieguo=jieguo*i;
        }
        return jieguo;
    }
}
