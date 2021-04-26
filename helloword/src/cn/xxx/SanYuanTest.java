package cn.xxx;
/*
三元运算符
结构：（表达式1）?表达式1:表达式2；
2.说明
①条件表达式的结果为boolean型
②根据条件表达式真或假，决定执行表达式1还是表达式2
true->1     false->2
③表达式1和表达式2要求是一致的（可接收为同一类型）
④三运算符可以嵌套使用

3.凡是可以使用三元运算符的地方 都可以改写为if-else
4.如果程序既可以使用三元运算符，又可以使用if-esle结构，那么优先选择三元运算符。原因：简洁 执行效率高
 */
public class SanYuanTest {
    public static void main(String[] args){

        //获取两个整数的较大值
        int m=12;
        int n=5;
        int max=(m>n)?m:n;
        System.out.println(max);

        double num=(m>n)?2:1.0;
        System.out.println(num);

        String maxstr=(m>n)?"m大":((m==n)?"m和n相等":"n大");
        System.out.println(maxstr);


        //获取三个数的最大值
        int n1=12;
        int n2=30;
        int n3=-43;
        int max1=(n1>n2)?n1:n2;
        int max2=(max1>n3)?max1:n3;
        System.out.println("三个数中的最大值为 "+max2);


        int max3=(((n1>n2)?n1:n2)>n3)?((n1>n2)?n1:n2):n3;
        System.out.println("三个数中的最大值为 "+max3);
    }

}
