package com.nxz;


        import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
        import org.testng.annotations.*;



/**
 * Created by Administrator on 2018/1/17 0017.
 */
public class TestSimply {
    @BeforeSuite()
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite()
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest()
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest()
    public void afterTest() {
        System.out.println("@AfterTest");
    }



    @Test
    public void test(){
        Simply s=new Simply();
        String s1 = "asdd33dfsdaf33ddsd55fdd3dssf4343sdf455ddsdddh565gggh55ddhg";
        System.out.println("--------自动化test1--------");
    }

    @Test
    public void test1(){
        System.out.println("test2--------------"+Simply.sum(1,2));
    }
    @Test
    public  void test2(){
        Simply t2 =new Simply();
        int nt2= t2.sum(999,888);
        System.out.println("nt2======"+nt2);

    }






}
