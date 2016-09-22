package Homework;

/*
 * Given the following sample tracks in the code pull out information to populate a 
 * class and print out the information to the screen for all the class properties given
 * 
 * Resources:
 * https://en.wikipedia.org/wiki/Magnetic_stripe_card
 * 
 * Hints:
 * String.split()
 * 
 * Class:
 * Account Number (PAN) - getter/setter
 * Expiration Year - getter/setter
 * Expiration Month - getter/setter
 * Account Holder First Name - getter/setter
 * Account Holder Last Name - getter/setter
 */

import java.util.List;
import java.util.ArrayList;
public class MagneticStripe {
	public static void main(String[] args) {
		List<String> tracks = new ArrayList<String>();
		tracks.add("%B6011000000000012^DRAKE/DAMON E             ^18071X100000*000000000XXX000000?");
		tracks.add("%B300012552615478^DUCK/DONALD               ^1806Z3011225*000378000XXX000142?");
		List<MagneticStripe> stripes = new ArrayList<MagneticStripe>();
		
		for (String t : tracks) {
			MagneticStripe ms = new MagneticStripe(t);
			stripes.add(ms);
		}
		
		for (MagneticStripe ms : stripes) {
			ms.print();
		}
	}
	
	private String accountNumber;
	public String getAccountNumber() { return accountNumber; }
	public void setAccountNumber(String an) { accountNumber = an; }
	
	private String expYear;
	public String getExpYear() { return expYear; }
	public void setExpYear(String ey) { expYear = ey; }
	
	private String expMonth;
	public String getExpMonth() { return expMonth; }
	public void setExpMonth(String em) { expMonth = em; }
	
	private String firstName;
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) { firstName = fn; }
	
	private String lastName;
	public String getLastName() { return lastName; }
	public void setLastName(String ln) { lastName = ln; }
	
	public void print() {
		System.out.println("Acct #: " + getAccountNumber() + "\n" +
						"First Name: " + getFirstName() + "\n" +
						"Last Name: " +  getLastName() + "\n" +
						"Exp Month: " + getExpMonth() + " Exp Year: " + getExpYear() + "\n");
	}
	
	public MagneticStripe(String trk) {
		String[] array = trk.split("\\^");
		String acctNum = array[0].substring(2,array[0].length()).trim();
		String[] names = array[1].split("\\/");
		String first = names[1].trim();
		String last = names[0].trim();
		String year = array[2].substring(0,2);
		String month = array[2].substring(2,4);

		setAccountNumber(acctNum);
		setFirstName(first);
		setLastName(last);
		setExpYear(year);
		setExpMonth(month);
		
	}
}