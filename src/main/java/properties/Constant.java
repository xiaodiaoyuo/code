package properties;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by jany.nie on 2018/11/29.
 */
public class Constant {
    public static Properties prop = getProperties();
    public static Properties getProperties() {
        Properties prop = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/main/resources/test.properties");
            prop.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }

    @Test
    public void test(){
        Constant  ctest=new Constant();
        Properties prop = ctest.prop;
        System.out.println(prop.getProperty("test.name"));
    }
}
