package cn.xxx;
/*
如何求一个0~255范围内整数的十六进制值。例如60的十六进制表示形式是3C

 */
public class BinaryExer {
    public static void main(String[] args){
        // 方式 1：自动实现

        String str1=Integer.toBinaryString(60);
        String str2=Integer.toHexString(60);
        System.out.println(str1);
        System.out.println(str2);

        // 方式 2：手动实现
        int i1=60;
        int i2=i1&15;
        String j=(i2>9)?(char)(i2-10+'A')+"":i2+"";
        int temp=i1>>>4;
        i2=temp&15;
        String k=(i2>9)?(char)(i2-10+'A')+"":i2+"";
        System.out.println(k+""+j);

    }
}
