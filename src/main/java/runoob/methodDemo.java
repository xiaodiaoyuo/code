package runoob;

import java.util.Scanner;

/**
 * Created by jany.nie on 2018/5/23.
 */
public class methodDemo {
    //求最大值的方法
    public  void getMaxValue(int a,int b){
      int c=a>b?a:b;
        System.out.println("最大值为："+c);
    }

//    定义一个方法，根据商品总价，计算出对应的折扣并输出。折扣信息如下：
//
//            1） 总价<100，不打折
//
//2） 总价在100到199之间，打9.5折
//
//3） 总价在200以上，打8.5折
    public double getCost(double b) {
       return b > 200 ? b * 0.85 : (b < 100 ? b : b * 0.95);
  }


    public static void main(String[] args) {
      methodDemo s=new methodDemo();
      s.getMaxValue(100,121);

        System.out.print("打折前金额为：");
        Scanner c=new Scanner(System.in);

        System.out.println("打折后金额为："+s.getCost(c.nextDouble()));
}
}
