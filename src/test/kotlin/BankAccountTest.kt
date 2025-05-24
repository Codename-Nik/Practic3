import org.example.BankAccount
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class BankAccountTest {
    @BeforeEach
    fun setUp() {
        TODO("Not yet implemented")
    }

    @AfterEach
    fun tearDown() {
        TODO("Not yet implemented")
    }

    @Test
    fun deposit() {
        val account = BankAccount(100.0)
        account.deposit(50.0)
        assertEquals(150.0, account.getBalance(), 0.001)
        assertThrows<IllegalArgumentException> {
            account.deposit(0.0)
            account.deposit(-50.0)
        }
    }

    @Test
    fun withdraw() {
        val account = BankAccount(100.0)
        account.withdraw(50.0)
        assertEquals(50.0, account.getBalance(), 0.001)
        assertThrows<IllegalArgumentException> {
            account.withdraw(0.0)
            account.withdraw(-50.0)
            account.withdraw(150.0)
        }
    }

    @Test
    fun getBalance() {
        val account = BankAccount(50.0)
        account.deposit(Double.MAX_VALUE / 2)
        assertTrue(account.getBalance() > 100.0)
        account.withdraw(50.0)
        assertEquals(0.0, account.getBalance())
        account.deposit(0.01)
        assertEquals(50.01, account.getBalance())
        account.withdraw(0.01)
        assertEquals(49.99, account.getBalance())

    }

}