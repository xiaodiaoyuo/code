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
        File file = new File("e:/1.xls");
        Workbook rwb = Workbook.getWorkbook(file);
        Sheet rs = rwb.getSheet(0);// 或者rwb.getSheet(0)
        int clos = rs.getColumns();// 得到所有的列
        int rows = rs.getRows();// 得到所有的行

        System.out.println("clos:" + clos + " rows:" + rows);
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < clos; j++) {
                System.out.println("第" + i + "行");
                // 第一个是列数，第二个是行数
                String name = rs.getCell(j++, i).getContents();// 默认最左边编号也算一列
                String sex = rs.getCell(j++, i).getContents();
                String birthday = rs.getCell(j++, i).getContents();
                System.out.println(" name:" + name + ",sex:" + sex + ", birthday:" + birthday);
            }


        }
    }

}
