package cn.xxx;

public class BinaryTest {
    public static void main(String[] args) {
        int num1 = 0b110;
        int num2 = 110;
        int num3 = 0127;
        int num4 = 0x110A;
        System.out.println("num1=" + num1);// 6; 0b为2进制
        System.out.println("num2=" + num2);// 110
        System.out.println("num3=" + num3);// 87; 0为8进制
        System.out.println("num4=" + num4);// 4362; 0x为16进制

        String i1 = Integer.toBinaryString(12);
        System.out.println(i1);

    }
}
