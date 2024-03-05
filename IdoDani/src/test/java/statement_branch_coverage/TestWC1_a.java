package statement_branch_coverage;

import org.junit.Test;

public class TestWC1_a {
	
	@Test(expected=ArithmeticException.class)
	//less than 100% statements and reveal the error
	public void WM1_a() {
		int x=0;
		int y=7;
		WeakClass.WeakMethod1(x, y);
	}
}
