package com.nxz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsageStudent {

    public static void main(String[] args) {
        Student xiaoming =new Student();
        xiaoming.setAge(12);
        xiaoming.getId("020608116");
        xiaoming.setName("聂晓珍");

        System.out.println(xiaoming.getAge());
        System.out.println("=========="+xiaoming.getPassword());
        Simply simplytest=new Simply();
        System.out.println("============="+simplytest.sum(23,34));
        System.out.println("============="+simplytest.sum(12.33f,12.33f));
        System.out.println("============="+simplytest.sum(23.76,34.21));


        String s1 = "abc";

        String s2 = "abc";

        String s3 = new String("abc");

        System.out.println("s1==s2, " + (s1==s2));
        System.out.println("s2==s3, " + (s2==s3));
        System.out.println("s2 equlas s3," + (s2.equals(s3)));


        StringBuffer sbStr = new StringBuffer();
        System.out.println(sbStr.append("dskfjdskfj"));

        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }
        if (args.length !=0) {
            if (args[0].equals("A")) {
                System.out.println("添加用户");
            } else if (args[0].equals("U")) {
                System.out.println("更新用户");
            }
        }else {
            System.out.println("请输入参数A:添加，U：修改") ;
        }

        IdCard idCard1 = new IdCard();
        idCard1.cardNo = 223243244243243L;
        Person person1 = new Person();
        person1.name = "张三";

        IdCard idCard2 = new IdCard();
        idCard2.cardNo = 223243244244343L;
        Person person2 = new Person();
        person2.name = "李四";


        IdCard idCard3 = new IdCard();
        idCard3.cardNo = 223243244243243L;
        Person person3 = new Person();
        person3.name = "张三";

        Map<IdCard, Person> map = new HashMap<IdCard, Person>();
        map.put(idCard1, person1);
        map.put(idCard2, person2);
        map.put(idCard3, person3);
        for (Iterator<Map.Entry<IdCard, Person>> iter = map.entrySet().iterator(); iter.hasNext();) {
            Map.Entry entry = (Map.Entry)iter.next();
            IdCard idCard = (IdCard)entry.getKey();
            Person person = (Person)entry.getValue();

            System.out.println("===========d=============="+person.name);
        }



    }
    public  void queryBanksTest(){
        String cardNoPlain = "6214921201533954";
        System.out.println("2212222");
    }



}
