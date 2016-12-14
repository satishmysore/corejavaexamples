/**
 * 
 */
package com.satish.hashcodeobject.model;

/**
 * @author satishr
 *
 */
public class Account {
	private int accountNumber;
	private String holderName;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
}
