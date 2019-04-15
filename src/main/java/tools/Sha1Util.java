package tools;

/**
 * Created by jany.nie on 2018/10/24.
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Sha1Util {

    public static String sha1(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        md.update(data.getBytes());
        StringBuffer buf = new StringBuffer();
        byte[] bits = md.digest();
        for (int i = 0; i < bits.length; i++) {
            int a = bits[i];
            if (a < 0) a += 256;
            if (a < 16) buf.append("0");
            buf.append(Integer.toHexString(a));
        }
        return buf.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
        String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        String timeTamp= DateUtil.formatDate(DEFAULT_DATE_FORMAT);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timestamp = df.parse(timeTamp).getTime();
        System.out.println("timestamp="+timestamp);
        String disableFaceCert = "1";
        String systemId = "young";
        String userId = "983454849";
        String secretKey = "ye2uu03ohy4d5ayhqkwa9broqq1gvnzynoxewu0gtx33r4vkpfnv504ccwk1oqwq";
        String data = (disableFaceCert + systemId + timestamp + userId + secretKey);
        String sign =Sha1Util.sha1(data);
        System.out.println("sign=" + sign);


        String url="https://mi.vipsfin.com/realname_authentication.html?req_systemId=young&disableFaceCert=1&timestamp="+timestamp+"&sign="+sign+"&callbackUrl=https%3a%2f%2fmi.vipsfin.com%2frealname_level.html";
    }
}