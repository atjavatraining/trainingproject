import static org.junit.Assert.*;

import org.junit.Test;

import policy.InsurancePolicy;

public class InsurancePolicyTest {

	@Test
	public void test() {
		InsurancePolicy policy = new InsurancePolicy(100, null);
		
		assertEquals(100, policy.getValue(), 0);
		policy.add(250);
		
		assertEquals(350, policy.getValue(), 0);		
	}
}
