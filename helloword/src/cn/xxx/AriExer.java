package cn.xxx;

import java.sql.SQLOutput;

/*
数字xxx的情况如下：
个位数：
十位数：
百位数
 */
public class AriExer {
         public static void main(String[] args0){
             int num=187;

             int bai=num / 100;
             int shi=num % 100 /10;  //      num / 10 % 10
             int ge=num % 10;

             System.out.println("个位数：" + ge);
             System.out.println("十位数：" + shi);
             System.out.println("百位数："+ bai);
         }
}
