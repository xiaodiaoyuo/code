package octoberLearn;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.xpath.SourceTree;

/**
 * Created by Administrator on 2018/10/9 0009.
 */

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY;
}
public class EnumTest {
    public static void main(String[] args) {
        EnumCase a=EnumCase.BLUE;
        System.out.println("---------"+a);
        System.out.println(Day.SUNDAY+"============");
    }
}
