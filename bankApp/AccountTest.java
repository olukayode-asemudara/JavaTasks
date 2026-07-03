package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private Account account;

    @BeforeEach
    public void setup() {
        account = new Account();
    }

    @Test
    public void testDeposit200BalanceShouldBe200() {
        account.deposit(200);

        assertEquals(200.0, account.getBalance());
    }

    @Test
    public void testDepositNegativeAmountBalanceShouldRemainZero() {
        account.deposit(-200);

        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testWithdrawFromEmptyAccountBalanceShouldRemainZero() {
        account.withdraw(200, "1234");

        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testWithdrawAmountLessThanBalance() {
        account.deposit(500);
        account.withdraw(200, "1234");

        assertEquals(300.0, account.getBalance());
    }

    @Test
    public void testWithdrawAmountGreaterThanBalanceWithCorrectPasswordCredentials() {
        account.deposit(500);
        account.withdraw(700, "1234");

        assertEquals(500.0, account.getBalance());
    }

    @Test
    public void testWithdrawWithShortPasswordThrowsException() {
        IllegalArgumentException exception = assertThrows(
                        IllegalArgumentException.class,
                        () -> account.withdraw(100, "123")
                );

        assertEquals("password too short", exception.getMessage());
    }

    @Test
    public void testWithdrawWithAlphaNumericPasswordThrowsException() {
        IllegalArgumentException exception =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> account.withdraw(100, "12ab")
                );

        assertEquals("password must contain only digits", exception.getMessage());
    }

    @Test
    public void testThatICanWithdrawWithoutProvidingPassword() {
        account.deposit(500);
        assertThrows(IllegalArgumentException.class, ()-> account.withdraw(700, ""));

        assertEquals(500.0, account.getBalance());
    }
}