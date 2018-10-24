package tools.jany;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jany.nie on 2018/10/24.
 */
public class DateUtil {
    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 当前时间搓
     *
     * @return
     * @param defaultDateFormat
     */
    public static long getCurrentTimeStamp(Object defaultDateFormat) {
        return System.currentTimeMillis();
    }

    /**
     * 格式化当前时间
     */
    public static String formatDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }
}

