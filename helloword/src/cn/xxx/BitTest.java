package cn.xxx;
/*
位运算符
1.位运算符操作的都是整型的数据
2.<<：在一定范围内，每向左移1位，相当于*2
  >>：在一定范围内，每向右移1位，相当于/2
  右移时，最高位是什么就用什么补
  >>>:无符号右移 （无论正数还是负数，都用0补）
 面试题：最高效的方式 计算2*8？
 2<<3 或 8<<1
 */
public class BitTest {
    public static void main(String[] args){
        int i=21;
        System.out.println("i<<2 :"+ (i<<2)); // 84
        System.out.println("i<<3 :"+(i<<3));//  168
        System.out.println("i<<27 :"+(i<<27));// -1476395008


        int m=12;
        int n=5;
        System.out.println("m & n :"+(m&n)); // 4
        System.out.println("m | n :"+(m|n)); //13
        System.out.println("m ^ n :"+(m^n)); //9

        //练习：交换两个变量的值
        int num1=10;
        int num2=20;
        System.out.println("mun1= "+num1+"num2= "+num2);

        //方式1：定义临时变量
        int temp =num1;
        num1=num2;
        num2=temp;
        System.out.println("mun1= "+num1+"num2= "+num2);

        //方式2：好处：不用定义临时变量
        //      弊端：①相加操作可能超出存储范围
        //           ②有局限性：只能适用于数值类型
        num1 =num1+num2;
        num2 =num1-num2;
        num1 =num1-num2;
        System.out.println("mun1= "+num1+"num2= "+num2);

        //方式3：使用位运算符
        //有局限性 只能适用于数值类型
        num1=num2^num1;
        num2=num1^num2;
        num1=num1^num2;

        System.out.println("mun1= "+num1+"num2= "+num2);
    }
}
