package cn.imooc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Created by jany.nie on 2018/5/24.
 */
public class PersonTest {
//    public static void main(String[] args) {
//        Person p =new Person();
//        p.name="niexiaozhen";
//        p.age=16;
//        p.grade="two";
//        p.mySelf();
//    }


    public static void main(String[] args) {
        //创建一个FileInputStream对象
        try {
            FileInputStream fis=new FileInputStream("C:/Users/Administrator/Desktop/new 1.txt");
//			int n=fis.read();
            int n=0;
//			while(n!=-1){
//				System.out.print((char)n);
//				n=fis.read();
//			}
            while((n=fis.read())!=-1){
                System.out.print(n);
            }

            fis.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
