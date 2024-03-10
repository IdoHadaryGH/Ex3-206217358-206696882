package statement_branch_coverage;

import org.junit.Test;

public class TWC1_a {

	// less than 100% statements and reveal the error
	@Test(expected = ArithmeticException.class)
	public void WM1_a() {
		int x = 0;
		int y = 7;
		WeakClass.WeakMethod1(x, y);
	}
}
