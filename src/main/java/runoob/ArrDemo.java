package runoob;

import java.util.Scanner;

/**
 * Created by jany.nie on 2018/5/22.
 */
public class ArrDemo {
    public static void main(String[] args) {
//        //一维数组
//        int[] myList;         // 首选的方法
//        int myList1[];         //  效果相同，但不是首选方法
//
//        //第一种
//        int[] arr;
//        arr=new int[10];
//
//        //第二种
//        int[] arr1=new int[10];  //int形式的默认为0
//        for(int j=0;j<arr1.length;j++)
//            System.out.println("值arr1=========="+arr1[j]);
//
//        int[] arr2={1,2,3,4,5,6,7,8,9};  //数组初始化
//        for(int k=0;k<arr2.length;k++)
//            System.out.println("值arr2=========="+arr1[k]);

//        //求数组元素累加和
//        int[] arrF =new int[5];
//
//        Scanner sc=new Scanner(System.in);
//
//
//        System.out.println("从键盘获取五个值，并设值");
//        for(int l=0;l<arrF.length;l++){
//            System.out.println("请输入第"+l+"个元素");
//            arrF[l]=sc.nextInt();
//        }
//   sc.close();
//        //求输入累加和
//        int sumarr=0;
//        for(int l=0;l<arrF.length;l++){
//
//            sumarr+=arrF[l];
//
//        }
//        System.out.println("输入值和为"+sumarr);

        int[] getarrMax={34,12,45,23,46};
//        //使用加强型for循环

//        int arrMax=getarrMax[0];
//        for(int i=1;i<getarrMax.length;i++){
//            if(getarrMax[i]>arrMax){
//                arrMax=getarrMax[i];
//            }
//        }
//        System.out.println("最大值为："+arrMax);
        int tmp;
for(int i=0;i<getarrMax.length-1;i++){
    for(int j=i+1;j<getarrMax.length;j++){
        if(getarrMax[j]<getarrMax[i]){
            tmp=getarrMax[j];
            getarrMax[j]=getarrMax[i];
            getarrMax[i]=tmp;

        }
    }
}
        for(int n:getarrMax){
            System.out.println("n=========="+n);

        }



    }

}
