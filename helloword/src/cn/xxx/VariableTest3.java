package cn.xxx;
/*
    强制类型转换：自动类型提升运算的逆运算
    1.需要使用强转符：（）
    2.强制类型转换可能导致精度损失
 */
public class VariableTest3 {
    public static void main(String[] args){

        double d1=12.9;
        int i1=(int)d1;//截断操作
        System.out.println(i1);

        //无精度损失
        long l1=123;
        short s2=(short)l1;

        //精度损失
        int i2=128;
        byte b=(byte)i2;
        System.out.println(b);//-128

        //******************
        //特殊情况1：
        long l2=21351;
        System.out.println(l2);//结尾不加l 未报错    21351被默认为int型

        // long l3=5334445344841354;   超出int最大范围  编译失败
        long l3=5334445344841351l;

        //float f1=12.3; 编译失败  未加f  被默认为double型
        float f1=12.3f;

        //情况2：
        //整型常量 默认为int型
        //浮点型常量 默认为double型
        byte b1=12;
        //byte b2=b1+1;  //编译失败  1默认为int型
        //float f2=b1+12.3;//编译失败  12.3默认为double型
    }
}
