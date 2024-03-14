package statement_branch_coverage;

import org.junit.Test;

public class TWC2_a {

	// less then 100% branches and reveal the error
	@Test(expected = ArithmeticException.class)
	public void WM2_a() {
		int x = 8;
		int y = 0;
		WeakClass.WeakMethod2(x, y);
	}
}
