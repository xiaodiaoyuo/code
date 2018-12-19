package tools.jany;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelUtil {
	public static XSSFWorkbook ExcelWorkbook;
	public static XSSFSheet ExcelSheet;
	public static XSSFRow Row;
	public static XSSFCell Cell;
	
	/**
	 * 设定要操作的Excel的文件路径和Excel文件的sheet名称
	 * @param Path
	 * @throws Exception
	 */
	public static void setExcelFile(String Path) throws Exception{
		FileInputStream ExcelFile;
		try {
			//实例化Excel文件的FileInputStream对象
			ExcelFile = new FileInputStream(Path);
			//实例化Excel文件的XSSFWorkbook对象
			ExcelWorkbook =new XSSFWorkbook(ExcelFile);
		} catch (Exception e){
			System.out.println("Excel路径设定失败!");
			e.printStackTrace();
		}
	}
	
	/**
	 * 设定要操作的Excel的文件路径和Excel文件的sheet名称
	 * @param Path
	 * @param SheetName
	 * @throws Exception
	 */
	public static void setExcelFile(String Path, String SheetName) throws Exception{
		FileInputStream ExcelFile;
		try {
			//实例化Excel文件的FileInputStream对象
			ExcelFile = new FileInputStream(Path);
			//实例化Excel文件的XSSFWorkbook对象
			ExcelWorkbook =new XSSFWorkbook(ExcelFile);
			//实例化XSSFSheet对象，指定Excel文件中sheet名称
			ExcelSheet = ExcelWorkbook.getSheet(SheetName);
		} catch (Exception e){
			System.out.println("Excel路径设定失败!");
			e.printStackTrace();
		}
	}
	

	
	/**
	 * 读取Excel文件指定单元格的内容的方法，只支持扩展名.xlsx的Excel文件
	 * @param SheetName
	 * @param RowNum
	 * @param ColNum
	 * @return CellData
	 * @throws Exception
	 */
	public static String getCellData(String SheetName, int RowNum, int ColNum) throws Exception{
		//实例化XSSFSheet对象
		ExcelSheet = ExcelWorkbook.getSheet(SheetName);
		try {
			//获取指定单元格的对象
			Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);
			//通过单元格的数据类型，来选择使用getStringCellValue和getNumericCellValue获取单元格内容
			String CellData = Cell.getCellType() == XSSFCell.CELL_TYPE_STRING ? Cell.getStringCellValue() + "" : String.valueOf(Math.round(Cell.getNumericCellValue()));
			//返回指定单元格的字符串内容
			return CellData;
		} catch (Exception e) {
			e.printStackTrace();
			//读取遇到异常，返回空字符串
			return "";
		}
	}
	
	/**
	 * 获取Excel文件最后一行的行号
	 * @return
	 */
	public static int getLastRowNum () {
		//返回sheet中最后一行的行号
		return ExcelSheet.getLastRowNum();
	}
	
	/**
	 * 获取指定sheet的总行数
	 * @param SheetName
	 * @return number
	 */
	public static int getRowCount (String SheetName) {
		//实例化XSSFSheet对象
		ExcelSheet = ExcelWorkbook.getSheet(SheetName);
		int number = ExcelSheet.getLastRowNum();
		return number;
	}	
	


}
