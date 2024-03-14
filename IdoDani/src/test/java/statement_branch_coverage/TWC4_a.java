package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TWC4_a {

	// 100% branches and not reveal the error

	@Test
	public void WM4_a() {
		int x = 4;
		int y = 1;
		int exp = 1;
		int res = WeakClass.WeakMethod4(x, y);
		assertEquals(exp, res);
	}

	@Test
	public void WM4_a2() {
		int x = 0;
		int y = -1;
		int exp = 0;
		int res = WeakClass.WeakMethod4(x, y);
		assertEquals(exp, res);
	}

	@Test
	public void WM4_a3() {
		int x = -4;
		int y = 1;
		int exp = -4;
		int res = WeakClass.WeakMethod4(x, y);
		assertEquals(exp, res);
	}

}
