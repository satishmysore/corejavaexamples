/**
 * 
 */
package com.satish.hashcodeobject;

import java.util.HashMap;

import com.satish.hashcodeobject.model.Account;
import com.satish.hashcodeobject.model.AccountHashCode;

/**
 * @author satishr
 *
 */
public class HashCodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "Test";
		System.out.println("String HashCode " + test1.hashCode());

		String test2 = "Test";
		System.out.println("String HashCode " + test2.hashCode());

		System.out.println("no Hash Code override");

		Account a1 = new Account(1);
		a1.setHolderName("A_ONE");

		System.out.println(a1.hashCode());

		Account a2 = new Account(1);
		a2.setHolderName("A_TWO");

		System.out.println(a2.hashCode());

		System.out.println("Hash Map but object change-still no affect");
		HashMap<Account, String> map = new HashMap<Account, String>();

		// Put mutable key and value in map
		map.put(a1, a1.getHolderName());
		map.put(a2, a2.getHolderName());

		// Change the keys state so hash map should be calculated again
		a1.setHolderName("Defaulter");
		a2.setHolderName("Bankrupt");

		// Success !! We are able to get back the values
		System.out.println(map.get(a1)); // Prints A_ONE
		System.out.println(map.get(a2)); // Prints A_TWO

		System.out.println("Hash Code override");

		AccountHashCode ahc2 = new AccountHashCode(1);
		ahc2.setHolderName("A_ONE");

		System.out.println(ahc2.hashCode());

		AccountHashCode ahc3 = new AccountHashCode(2);
		ahc3.setHolderName("A_TWO");

		System.out.println(ahc3.hashCode());

		HashMap<AccountHashCode, String> map1 = new HashMap<AccountHashCode, String>();

		// Put mutable key and value in map
		map1.put(ahc2, ahc2.getHolderName());
		map1.put(ahc3, ahc3.getHolderName());

		// Success !! We are able to get back the values
		System.out.println(map1.get(ahc2)); // Prints A_ONE
		System.out.println(map1.get(ahc3)); // Prints A_TWO
		
		// Change the keys state so hash map should be calculated again
		ahc2.setHolderName("Defaulter");
		ahc3.setHolderName("Bankrupt");
		
		
		System.out.println(map1.get(ahc2)); // Prints A_ONE
		System.out.println(map1.get(ahc3)); // Prints A_TWO

	}

}
