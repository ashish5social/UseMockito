package UseMockito.UseMockito;

public class Calculator {

	ICalculatorService calService = null;

	public Calculator(ICalculatorService calculatorService) {
		calService = calculatorService;
	}

	public int perform(int i, int j) {

		int dataFromService = calService.add(i, j);
		int localCalculation = dataFromService * 2;
		return localCalculation;

	}

	public int performMul(int i, int j) {

		int dataFromService = calService.mul(i, j);
		int localCalculation = dataFromService * 2;
		return localCalculation;

	}

	
}
