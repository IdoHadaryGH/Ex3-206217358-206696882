package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TWC2_b {

	// 100% branches and not reveal the error

	@Test
	public void WM2_b1() {
		int x = 1;
		int y = 5;
		int exp = 0;
		int res = WeakClass.WeakMethod2(x, y);
		assertEquals(exp, res);
	}

	@Test
	public void WM2_b2() {
		int x = -1;
		int y = -5;
		int exp = 5;
		int res = WeakClass.WeakMethod2(x, y);
		assertEquals(exp, res);
	}

	@Test
	public void WM2_b3() {
		int x = 1;
		int y = -5;

		int exp = 0;
		int res = WeakClass.WeakMethod2(x, y);
		assertEquals(exp, res);
	}

}
