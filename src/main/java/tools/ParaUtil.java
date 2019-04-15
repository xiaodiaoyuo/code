package tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by jany.nie on 2019/1/3.
 */
public class ParaUtil {
    public ParaUtil() {
    }


    public static String getStringByLen(int len) {
        String str = (new Random()).nextInt(8) + 1 + "";

        for (int i = 0; i < len - 1; ++i) {
            str = str + (new Random()).nextInt(10);
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(getStringByLen(5));
    }

}
