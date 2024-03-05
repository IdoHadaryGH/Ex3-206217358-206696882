package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWC2_b {
	
	@Test
	//100% branches and not reveal the error
	public void WM2_b() {
		int x=-3;
		int y=3;
		
		int exp=-9;
		int res=WeakClass.WeakMethod2(x, y);
		assertEquals(exp, res);
	}
}
