package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TWC3_b {

	// 100% branches and reveal the error

	@Test
	public void WM3_b1() {
		int x = 5;
		int y = 1;
		int exp = 5;
		int res = WeakClass.WeakMethod3(x, y);
		assertEquals(exp, res);
	}

	@Test(expected = ArithmeticException.class)
	public void WM3_b2() {
		int x = -5;
		int y = 0;
		WeakClass.WeakMethod3(x, y);
	}

}
