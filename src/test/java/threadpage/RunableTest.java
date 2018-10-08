package threadpage;

/**
 * Created by jany.nie on 2018/9/17.
 */
public class RunableTest implements Runnable {


    private int ticket = 10;
    //记得要资源公共，要在run方法之前加上synchronized关键字，要不然会出现抢资源的情况
    public synchronized  void  run() {
        for (int i = 0; i <10; i++) {
            if (this.ticket>0) {
                System.out.println("卖票：ticket"+this.ticket--);
            }
        }

    }




    public static void main(String[] args) {
        RunableTest r=new RunableTest();
        Thread a=new Thread(r);

        new Thread(a).start();//同一个mt，但是在Thread中就不可以，如果用同一
        new Thread(a).start();//个实例化对象mt，就会出现异常
        new Thread(a).start();

    }
}
