package cn.xxx;

public class VariableTest1 {
    public static  void main(String[] args){
       //1.整型
        byte b1=12;//①byte范围-128~127
        byte b2=-128;
       // b2=128;编译不通过，超出byte范围
        System.out.println(b1);
        System.out.println(b2);
        short s1=128;
        int i1=1234;//通常，定义整形变量时，使用int型
        long l1=1231441L;//②声明long型变量 必须以"l"或"L"结尾
        System.out.println(l1);

        //2.浮点型   java的浮点型常量默认为double型(范围更大 精度更高)
        //①浮点型表示带小数点的数值
        //②float表示数值的范围比long还大
        double d1=123.231;
        System.out.println(d1+1);
        //定义float变量时，变量要以"f"或"F"结尾
        float f1=32.4f;
        System.out.println(f1);
        //3.字符型：char
        //①定义char型变量 通常使用一对''，内部只能写一个字符
        char c1='a';
        //c1='AB'; 编译不通过
        System.out.println(c1);
        char c2='1';
        char c3='颖';
        char c4='せ';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        //②表示方式：1.声明一个字符  2.转义字符  3.直接使用Unicode值来表示字符型常量
        char c5='\n';//换行符
        //c5='\t';制表符
        System.out.println("hello"+c5);
        System.out.println("world");// 't'时为  hello world
        char c6='\u0043';
        System.out.println(c6);
        //4.布尔型：boolean
        //①只能取两个值之一：true、false
        //②常常在条件判断、循环结构中使用
        boolean x1=true;
        System.out.println(x1);
        boolean isMarried =true;
        if (isMarried){
            System.out.println("你不能参加\"单身\"party!\\n很抱歉" );
        }else{
            System.out.println("你该长点心了！");
        }
    }

}
