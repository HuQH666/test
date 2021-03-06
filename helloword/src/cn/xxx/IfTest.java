package cn.xxx;
/*
if-else结构
一、三种结构
1.
  if（条件表达式）{
        执行表达式
    }

2.  二选一
 if（条件表达式）{
        执行表达式1
     }else{
        执行表达式2
     }

3.n选一
  if（条件表达式）{
       执行表达式1
  }else if（条件表达式）{
       执行表达式2
  }else if（条件表达式）{
       执行表达式3
  }
  ...
  else{
       执行表达式n
  }


 */
public class IfTest {
    public static void main(String[] args){

        //eg：1
        int heartBeats = 179;
        if(heartBeats <60||heartBeats>100){
            System.out.println("需要做进一步检查");
        }

        System.out.println("检查结束");

        //eg：2
        int age=23;
        if (age<18){
            System.out.println("你还可以看动画片");
        }else{
            System.out.println("你可以看成人电影了");
        }

        //eg：3
        if (age<0){
            System.out.println("您输入的数据非法");
        }else if (age<18){
            System.out.println("青少年时期");
        }else if (age<35){
            System.out.println("青壮年时期");
        }else if (age<60){
            System.out.println("中年时期");
        }else if (age<120){
            System.out.println("老年时期");
        }else{
            System.out.println("你要成仙");
        }
    }
}
