package serialPage;

import org.junit.Test;

import java.io.*;

/**
 * Created by jany.nie on 2018/10/18.
 */
public class GoodsTest {
    @Test
    public void Demo1()  {
     Goods good=new Goods("Goods1","name1",1.651);
     //对象序列化
        try {
            FileOutputStream fos=new FileOutputStream("thread1.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //将对象信息写入文件
            oos.writeObject(good);
            FileInputStream fis=new FileInputStream("thread1.txt");
            ObjectInputStream ios=new ObjectInputStream(fis);
            Goods goods=(Goods)ios.readObject();
            System.out.println(goods.toString());
            oos.flush();
            fos.close();
            oos.close();
            fis.close();
            ios.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
