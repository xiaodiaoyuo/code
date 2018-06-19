package dt.rubbo;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class father {
    public int age;
    public String name;
    public long heigth;
    public father(){
        System.out.println("i am father");
    }

    public father(int age, String name, long heigth) {
        this.age = age;
        this.name = name;
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHeigth() {
        return heigth;
    }

    public void setHeigth(long heigth) {
        this.heigth = heigth;
    }
}
