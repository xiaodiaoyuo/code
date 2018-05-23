package runoob;

/**
 * Created by jany.nie on 2018/5/23.
 */
public class arrSearch {
    public boolean search(int n,int[] arr){
       boolean flag=false;
       for(int k:arr){
           if(n==k){
               flag=true;
           }
       }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={12,23,4,3,45};
        arrSearch S =new arrSearch();
       boolean t= S.search(45,arr);
        System.out.println("返回t============="+t);
    }
}
