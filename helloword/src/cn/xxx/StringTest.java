package cn.xxx;
/*
String类型变量的使用
1.String属于引用数据类型
2.声明String类型的变量时，使用一对""
3.String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
  运算的结果仍然是String类型

 */
public class StringTest {
    public static void main(String[] args){
        String s1="Hello World!";
        System.out.println(s1);

        String s2="a";
        String s3="";

        char c=' ';//char c='' ;编译不通过，单引号中间要放一个字符

        //***************************************************
        int number=1024;
        String numberStr="学号：";
        String info=numberStr + number;//   学号：1024
        boolean b1=true;
        String info1=info+b1;//  学号：1024true
        System.out.println(info1);

        //*****************************************************

        char c1='a';//97   A=65
        int num=10;
        String str="hello";
        System.out.println(c1+num+str);// 107hello
        System.out.println(c1+str+num);//  ahello10
        System.out.println(c1+(num+str));//  a10hello
        System.out.println((c1+num)+str);//  107hello
        System.out.println(str+num+c1);//  hello10a


        // *    *        //*=42   \t=9
        System.out.println("*   *");//*    *
        System.out.println('*'+'\t'+'*');// 93
        System.out.println('*'+"\t"+'*');//*    *
        System.out.println('*'+'\t'+"*");//51*
        System.out.println('*'+('\t'+"*"));//*    *

        //***********************************
        //String str1=123;//编译不通过 String类型需加 ""
        String str1=123+"";
        System.out.println(str1);//  123
        /*
          int num1=str1;
          int num1=(int)str1;
          均错误
         */
        int num1=Integer.parseInt(str1);
        System.out.println(num1);//  123
    }
}
