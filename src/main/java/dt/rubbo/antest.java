package dt.rubbo;

/**
 * Created by Administrator on 2018/6/19 0019.
 */
public class antest {
    public static void main(String[] args) {


        kanjia d=new cat();
        System.out.println("age========"+d.age());
        father f=new son();

        if(f instanceof son){

        }

        System.out.println("f-------------是子类-------");








        System.out.println("向上转型---------");


        if((father)f instanceof  father){
            f.setAge(18);
            System.out.println("i am 父类===========");
        }

    }

}
