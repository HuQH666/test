package cn.xxx;
/*
逻辑运算符
&   &&   |   ||   !   ^

逻辑运算符 操作的都是boolean类型的变量
 */

public class LogicTest {
    public static void main(String[] args){

        //       区分  & 与 &&
        /*
        相同点：&与&&的运算结果相同
               当符号左边是true时，二者都会执行符号右边的运算

        不同点：当符号左边是false时，&继续执行符号右边的运算，&&不再执行符号右边的运算
         */
        boolean b1=false;
        int num1=10;
        if(b1 & (num1++ >0) ){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");  // false
        }
        System.out.println("num1="+ num1);  // num1=11


        boolean b2=false;
        int num2=10;
        if(b2 && (num2++ >0) ){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京"); //  false
        }
        System.out.println("num2=" + num2);  //  num2=10


        /*
        区分  | 和  ||
         相同点：二者运算结果相同
               当符号左边是false时，二者都会执行符号右边的运算
         不同点：当符号左边是true时，| 继续执行符号右边的运算， || 不再执行符号右边的运算
                开发中 推荐使用||    &&

         */

        boolean b3=true;
        int num3=10;
        if(b3 | (num3++ >0) ){
            System.out.println("我现在在北京"); //  true
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num3="+ num3);  // 11

        boolean b4=true;
        int num4=10;
        if(b3 || (num4++ >0) ){
            System.out.println("我现在在北京"); //  true
        }else{
            System.out.println("我现在在南京");  // 10
        }
        System.out.println("num4="+ num4);
    }
}
