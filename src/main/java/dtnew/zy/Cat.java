package dtnew.zy;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class Cat extends Animal {
    public Cat(String kind) {
        super(kind);
    }

    @Override
    public void cry() {
        System.out.println("i am cat cry :miaomiaomiao~~~~");
    }
}
