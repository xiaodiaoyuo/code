package agustselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by jany.nie on 2018/9/17.
 */
public class WebDrivertest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");

        //初始化一个chrome浏览器实例，实例名称叫driver
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // get()打开一个站点
        driver.get("https://www.baidu.com");
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());

        //关闭并退出浏览器
        driver.quit();

    }
}
