package revisionlearning;

public class RevisionCalculator {
   
	public static void main (String[]args) {
		Input input = new Input();
		input.getInputOne();
		input.getInputTwo();
	}
}

class Logic {

	int add(Input input) {
		int add = input.inputOne + input.inputTwo;
		return add;
	}
	
	int subtract(Input input) {
		int sub = input.inputOne - input.inputTwo;
		return sub;
	}
	
	int multiplay(Input input) {
		int mul = input.inputOne * input.inputTwo;
		return mul;
	}
	
	int divided(Input input) {
		int div = input.inputOne / input.inputTwo;
		return  div;
	}
	
	double percent(Input2 input2) {
		double per = input2.inputOne / input2.inputTwo;
		return per;
		
	}
	
	
}

class Input2 {
	
	int inputOne;
	double inputTwo;
	
	public int getInputOne() {
		return inputOne;
	}
	public void setInputOne(int inputOne) {
		this.inputOne = inputOne;
	}
	public double getInputTwo() {
		return inputTwo;
	}
	public void setInputTwo(double inputTwo) {
		this.inputTwo = inputTwo;
	}
	
	
}

class Input {

	int inputOne;
	int inputTwo;

	public int getInputOne() {
		return inputOne;
	}

	public void setInputOne(int inputOne) {
		this.inputOne = inputOne;
	}

	public int getInputTwo() {
		return inputTwo;
	}

	public void setInputTwo(int inputTwo) {
		this.inputTwo = inputTwo;
	}

}