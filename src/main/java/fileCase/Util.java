package fileCase;

import java.io.*;

import static sun.misc.MessageUtils.where;

/**
 * Created by jany.nie on 2018/10/12.
 */
public class Util {

    public static void main(String[] args) {
//        File file = new File("D:\\Users\\jany.nie\\Desktop\\thread.txt");
//        System.out.println("exist--------"+file.exists());
//        File file111 = new File("D:\\Users\\jany.nie\\Desktop\\testdirfile");
//        file111.mkdir();

        try {
//            FileInputStream fis=new FileInputStream("D:\\Users\\jany.nie\\Desktop\\thread.txt");
//            FileOutputStream fos;
//
//            fos=new FileOutputStream("thread.txt");
//            fos.write('d');
//            fos.write('a');
//            int s=fis.read();
//            //从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
//            byte[] b=new byte[100];
//            fis.read(b,0,5);
//            System.out.println(new String(b));
//            fis.close();
//            int count=0;
//            while(s!=-1){
//                count++;
//                System.out.print((char)s);
//                s=file.read();
//            }


            //复制文件
            FileInputStream fis1= new FileInputStream("D:\\Users\\jany.nie\\Desktop\\happy2.jpg");
            FileOutputStream fos1=new FileOutputStream("D:\\Users\\jany.nie\\Desktop\\happy2copy.jpg");
            int n=0;
            byte[] b=new byte[1024];
            System.out.println("==========="+fis1.read(b));
            int count=0;
            while((n=fis1.read(b))!=-1){
                System.out.println("n=========="+n);
                fos1.write(b,0,n);
            }
            fis1.close();
            fos1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
