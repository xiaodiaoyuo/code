package cn.imooc;

/**
 * Created by jany.nie on 2018/5/24.
 */
public class Cat {

    String name; //昵称
    int month; //年龄
    double weight; //体重
    String species;  //种类
     Cat(){
        System.out.println("无参构造函数===================");
    }
public Cat(String name){
    System.out.println("===有参构造函数===============");
};

    public void run(){
        System.out.println("小猫快跑");
    }

    public void eat(){
        System.out.println("小猫吃东西");
    }


}
