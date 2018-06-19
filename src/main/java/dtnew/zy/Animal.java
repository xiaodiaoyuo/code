package dtnew.zy;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class Animal {
    public String kind;

    public Animal(String kind) {
        this.kind = kind;
        System.out.println("i am a"+kind);
    }
    public void cry(){
        System.out.println("i am animal cry");
    }
}
