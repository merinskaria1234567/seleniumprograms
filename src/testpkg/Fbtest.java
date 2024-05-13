package testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import pagepkg.Fbpage;
import utilities.Excelutil;

public class Fbtest extends Baseclass{
		@Test
		public void verifyLoginWithValidCred() throws Exception{
			Fbpage p1=new Fbpage(driver);
			//Reading the data from excelfile by specified path
			String x1="D:\\data.xlsx";
			String Sheet="Sheet1";
			int rowCount=Excelutil.getRowCount(x1, Sheet);
			for(int i=1;i<=rowCount;i++) {
				String UserName=Excelutil.getCellValues(x1,Sheet,i,0);
				System.out.println("username---"+UserName);
				String Pwd=Excelutil.getCellValues(x1,Sheet,i,1);
				System.out.println("password----"+Pwd);
				//Passing username and password as parameters
				//Submitting the data by clicking on login butto n
				p1.setvalues(UserName,Pwd);
			}
		}
	}

