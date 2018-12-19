package excel.test;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import tools.jany.ExcelUtil;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Administrator on 2018/5/8 0008.
 */
public class ExcelIn {


    @Test
    private void readExcel() throws Exception {



        ExcelUtil.setExcelFile(" D:\\Users\\jany.nie\\Desktop\\test.xlsx");



    }

}
