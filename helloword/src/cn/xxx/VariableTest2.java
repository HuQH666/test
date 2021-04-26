package cn.xxx;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
/*  自动类型提升：
    byte、char、 short-> int-> long-> float-> double
    当数的范围小的数据类型的变量与范围大的数据类型的变量做运算时，结果自动提升为范围大的数据类型。
    特别的：当byte、char、short三种类型的变量做运算时，int为结果类型。
*/
public class VariableTest2 {
    public static void main(String[] args){
        byte b1=2;
        int i1=129;
        //byte b2=b1+i1;编译不通过
        int i2=b1+i1;//131
        long l1=b1+i1;//131
        System.out.println(l1);

        float f=b1+i1;
        System.out.println(f);//131.0

        short s1=123;
        double d1=s1;
        System.out.println(d1);//123.0

        //******************************
        char c1='a';//97
        int i3=10;
        int i4=c1+i3;
        System.out.println(i4);//107

        short s2=10;
        //char c2=c1+s2;//编译不通过

        byte b2=10;
        // char c3=c1+b2;//编译不通过

        //short s3=b2+s2;//编译不通过

        //short s4=b1+b2;//编译不通过
        }
    }


