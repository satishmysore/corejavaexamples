/**
 * 
 */
package com.satish.model;

/**
 * @author satishr
 * @param <T>
 *
 */
public class PersonComparableSortByDesc implements Comparable<PersonComparableSortByDesc> {

	private String firstName;
	private String lastName;
	private int age;
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(PersonComparableSortByDesc o) throws ClassCastException {
		if (!(o instanceof PersonComparableSortByDesc))
		      throw new ClassCastException("A Person object expected.");
		    int anotherPersonAge = ((PersonComparableSortByDesc) o).getAge();  
		    return  anotherPersonAge - this.age;    
	}
}
