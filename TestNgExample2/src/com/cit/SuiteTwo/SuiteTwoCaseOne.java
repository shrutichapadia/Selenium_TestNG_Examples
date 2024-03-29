package com.cit.SuiteTwo;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cit.Utility.Read_XLS;
import com.cit.Utility.SuiteUtility;

//SuiteTwoCaseOne Class Inherits From SuiteTwoBase Class.
//So, SuiteTwoCaseOne Class Is Child Class Of SuiteTwoBase Class And SuiteBase Class.
public class SuiteTwoCaseOne extends SuiteTwoBase{
	Read_XLS FilePath = null;	
	String TestCaseName = null;	
	
	@BeforeTest
	public void checkCaseToRun() throws IOException{
		//Called init() function from SuiteBase class to Initialize .xls Files
		init();	
		//To set SuiteTwo.xls file's path In FilePath Variable.
		FilePath = TestCaseListExcelTwo;
		System.out.println("FilePath Is : "+FilePath);
		TestCaseName = this.getClass().getSimpleName();	
		System.out.println("TestCaseName Is : "+TestCaseName);
	}
	
	//Accepts 3 column's String data In every Iteration.
	@Test(dataProvider="SuiteTwoCaseOneData")
	public void SuiteTwoCaseOneTest(String DataCol1,String DataCol2,String ExpectedResult){
		System.out.println("Value Of DataCol1 = "+DataCol1);
		System.out.println("Value Of DataCol2 = "+DataCol2);		
		System.out.println("Value Of ExpectedResult = "+ExpectedResult);		
	}	
	
	//This data provider method will return 3 column's data one by one In every Iteration.
	@DataProvider
	public Object[][] SuiteTwoCaseOneData(){
		//To retrieve data from Data 1 Column,Data 2 Column and Expected Result column of SuiteTwoCaseOne data Sheet.
		//Last two columns (DataToRun and Pass/Fail/Skip) are Ignored programatically when reading test data.
		return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);
	}
}

