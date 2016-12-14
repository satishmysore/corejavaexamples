/**
 * 
 */
package com.satish.objectcomparetest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.satish.model.PersonComparable2;

/**
 * @author satishr
 *
 */
public class ObjectCompareTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<PersonComparable2> PersonComparable2sList = new ArrayList<PersonComparable2>();
		PersonComparable2 PersonComparable2 = new PersonComparable2();
		PersonComparable2.setFirstName("Elvis");
		PersonComparable2.setLastName("Goodyear");
		PersonComparable2.setAge(8);
		PersonComparable2sList.add(PersonComparable2);

		PersonComparable2 = new PersonComparable2();
		PersonComparable2.setFirstName("Stanley");
		PersonComparable2.setLastName("Clark");
		PersonComparable2.setAge(8);
		PersonComparable2sList.add(PersonComparable2);

		PersonComparable2 = new PersonComparable2();
		PersonComparable2.setFirstName("Jane");
		PersonComparable2.setLastName("Graff");
		PersonComparable2.setAge(16);
		PersonComparable2sList.add(PersonComparable2);

		PersonComparable2 = new PersonComparable2();
		PersonComparable2.setFirstName("Nancy");
		PersonComparable2.setLastName("Goodyear");
		PersonComparable2.setAge(69);
		PersonComparable2sList.add(PersonComparable2);

		PersonComparable2 = new PersonComparable2();
		PersonComparable2.setFirstName("Nancy");
		PersonComparable2.setLastName("Goodyear");
		PersonComparable2.setAge(69);
		PersonComparable2sList.add(PersonComparable2);

		System.out.println("\nbefore filter "+PersonComparable2sList.size());
		
		for (int i = 0; i < PersonComparable2sList.size(); i++) {
			System.out.println("PersonComparable2s " + i + " : " + PersonComparable2sList.get(i));
		}

		Set<PersonComparable2> filteredList = new HashSet<PersonComparable2>(PersonComparable2sList);

		System.out.println("\nafter filter "+filteredList.size());
		
		Iterator<PersonComparable2> iterator = filteredList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
