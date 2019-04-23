package connection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2019/4/14 0014.
 */
public class HashSetLearning {

    @Test
    public void HashLearn(){
        Set s=new HashSet();
        s.add("blue");
        s.add("green");
        s.add("red");
        s.add("black");
        //使用迭代器接口
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+"    ");
        }

    }

    @Test
    public void HashCatTest(){
        HashCat cat1=new HashCat("花花",3,"中华田园犬");
        HashCat cat2=new HashCat("圆圆",4,"野猫");
        HashCat cat3=new HashCat("乐乐",5,"小白猫");

        Set<HashCat> cats=new HashSet();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println("显示所有猫的信息===1==");
        for(Object d:cats){
            System.out.println(((HashCat)(d)).getName()+","+((HashCat)(d)).getSpeice());
        }

        System.out.println("显示所有猫的信息===2==");
        Iterator<HashCat> it=cats.iterator();

        while(it.hasNext()){
            //如果需要使用it.next()获取属性，需要使用泛型确定类型
            HashCat c=it.next();
            System.out.println(c.getName()+","+c.getSpeice());
            System.out.println(c);
        }


        System.out.println("添加重复数据===========");
        HashCat cat4=new HashCat("花花",3,"中华田园犬");
        cats.add(cat4);

        Iterator<HashCat> it1=cats.iterator();
        while(it1.hasNext()){
            //如果需要使用it.next()获取属性，需要使用泛型确定类型
            HashCat c1=it1.next();
            System.out.println(c1);
        }




    }
}
