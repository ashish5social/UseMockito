package UseMockito.UseMockito;

public class NumberSummer {
	//This will return sum of all numbers between start and end
	public int sum(int start, int end) {
		int returnValue = 0; 
		if(start > end) {
			return 0;
		} else if (start == end) {
			return start; 
		} else {
			int i = start; 
			while(i<=end) {
				returnValue +=i;
				i++; 
			}
		}
			 
		return returnValue; 
	}

}
