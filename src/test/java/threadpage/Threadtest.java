package threadpage;

/**
 * Created by jany.nie on 2018/9/17.
 */
public class Threadtest extends Thread{

    public Threadtest(String name) {
        super(name);
    }

    public void run(){
         System.out.println("线程run"+getName());
     }


    public static void main(String[] args) {
        Threadtest t=new Threadtest("thread1===");
        t.start();

    }
}
