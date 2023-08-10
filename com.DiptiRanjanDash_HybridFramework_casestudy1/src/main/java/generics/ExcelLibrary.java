package generics;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements Autoconstant
{ 
	public static String fetchdata(String path,String sheet,int row,int cell) throws IOException
	{
//		File f=new File(excelfilepath);
		FileInputStream file=new FileInputStream(excelfilepath);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		String store=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return store;
	}

}