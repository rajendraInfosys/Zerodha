package Framework_Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
public static void main(String[] args) throws Throwable {
	//Create object of FileInputStream class
	FileInputStream file=new FileInputStream("C:\\Users\\Rajendra Yamgar\\OneDrive\\Documents\\Parameterization_Sheet.xlsx");
	//open excel sheet using create method
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	//Print data in Excel sheet
	System.out.println(data);
}
}
