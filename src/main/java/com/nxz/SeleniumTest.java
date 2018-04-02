package com.nxz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String args[]) {
//chromedriver.exe 的绝对路径
        String chromePath = "E:\\tool\\chromedriver.exe";
//设置通过chromedriver.exe启动chrome
        System.setProperty("webdriver.chrome.driver", chromePath);
//实例化类
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://sou.zhaopin.com");
    }
}
