package alessia.decreasingCounter.classe;

public class DecreasingCounter {
	
	private int value;

	public DecreasingCounter(int value) {
		this.value = value;
	}

	public void printValue() {
		System.out.println("value: " + this.value);
	}

	public void decrement() {
		if(this.value > 0) {
			this.value -= 1;
		}
	}

	// and the other methods go here
}
