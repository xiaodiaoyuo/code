package personpage;

import java.util.Random;

/**
 * Created by Administrator on 2018/10/5 0005.
 */
public class HUtil {
    public String RandomMathStr(Integer length){
        Random rand=new Random();
        String returnstr="";
        for(int i=0;i<length;i++){
        Integer k=rand.nextInt(10);
        if(i==0&&k==0){
            k=1;
            }
            returnstr+=k;
        }
        return returnstr;
    }
}
