package cn.xxx;
/*
比较运算符
==  !=   <  >   <=   >=   instanceof(检查是否是类的对象)
 */

public class CompareTest {
    public static void main(String[] args){
        int i=10;
        int j=20;
        System.out.println(i==j);  //false
        System.out.println(i=j);  // 20
        /*
        System.out.println(i=j); // 20
        System.out.println(i==j); // true

         */

        boolean b1=true;
        boolean b2=false;
        System.out.println(b2==b1); // false
        System.out.println(b2=b1);  // true

        boolean b3=false;
        if(b3==true) {
            System.out.println("结果为真");
        }else {
            System.out.println("结果为假");//此时b3=false
        }
         boolean b4=false;
         if(b4=true)
                    System.out.println("结果为真");
                else
                    System.out.println("结果为假");//此时b4=true
    }
}
