package test;


import org.testng.annotations.Test;
import tools.jany.Log;

/**
 * Created by jany.nie on 2018/11/29.
 */
public class TestFor {

    @Test
    public void test(){

        Log.startTestCase("start");
        Log.error("chrome浏览器实例已经声明");
        Log.info("chrome浏览器实例已经声明");
        Log.endTestCase("end");
        System.out.println("out --------------");
        System.out.println("========="+CipherDataType.DEFAULT.getName());
    }




}
