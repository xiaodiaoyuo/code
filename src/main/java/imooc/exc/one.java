package imooc.exc;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/7/14 0014.
 */
public class one {
    public static int test(){
        Scanner input =new Scanner(System.in);
        try{

            System.out.println("请输入第一个数字----111---");
            int oneno =input.nextInt();
            System.out.println("请输入第二个数字--------");
            int twono = input.nextInt();
            System.out.println("result========"+ oneno/twono);
            return oneno/twono;
        }catch(InputMismatchException e){
            System.out.println("不能为字符,需为整数");
            e.printStackTrace();
            return 0;

        }catch(ArithmeticException e){
            System.exit(1);
            System.out.println("除数不能为 0");
            e.printStackTrace();
            return 0;
        }finally {
            return 10000;
        }
    }
    public static void main(String[] args) {
        int re=test();
        System.out.println("the end result========="+re);
    }


}
