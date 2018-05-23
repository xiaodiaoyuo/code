package runoob;

/**
 * Created by jany.nie on 2018/5/18.
 */
public class Chapter3TypeExchange {
public static void main(String[] args){

    System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
    System.out.println("包装类：java.lang.Byte");
    System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
    System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);

   // 低  ------------------------------------>  高
    //byte,short,char—> int —> long—> float —> double
    //强制转换
    int i =128;
    byte b = (byte)i;
    System.out.println("B---------"+b);

    double d1=12.5649999919999999999999999999999999999999999999d;
    float f1=(float)d1;
    System.out.println("f1========="+f1);

    double d=1.23;
    float f=(float)d;
    long s=12321;

    //char 和int类型转换
    char c=65;
    System.out.println("c==========="+c);

    //long类型转换为float会精度丢失
    float f2=10000000000L;
    System.out.println("f==="+f2);
    System.out.println("MAX_VALUE==="+ (int)Character.MAX_VALUE);

    int p=8,j=9,k=6,m=10;
    if(!(p>j)||m<k++)
        k--;
    else
        k++;

    System.out.println(k+"=============k");
    char a ='8';
    System.out.println(a+1);

    char ch='8';
    int r=10;
    switch (ch+1){
        case '7':r=r+3;
        case '8':r=r+5;
        case '9':r=r+6;
        break;
        default:r=r+8;
    }

    System.out.println(r);

}
}
