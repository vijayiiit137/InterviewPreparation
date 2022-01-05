package JavaJunitTestCases.JavaJunitTestCases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberTest {

	private final Integer actualNumber;
	private final Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;

	public PrimeNumberTest(Integer actualNumber, Boolean expectedResult) {
		super();
		this.actualNumber = actualNumber;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {

		return Arrays.asList(new Object[][] { { 2, true }, { 6, false } });

	}

	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameter Number is:" + actualNumber);
		assertEquals(expectedResult, primeNumberChecker.validate(actualNumber));

	}

}
