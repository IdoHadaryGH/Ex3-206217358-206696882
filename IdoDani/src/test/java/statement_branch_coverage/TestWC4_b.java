package statement_branch_coverage;

import org.junit.Test;

public class TestWC4_b {
	
	@Test(expected=ArithmeticException.class)
	//less then 100% conditions and reveal the error
	public void WM4_b() {
		int x=0;
		int y=2;
		WeakClass.WeakMethod4(x, y);
	}
}
