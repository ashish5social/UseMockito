package UseMockito.UseMockito;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator(new CalculatorService()); 
		int result = c.perform(2, 3); 
		System.out.println("Output of perform is "+result);

	}

}
