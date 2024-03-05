package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWC1_b {
	
	@Test
	//100% statements and not reveal the error
	public void WM1_b() {
		int x=-1;
		int y=4;
		
		int exp=5;
		int res=WeakClass.WeakMethod1(x, y);
		assertEquals(exp, res);
	}
}
