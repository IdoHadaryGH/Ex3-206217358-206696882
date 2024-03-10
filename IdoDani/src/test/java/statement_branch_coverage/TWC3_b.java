package statement_branch_coverage;

import org.junit.Test;

public class TWC3_b {
	
	@Test(expected=ArithmeticException.class)
	//100% branches and reveal the error
	public void WM3_b() {
		int x=0;
		int y=5;
		WeakClass.WeakMethod3(x, y);
	}
	
}
