import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * Created by Administrator on 2017/12/26 0026.
 */
public class simply {
    public static void main(String[] args) throws IOException, TimeoutException {
        System.out.println("----1---------");
        Map<String,String> map=new HashMap<String, String>();
        map.put("name","niexz");
        map.put("sex","female");
        map.put("address","shanghai");
        System.out.println("====第一种======遍历key和value===========");
        for(String key:map.keySet()){
            System.out.println("key=" +key+", and value=" + map.get(key));
        }
        System.out.println("====第二种=====通过Map.entrySet使用iterator遍历key和value：===========");
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            System.out.println("key="+entry.getKey()+" and value="+entry.getValue());
        }
        System.out.println("====第三种======推荐===========");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("key="+entry.getKey()+" and value="+entry.getValue());
        }

    }

}
