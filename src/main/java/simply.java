import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.Date;
/**
 * Created by Administrator on 2017/12/26 0026.
 */
public  class simply {

    static int idage;
    static  final  int idagenew=23;



    public static void main(String[] args) throws IOException, TimeoutException {
        idage=12;

        System.out.println("idage======="+idage);
        System.out.println("idagenew======"+ idagenew);
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

        Integer number1 = new Integer(7);
        Integer number2 = new Integer(7);
        if(number1==number2)
        {
            System.out.println("number====1==");
        }
        Integer number3 = 129;
        Integer number4 = 129;
        if(number3==number4)
        {
            System.out.println("number===2===");
        }else{
            System.out.println("=============not equal");
        }


        //String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date(Unix timestamp * 1000))




    }



    public static int sum(int v1, int v2) {
        return v1+v2;
    }
    //对float求和
    public static float sum(float v1, float v2) {
        return v1+v2;
    }

    //对double求和
    public static double sum(double v1, double v2) {
        return v1+v2;
    }

    //正确
    public static double sum() {
        return 0L;
    }




}
