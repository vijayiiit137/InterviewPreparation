package JavaImmutableClass.JavaImmutableClass;

public class Mutable extends Immutable {

	private int secondValue;

	Mutable(int secondValue) {
		this.secondValue = secondValue;
	}

	public int getValue() {
		return secondValue;
	}

	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

}
