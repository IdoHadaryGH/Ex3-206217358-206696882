package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWC4_a {
	
	@Test
	//100% branches and not reveal the error
	public void WM4_a() {
		int x=4;
		int y=4;
		
		int exp=8;
		int res=WeakClass.WeakMethod4(x, y);
		assertEquals(exp, res);
	}
}
