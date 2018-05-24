package cn.imooc;

/**
 * Created by jany.nie on 2018/5/24.
 */
public class CatTest {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="niexz";
        c.species="maomao";
        c.weight=9.99;

        Cat t=c;

        t.name="xiasq";
        t.species="gougou";
        t.weight=19.99;


        System.out.println("年龄======"+c.month);
        System.out.println("姓名========"+c.name);
        System.out.println("种类====="+c.species);
        System.out.println("体重===="+c.weight);

    }
}
