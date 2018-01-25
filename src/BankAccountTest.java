import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;



public class BankAccountTest {

	@Test
	public void TestDeposit(){
		BankAccount acc = new BankAccount();
		acc.deposit(50);
		assertEquals(acc.getBalance(),50);
	}

	@Test
	public void TestWithDraw(){
		BankAccount acc = new BankAccount(75);
		acc.withdraw(50);
		assertEquals(acc.getBalance(),25);

}
}
