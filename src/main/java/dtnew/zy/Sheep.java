package dtnew.zy;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class Sheep extends Animal{
    public Sheep(String kind) {
        super(kind);
    }

    @Override
    public void cry() {
        System.out.println("i am sheep:mie---mie----mie");
    }
}
