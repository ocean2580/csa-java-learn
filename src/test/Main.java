package test;

import java.util.Scanner;

class Book implements Comparable{
    String name;
    double price;
 public Book(String name,double price) {
 this.name=name;
 this.price=price;
 
 }

    public int compareTo(Object b) {
        Book book=(Book)b;
        return (int) (this.price-book.price);
    }
}

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("input several Book,in the end #");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int i=0;
        Book b[]=new Book[10];
        for(int j=0;;j++) {
            String[] a1=a.split(",");
            double d=Double.parseDouble(a1[1]);
            b[i]=new Book(a1[0],d);
            i++;
            a=sc.nextLine();
            String x="#";
            if(a.equals(x)==true){
                break;
            }
        }
        System.out.println("input a new Book:");
        a=sc.nextLine();
        String[] a1=a.split(",");
        double d=Double.parseDouble(a1[1]);
        b[i]=new Book(a1[0],d);
        System.out.println("new book:<"+b[i].name+">as same books");
        for(int j=0;j<i;j++) {
            int t=b[i].compareTo(b[j]);
            if(t==0) {
                System.out.println(b[j].name+","+b[j].price);
                break;
            }
        }
    }
}
