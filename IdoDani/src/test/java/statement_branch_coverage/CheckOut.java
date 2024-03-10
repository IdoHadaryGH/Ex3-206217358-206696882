package statement_branch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckOut {

	@Test
	public void test_1_2_4_17() {
		boolean expected = true;
		boolean result = StatusClass.checkOut(3000.00, 500, StatusClass.Status.GOLD);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_2_5_9() {
		boolean expected = false;
		boolean result = StatusClass.checkOut(5000.00, 500, StatusClass.Status.GOLD);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_2_5_8_18() {
		boolean expected = true;
		boolean result = StatusClass.checkOut(7500.00, 700, StatusClass.Status.GOLD);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_3_6_10_19() {
		boolean expected = true;
		boolean result = StatusClass.checkOut(1500.00, 500, StatusClass.Status.SILVER);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_3_6_11_14_21() {
		boolean expected = true;
		boolean result = StatusClass.checkOut(5000.00, 800, StatusClass.Status.SILVER);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_3_6_11_15() {
		boolean expected = false;
		boolean result = StatusClass.checkOut(5000.00, 500, StatusClass.Status.SILVER);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_3_7_12_23() {
		boolean expected = true;
		boolean result = StatusClass.checkOut(1000.00, 500, StatusClass.Status.BRONZE);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_3_7_13_16_22() {
		boolean expected = true;
		boolean result = StatusClass.checkOut(3000.00, 900, StatusClass.Status.BRONZE);
		assertEquals(expected, result);
	}

	@Test
	public void test_1_3_7_13_20() {
		boolean expected = false;
		boolean result = StatusClass.checkOut(8000.00, 500, StatusClass.Status.BRONZE);
		assertEquals(expected, result);
	}

}