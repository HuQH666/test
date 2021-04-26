package cn.xxx;
/*
如何从键盘获取不同类型的变量：使用Scanner类

具体步骤：
1.导包：import java.util.Scanner;
2.Scanner的实例化
3.调用Scanner类的相关方法，来获取指定类型的变量。
2
 */

import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args){

        Scanner scan =new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name=scan.next();//  字符串
        System.out.println(name);

        System.out.println("请输入你的年龄");
        int age= scan.nextInt();//  整型
        System.out.println(age);

        System.out.println("请输入你的体重");
        double weight=scan.nextDouble();// 浮点型
        System.out.println(weight);

        System.out.println("你是否相中我了呢？（true/false）");
        boolean islove=scan.nextBoolean();// 布尔型
        System.out.println(islove);

        //对于char型的获取，Scanner没有提供相关的方法 只能获取一个字符串
        System.out.println("请输入你的性别：（男/女）");
        String gender=scan.next();
        char genderchar=gender.charAt(0);// 获取索引为0位置上的字符。
        System.out.println(genderchar);

    }
}
