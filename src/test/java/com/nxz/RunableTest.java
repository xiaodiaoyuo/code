package com.nxz;

/**
 * Created by Administrator on 2018/9/19 0019.
 */
public class RunableTest implements  Runnable{
    int i=0;
    public void run(){
        while(i<=30){
            System.out.println("runable======="+(i++)+"======"+Thread.currentThread().getName());

        }

    }

    public static void main(String[] args) {
        //共享资源
        RunableTest t=new RunableTest();
        Thread p1=new Thread(t);
        Thread p2=new Thread(t);
        p1.start();
        p2.start();

    }


}
