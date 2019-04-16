package naztech.LambdaCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calc calAdd=(double n1, double n2)->{return n1+n2;};
		Calc calSub=(double n1, double n2)->{return n1-n2;};
		Calc calMul=(double n1, double n2)->{return n1*n2;};
		Calc calDiv=(double n1, double n2)->{if(n2==0) {System.out.println("Cannot Divide");return 0;} return n1/n2;};
		Calculator c1=new Calculator();
		assertEquals(50,c1.process(30, 20, calAdd));
		assertEquals(10,c1.process(30, 20, calSub));
		assertEquals(600,c1.process(30, 20, calMul));
		assertEquals(3,c1.process(30, 10, calDiv));
		assertEquals(0,c1.process(30, 0, calDiv));
	}

}
