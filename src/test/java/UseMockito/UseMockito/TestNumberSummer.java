package UseMockito.UseMockito;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNumberSummer {
  
	@DataProvider(name="NumSumDataProvider")
	public Object[][] numberSumDP() {
		return new Object[][] {
			{-1, 1, 0},
			{-2, 1, -3}
		}; 
	}
	
	
	@Test(dataProvider="NumSumDataProvider")
	public void testSum(int start, int end, int expected) {
		NumberSummer ns = new NumberSummer(); 
		int result = ns.sum(start, end); 
		assertEquals(result, expected, "Sum and expected sum are not matching");
	}
}
