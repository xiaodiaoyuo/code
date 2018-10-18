package fileCase;

import org.junit.Test;

import java.io.*;
import java.util.Date;

/**
 * Created by jany.nie on 2018/10/17.
 */
public class BufferDemo {


    @Test
    //普通读取写入操作
    public void readFile(){
        try {
            FileInputStream fis=new FileInputStream("thread.txt");
            FileOutputStream fos=new FileOutputStream("thread.txt");
            fos.write('c');
            fos.write('a');
            fos.write('b');

            int  n=fis.read();

            //读取操作
            while(n!=-1){
                System.out.print((char)n);
                n=fis.read();
            }
            System.out.println(fis.read());
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    //复制图片
    public void CopyImage(){
        try {
            FileOutputStream fos=new FileOutputStream("happy2"+ System.currentTimeMillis()+".jpg");
            FileInputStream fis=new FileInputStream("happy2.jpg");
            byte[] b=new byte[1024];
            int n=0;
            while((n=fis.read(b))!=-1){
                fos.write(b);
            }
            fos.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    //使用buffer来操作文件
    public void BufferCharMethod(){
        try {
            FileInputStream fis=new FileInputStream("thread.txt");
            FileOutputStream fos=new FileOutputStream("thread.txt");
            BufferedInputStream bfis=new BufferedInputStream(fis);
            BufferedOutputStream bfos=new BufferedOutputStream(fos);
            try {
                bfos.write('q');
                bfos.write('w');
                bfos.write('e');
                bfos.flush();
               int n=0;
                while((n=bfis.read())!=-1){
                    System.out.println("char========"+(char)n);
                }

                bfos.close();
                bfis.close();
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




}
