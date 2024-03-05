package statement_branch_coverage;

import org.junit.Test;

public class TestWC2_a {
	
	@Test(expected=ArithmeticException.class)
	//less then 100% branches and reveal the error
	public void WM2_a() {
		int x=0;
		int y=8;
		WeakClass.WeakMethod2(x, y);
	}
}
