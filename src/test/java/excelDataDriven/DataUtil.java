package excelDataDriven;

import java.util.Hashtable;

public class DataUtil 
{
	public static Object[][] getTableData(ExcelAPI e, String sheetName, String testName)
	{
		//To find the matching testcase row Number
				int testStartRowNum = 0;
				while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testName))
				{
					testStartRowNum++;
				}
				System.out.println("test start row number is : " +  testStartRowNum);
				
				int colStartRowNum = testStartRowNum+1;
				int dataStartRowNum = testStartRowNum+2;
				
				//Calculate the rows of data
				int rows = 0;
				while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
				{
					rows++;
				}
				System.out.println("Total Rows are : " +  rows);
				
				//Calculate the columns of Data
				int cols = 0;
				while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
				{
					cols++;
				}
				System.out.println("Totak cols are : " +  cols);
				
				//Read the test Data
				int dataRow = 0;
				Hashtable<String, String> table;
				Object[][] data = new Object[rows][1];
				for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
				{
					table = new Hashtable<String, String>();
					for(int cNum=0;cNum<cols;cNum++)
					{
						//System.out.println(e.getCellData(sheetName, cNum, rNum));
						//data[dataRow][cNum] = e.getCellData(sheetName, cNum, rNum);
						String key = e.getCellData(sheetName, cNum, colStartRowNum);
						String value = e.getCellData(sheetName, cNum, rNum);
						table.put(key, value);
					}
					data[dataRow][0] = table;
					dataRow++;
				}
				return data;
	}

}
