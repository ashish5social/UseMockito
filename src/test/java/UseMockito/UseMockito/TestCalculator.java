package UseMockito.UseMockito;

import org.mockito.Mockito;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	Calculator c = null; 
	ICalculatorService calculatorService1 = null; 
	@BeforeClass
	protected void setUp() throws Exception {
		super.setUp(); 
		//ICalculatorService calculatorService1 = new CalculatorService(); 
		calculatorService1 = Mockito.mock(ICalculatorService.class);
		c = new Calculator(calculatorService1); 
		System.out.println("Before");
	}
	
	@Test
	public void testPerform() {
		Mockito.when(calculatorService1.add(2, 3)).thenReturn(5); 
		assertEquals(10, c.perform(2, 3));
		System.out.println("Test passed successfully");
		Mockito.verify(calculatorService1).add(2, 3); 
	}
		
	@Test
	public void testPerformMul() {
		ICalculatorService service = new CalculatorService(); 
		c=new Calculator(service); 
		assertEquals(12, c.performMul(2, 3));
		System.out.println("Test passed successfully");
	}
	
	@AfterClass
	protected void tearDown() throws Exception {
		System.out.println("After");
		super.tearDown();
	}

}
