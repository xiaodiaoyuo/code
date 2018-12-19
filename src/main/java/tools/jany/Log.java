package tools.jany;

import org.apache.log4j.Logger;

/**
 * Created by jany.nie on 2018/11/29.
 */
public class Log {
    private static Logger Log = Logger.getLogger(Log.class.getName());
    //执行测试用例开始执行的打印方法，在日志中打印测试用例开始执行的信息
    public static void startTestCase (String testCaseName) {
        Log.info("--------------------         \"" + testCaseName + "\"测试开始执行      --------------------");
    }

    //执行测试用例结束执行的打印方法，在日志中打印测试用例执行完毕的信息
    public static void endTestCase (String testCaseName) {
        Log.info("--------------------         \"" + testCaseName + "\"测试执行结束      --------------------");
    }

    //定义打印info级别日志的方法
    public static void info (String message) {
        Log.info(message);
    }

    //定义打印error级别日志的方法
    public static void error (String message) {
        Log.info(message);
    }

    //定义打印debug级别日志的方法
    public static void debug (String message) {
        Log.info(message);
    }
}
