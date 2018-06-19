package dtnew.zy;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class Dog extends Animal {
    public Dog(String kind) {
        super(kind);
    }

    @Override
    public void cry() {
        System.out.println("dog----wangwangwang~~~~~");
    }
}
