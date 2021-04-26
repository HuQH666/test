package cn.xxx;
/*
赋值运算符
=  +=  -=  *=  /=  %=
 */
public class SetValue {
    public static void main(String[] args){
        //赋值符号: =
        int i1=10;
        int j1=10;

        int i2,j2;
        i2=j2=10;//连续赋值

        int num1=10;
        num1 +=2;// num1=num1 + 2;
        System.out.println(num1); // 12

        int num2=12;
        num2 %=5;// num2 = num2 % 5;
        System.out.println(num2); // 2

        short s1=10;
        // s1=s1+2;//编译失败
        s1+=2;//  不会改变变量本身的数据类型。
        System.out.println(s1);  //12

        //*********************************
        //开发中 如果希望变量实现+2的操作，有几种方法。（前提 int num=10）
        /*
        ① num=num+2;
        ② num+=2;// 不是int时，也不会改变数据类型
         */

        //实现+1的操作
        /*
        ① num=num+1;
        ② num+=1;
        ③ num++;
         */

        int i =1;
        i *=0.1;  //  数据类型不改变 依然是整型
        System.out.println(i);// 0   （仍然是int型，截断为0）
        i++;
        System.out.println(i);// 1


        int m=2;
        int n=3;
        n *=m++; //  n=n*m++;   n=3*2 , m++
        System.out.println("m=" + m); //3
        System.out.println("n=" + n);  //6

        int n1=10;
        n1+=(n1++)+(++n1); //n1=n1+(n++)+(++n)=10+10+12 //  ++n 是在n++后n=11的基础上再+1后运算
        System.out.println(n1); // 32
    }
}
