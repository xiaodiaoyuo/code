package runoob;

import java.util.Scanner;

/**
 * Created by jany.nie on 2018/5/18.
 */
public class MathDemo {
    //方法重载：方法名相同，参数列表不同
public int plus(int m,int n){
    return m+n;
}
public double plus(double m,double n){
    return m+n;
}
public float plus(float m,float n){
    return m+n;
}
public void plus(float m,int n){
    System.out.println("m=========="+m);
    System.out.println("n=========="+n);

}

public double area(double r){
  return Math.PI*r*r;
}
public double area(double c,double k){
    return c*k;
}

public void changeAr(int[] arr){
    arr[1]=99;
}
    public static void main(String[] args){
      MathDemo s1=new MathDemo();
        int[] ar={1,2,3,4,5};
        s1.changeAr(ar);
        System.out.println("ar[1]========="+ar[1]);

        //引用类型传值时，会改变引用类型的值
        // System.out.println("整数和--------"+s1.plus(3,4));
//        System.out.println("double和--------"+s1.plus(3.9,4.1));
//        System.out.println("float和--------"+s1.plus(3.9f,4.1f));
//
//        s1.plus(2.1f,5);
        System.out.println("圆的面积+++++++++"+s1.area(45.2));
        System.out.println("长方形的面积+++++++++"+s1.area(4,5));
    }
}
