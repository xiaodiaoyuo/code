package newpage;

import com.nxz.Student;

/**
 * Created by jany.nie on 2018/4/26.
 */
public class demo1Test {
    public static void main(String[] args) {
        Student xiaoming = new Student();
        xiaoming.setAge(23);
        System.out.println(xiaoming.getAge());
        String str="PU01KSKSSS";
        System.out.println( str.substring(0,2).equals("PU"));



    }
}
