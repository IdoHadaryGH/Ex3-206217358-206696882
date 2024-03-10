package statement_branch_coverage;

import org.junit.Test;

public class TWC3_b {
	
	//100% branches and reveal the error
	@Test(expected=ArithmeticException.class)
	public void WM3_b() {
		int x=0;
		int y=5;
		WeakClass.WeakMethod3(x, y);
	}
	
}
