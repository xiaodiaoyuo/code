package com.nxz;


/**
 * Created by Administrator on 2018/9/16 0016.
 */
public class ThreadTest extends Thread{
    public ThreadTest(String name){
    super(name);
    }
    public void run() {
        // compute primes larger than minPrime
     for(int i=1;i<=20;i++){
         System.out.println("线程"+getName()+"is runing"+i);
         try {
             ThreadTest.sleep(3000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
    }

    public static void main(String[] args) {
        ThreadTest test1=new ThreadTest("thread 0====");
        ThreadTest test2=new ThreadTest("thread 1====");
        test1.start();
        test2.start();
    }

}
