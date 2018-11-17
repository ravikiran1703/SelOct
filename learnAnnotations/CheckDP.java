package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckDP {
	@Test(dataProvider = "fetchData")
	public void run(String a , String b,String c) {
		System.out.println(a);

	}
	@DataProvider(name = "fetchData", indices= {}) 
	public String[][] getData() {
		String[][] data = new String[3][3];
		  data[0][0] = "first";
		  data[0][1] = "Gopi";
		  data[0][2] = "J";
		  
		  data[1][0] = "second";
		  data[1][1] = "Gayatri";
		  data[1][2] = "K";
		  
		  data[2][0] = "third";
		  data[2][1] = "Gayatri";
		  data[2][2] = "K";
		 return data;  
	}

}
