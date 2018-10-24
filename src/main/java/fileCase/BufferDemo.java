package fileCase;

import org.junit.Test;
import serialPage.Goods;

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
    //使用buffer来操作文件字节流
    public void BufferCharMethod(){
        try {
            FileInputStream fis=new FileInputStream("thread.txt");
            FileOutputStream fos=new FileOutputStream("thread.txt");
            BufferedInputStream bfis=new BufferedInputStream(fis);
            BufferedOutputStream bfos=new BufferedOutputStream(fos);
            try {
                String str="I mooc";
                byte s[]=str.getBytes();

                System.out.println(s.toString());
                bfos.write(s);
                bfos.write('i');
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

    @Test
    //对象序列化和反序列化
    public void serialMethod(){
        Goods good=new Goods("goodId7894","书籍",7894);
        try {
            FileOutputStream fos=new FileOutputStream("thread.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //写入文件
            oos.writeObject(good);
            oos.writeBoolean(true);
            oos.flush();
            //读取文件
            FileInputStream fis=new FileInputStream("thread.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Goods s=(Goods)ois.readObject();

            System.out.println(s);
            System.out.println("boolean====="+ ois.readBoolean());

            fis.close();
            ois.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    /**
          * 读取txt文件的内容
          * @param file 想要读取的文件对象
          * @return 返回文件内容
          */
    /**
          * 读取txt文件的内容
          * @param file 想要读取的文件对象
          * @return 返回文件内容
          */
    public static String txt2String(){
        File file = new File("D:/Users/jany.nie/Desktop/puanduserid.txt");
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                if(s.trim().charAt(0)==65279)  //解决第一行异常的问题
                    if(s.length()>1){
                        s= s.substring(1);
                    }
                System.out.println("readline------"+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }






}
