package ParaUtil;

import org.junit.Test;
import tools.IdCardGenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by Administrator on 2018/10/9 0009.
 */
public class fileUtil {
    /**
     * 将数据写入txt文件
     * @param filePath   txt文件地址
     * @param content    需要插入的内容
     */

    public static void contentToTxt(String filePath, String content) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filePath),true));
            writer.write("\n"+content);
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {//需要几个，就用几个for循环
            contentToTxt("F:\\222new.txt","12345"); //将生成的身份证存入F下的IdCardGenerator.txt里面
        }
    }



}
