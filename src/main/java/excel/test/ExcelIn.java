package excel.test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2018/5/8 0008.
 */
public class ExcelIn {
    public static void main(String[] args) throws BiffException, IOException {

        String p="A1#B2#C3&&&E4#D5#F6";
        String[] myList =p.split("&&&");
        System.out.println("myList====="+myList.length);
        for(String k :myList){
            System.out.println("k================"+k);
            if(k.indexOf("|")!=0){
                String[] arrk=k.split("#");
                for(String l :arrk){
                    System.out.println("l============"+l);
                }

            };

        }
        long s1=100230;
        System.out.println(s1);

//        File file = new File("e:/demo_test.xlsx");
//        Workbook rwb = Workbook.getWorkbook(file);
//        Sheet rs = rwb.getSheet(0);// 或者rwb.getSheet(0)
//        int clos = rs.getColumns();// 得到所有的列
//        int rows = rs.getRows();// 得到所有的行
//
//        System.out.println("clos:" + clos + " rows:" + rows);
//        for (int i = 1; i < rows; i++) {
//            for (int j = 0; j < clos; j++) {
//                System.out.println("第" + i + "行");
//                // 第一个是列数，第二个是行数
//                String name = rs.getCell(j++, i).getContents();// 默认最左边编号也算一列
//                String sex = rs.getCell(j++, i).getContents();
//                String birthday = rs.getCell(j++, i).getContents();
//                System.out.println(" name:" + name + ",sex:" + sex + ", birthday:" + birthday);
//                j=5;
//            }
//        }
  }

}
