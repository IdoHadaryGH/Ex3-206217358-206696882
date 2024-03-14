package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TWC1_b {

	// 100% statements and not reveal the error

	@Test
	public void WM1_b1() {
		int x = -1;
		int y = 4;
		int exp = -24;
		int res = WeakClass.WeakMethod1(x, y);
		assertEquals(exp, res);
	}

	@Test
	public void WM1_b2() {
		int x = 4;
		int y = 4;
		int exp = 0;
		int res = WeakClass.WeakMethod1(x, y);
		assertEquals(exp, res);
	}

}
