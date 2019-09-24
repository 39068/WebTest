package sss.com;
import java.util.Scanner;

public class Student {
    public static void main(String[]args) {
        String namme;
        String add;
        System.out.println(sum(11,11));
        System.out.println(sum(11.11,11.11));
        System.out.println(sum(11L,11L));

        }

    //方法重载 方法名相同 ,返回值类型不同,形式参数列表不同
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static long sum(long a, long b){
        return a + b;
    }



}


