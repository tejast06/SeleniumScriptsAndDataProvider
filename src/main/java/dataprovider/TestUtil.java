package dataprovider;

import java.util.ArrayList;

import com.excel.lib.util.Xls_Reader;

public class TestUtil {
	
	public static Xls_Reader reader;
	
	
	
	public static ArrayList<Object[]> getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		reader = new Xls_Reader("F:\\eclipse\\SeleniumScripts\\src\\main\\java\\dataprovider\\registration data.xlsx");
		
		
		
		for(int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++ ) {
			String name = reader.getCellData("Sheet1", "username", rowNum);
			String pwd = reader.getCellData("Sheet1", "pwd", rowNum);
			
			Object[] obj = {name,pwd};
			myData.add(obj);
			
			
		}
		return myData;
		
	}

}
