package connection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/4/14 0014.
 */
public class ListLearning {

    @Test
    public void ArrayListTest(){
        ArrayList L = new ArrayList();
        L.add("语文");
        L.add("数学");
        L.add("英语");
        L.add("化学");
        L.add("物理");
        L.add("生物");
        System.out.println("size========"+L.size());
        for(Object n:L){
            System.out.println("value==========f"+n);
        }
    }

    @Test
    public void NoticeTest(){
        Notice notice1= new Notice(1,"欢迎来到默课网","管理员",new Date());
        Notice notice2= new Notice(2,"请同学按时提交作业","老师",new Date());
        Notice notice3= new Notice(3,"考勤通知","老师",new Date());
        ArrayList l=new ArrayList();
        l.add(notice1);
        l.add(notice2);
        l.add(notice3);


        System.out.println("显示公告内容:");
        for(int i=0;i<l.size();i++){
            System.out.println(i+"==标题为:"+((Notice)(l.get(i))).getTittle());
        }
//在第一条公告后面添加一条新的公告
        Notice notice4=new Notice(4,"在线编辑器可以使用了","管理员",new Date());
        l.add(1,notice4);

        System.out.println("显示公告内容:");
        for(int i=0;i<l.size();i++){
            System.out.println(i+"==标题为:"+((Notice)(l.get(i))).getTittle());
        }



    }


}
