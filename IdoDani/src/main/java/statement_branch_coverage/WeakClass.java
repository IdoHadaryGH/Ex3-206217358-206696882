package statement_branch_coverage;

public class WeakClass {

	// A- less than 100% statements and reveal the error
	// B- 100% statements and not reveal the error
	public static int WeakMethod1(int x, int y) {
		int res = 20;
		if (x <= 1 || y == 0) {
			res = (res + y) / x;
		} 
		else {
			res = y - x;
		}
		return res;
	}

	// A- less than 100% branches and reveal the error
	// B- 100% branches and not reveal the error
	public static int WeakMethod2(int x, int y) {
		int res = 0;
		if (y >= 0 || x > 0) {
			res = x / y;
		}
		else {
			res = y * x;
		}
		return res;
	}

	// A- 100% statements, less than 100% branches and not reveal the error
	// B- 100% branches and reveal the error
	public static int WeakMethod3(int x, int y) {
		int res = 7;
		if (x > 0) {
			res = res + x;
		}
		if (x == 5) {
			res = 5;
		}
		res = x / y;
		return res;
	}

	// A- 100% branches and not reveal the error
	// B- less than 100% conditions and reveal the error
	public static int WeakMethod4(int x, int y) {
		int res = 0;
		if (x < 0 || y <= 0) {
			res = x / y;
		}
		else {
			res = y;
		}
		return res;
	}

}
