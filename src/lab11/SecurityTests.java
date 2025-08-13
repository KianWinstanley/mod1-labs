package lab11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class SecurityTests {
	Security security;
	
	@BeforeEach
	public void setUp() {
		security = new Security();
	}
	
	@AfterEach
	public void tearDown() {
		security = null;
	}
	
	@Test
	public void testLoginEmptyUserId() {
		String userId = "", password = "Freddy99";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginNullUserId() {
		String userId = null, password = "Freddy99";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginUserIdOnlySpaces() {
		String userId = "      ", password = "Freddy99";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginEmptyPassword() {
		String userId = "Fred", password = "";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginNullPassword() {
		String userId = "Fred", password = null;
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginPasswordOnlySpaces() {
		String userId = "Fred", password = "      ";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginPasswordTooShort() {
		String userId = "Fred", password = "Freddy9";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginPasswordWithoutUppercaseLetter() {
		String userId = "Fred", password = "freddy99";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginPasswordWithoutNumber() {
		String userId = "Fred", password = "Freddyxx";
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginCorrectUserIdAndPassword() {
		String userId = "Fred", password = "Freddy99";
		
		boolean actual = security.login(userId, password);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
}
