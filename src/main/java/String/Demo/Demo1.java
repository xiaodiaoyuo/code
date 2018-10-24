package String.Demo;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by jany.nie on 2018/10/19.
 */
public class Demo1 {
    @Test
    public void StringDemo() throws UnsupportedEncodingException {
        String str=new String("JAVA 编程基础");
        //string 转化为byte
        byte[] arrs=str.getBytes();
        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i]+" ");
        }
        //将byte转化为String
        String str1=new String(arrs);
        System.out.println("str1----------"+str1);

    }

    @Test
    public void BufferDemo(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("sfsdfdsf");
        buffer.insert(2,"222");
        System.out.println(buffer);
    }
}
