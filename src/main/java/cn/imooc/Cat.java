package cn.imooc;

/**
 * Created by jany.nie on 2018/5/24.
 */
public class Cat {

    String name; //昵称
    int month; //年龄
    double weight; //体重
    String species;  //种类
     public Cat(){
        System.out.println("无参构造函数===================");
    }
public Cat(String name){
    this("name111","namew2");
    this.run();
    this.eat();

    System.out.println("===有参构造函数===============");
};
     public Cat(String name1,String name2){
         System.out.println("两个参数的构造函数");
     }

    public void run(){
        System.out.println("小猫快跑");
    }

    public void eat(){
        System.out.println("小猫吃东西");
    }


}
