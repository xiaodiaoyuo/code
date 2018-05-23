package runoob;

/**
 * Created by jany.nie on 2018/5/23.
 * 关于可变参数
 *@version 1.0.0
 *
 *
 *
 */
public class asgrDemo {
public void sum(int... n){
    int sum=0;
    for(int i:n){
        sum=sum+i;
    }
    System.out.println("sum========="+sum);
}
public void search(int n,int... n1){

}
        public static void main(String[] args) {
    asgrDemo a=new asgrDemo();
    a.sum(1);
    a.sum(1,2,3);
    a.sum(14,5);
    }
}
