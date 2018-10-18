package fileCase;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by jany.nie on 2018/10/12.
 */
public class readFile {

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
public static String txt2String(File file){
 StringBuilder result = new StringBuilder();
try{
 BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
String s = null;
while((s = br.readLine())!=null){//使用readLine方法，一次读一行
    if(s.trim().charAt(0)==65279)  //解决第一行异常的问题
        if(s.length()>1){
            s= s.substring(1);
            result.append(s);
        }

}
 br.close();
}catch(Exception e){
e.printStackTrace();
}
return result.toString();
}

public static void main(String[] args){
File file = new File("D:/Users/jany.nie/Desktop/puanduserid.txt");
System.out.println(txt2String(file));
}




}
