package cn.imooc;

/**
 * Created by jany.nie on 2018/5/24.
 */
public class Person {
//    创建Person类
//    属性：名字（name），年龄（age）,年级（ grade）
//    方法：1、无参无返回值的student方法，描述为：我是一名学生！
//            2、带参数（性别sex）的方法，描述为：我是一个**孩！（其中，**为传入参数）
//            3、无参无返回值的mySelf方法，介绍自己的姓名、年龄、年级（参数参考效果图）
//
//            2. 创建测试类
//    实例化对象，传入参数，调用无参无返回值的student和mySelf方法及带参方法sex


    String name;
    int age;
    String grade;
    public void student(){
        System.out.println("我是一名学生");
    }
    public String setSex(String sexValue){
     return sexValue;
    }
    public void mySelf(){
        System.out.println("我叫"+name+",年龄为"+age+",年级："+grade);
    }





    }







