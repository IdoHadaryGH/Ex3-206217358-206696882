package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TWC3_a {
	
	//100% statement, less then 100% branches and not reveal the error
	@Test
	public void WM3_a1() {
		int x=-2;
		int y=12;
		
		int exp=8;
		int res=WeakClass.WeakMethod3(x, y);
		assertEquals(exp, res);
	}
	
	//100% statement, less then 100% branches and not reveal the error
	@Test
	public void WM3_a2() {
		int x=-1;
		int y=5;
		
		int exp=-5;
		int res=WeakClass.WeakMethod3(x, y);
		assertEquals(exp, res);
	}
	
}
