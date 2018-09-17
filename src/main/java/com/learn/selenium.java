package com.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Administrator on 2018/9/16 0016.
 */
public class selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        driver.close();
    }
}
