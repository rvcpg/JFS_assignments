package junit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit1Test {

	@Test
	void Withdraw() throws InsufficientFundException {
        assertThrows(InsufficientFundException.class,() -> junit1.withdraw(9000));
        assertEquals(6000, junit1.withdraw(1000));
        System.out.println(junit1.withdraw(1000));
	}

}
