package tests;
import model.User;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import model.Transaction;
import model.Account;
public class UserTests {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		User testUser = new User("mike", "my_passwd", "Mike", "Smith", "07771234567");
//		Account testAccount = new Account("5495-1234", "mike", "Standard", new SimpleDateFormat("dd/MM/yyyy").parse("20/08/2019"));
//		Transaction testTransaction = new Transaction("5495-1234", 100, Calendar.getInstance().getTime());
//		
//		System.out.println(testUser);
//		System.out.println(testAccount);
//		System.out.println(testTransaction);
		//
		// TODO 1
		//
		String testUsername = "mike";
		String testPassword = "my_passwrd";
		String testFirstName = "Mike";
		String testLastName = "Smith";
		String testMobileNumber = "07771234567";
		
		User testUser = new User(testUsername, testPassword, testFirstName, testLastName, testMobileNumber);
		
		Boolean passed = true;
		
		if(testUser.getUsername() != testUsername) {
			System.out.println("TC1: Username - did not match!");
			passed = false;
		}
		if(testUser.getPassword() != testPassword) {
			System.out.println("TC2: Password - did not match!");
			passed = false;
		}
		if(testUser.getFirstName() != testFirstName) {
			System.out.println("TC3: First name - did not match!");
			passed = false;
		}
		if(testUser.getLastName() != testLastName) {
			System.out.println("TC4: Last name - did not match!");
			passed = false;
		}
		if(testUser.getMobileNumber() != testMobileNumber) {
			System.out.println("TC5: MN - did not match!");
			passed = false;
		}
		
		if(passed) {
			System.out.println("Success!");
		}
		
		//
		// TODO 2
		//
		assert testUser.getUsername() == testUsername;
		assert testUser.getPassword() == testPassword;
		assert testUser.getFirstName() == testFirstName;
		assert testUser.getLastName() == testLastName;
		assert testUser.getMobileNumber() == testMobileNumber;
	}

}
