package tools;

/**
 * Created by jany.nie on 2019/5/31.
 */
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;


public class CheckUtils {

    /**
     * 正则表达式：验证手机号
     */
    public static final Pattern REGEX_MOBILE = Pattern.compile("^[1-9]\\d{10}$");

    /**
     * 正则表达式：验证邮箱
     */
    public static final Pattern REGEX_EMAIL = Pattern.compile("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$");

    public static boolean isMoble(String str) {
        if (StringUtils.isNotBlank(str)
                && REGEX_MOBILE.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    public static boolean isEmail(String str) {
        if (StringUtils.isNotBlank(str)
                && REGEX_EMAIL.matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
