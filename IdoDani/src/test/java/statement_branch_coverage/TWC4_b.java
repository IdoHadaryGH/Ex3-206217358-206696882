package statement_branch_coverage;

import org.junit.Test;

public class TWC4_b {

	// less then 100% conditions and reveal the error
	@Test(expected = ArithmeticException.class)
	public void WM4_b() {
		int x = 5;
		int y = 0;
		WeakClass.WeakMethod4(x, y);
	}
}
