package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TWC3_a {

	// 100% statement, less then 100% branches and not reveal the error
	@Test
	public void WM3_a() {
		int x = 5;
		int y = 1;
		int exp = 5;
		int res = WeakClass.WeakMethod3(x, y);
		assertEquals(exp, res);
	}

}
