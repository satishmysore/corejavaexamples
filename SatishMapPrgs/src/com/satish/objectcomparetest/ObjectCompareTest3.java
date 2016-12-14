/**
 * 
 */
package com.satish.objectcomparetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.satish.model.PersonComparableSortByAsc;
import com.satish.model.PersonComparableSortByDesc;

/**
 * @author satishr
 *
 */
public class ObjectCompareTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PersonComparableSortByAsc[] personComparables = new PersonComparableSortByAsc[5];
		personComparables[0] = new PersonComparableSortByAsc();
		personComparables[0].setFirstName("Elvis");
		personComparables[0].setLastName("Goodyear");
		personComparables[0].setAge(8);

		personComparables[1] = new PersonComparableSortByAsc();
		personComparables[1].setFirstName("Stanley");
		personComparables[1].setLastName("Clark");
		personComparables[1].setAge(8);

		personComparables[2] = new PersonComparableSortByAsc();
		personComparables[2].setFirstName("Jane");
		personComparables[2].setLastName("Graff");
		personComparables[2].setAge(16);

		personComparables[3] = new PersonComparableSortByAsc();
		personComparables[3].setFirstName("Nancy");
		personComparables[3].setLastName("Goodyear");
		personComparables[3].setAge(69);

		personComparables[4] = new PersonComparableSortByAsc();
		personComparables[4].setFirstName("Nancy");
		personComparables[4].setLastName("Goodyear");
		personComparables[4].setAge(69);

		for (int i = 0; i < 5; i++) {
			System.out.println("PersonComparables " + i + " : " + personComparables[i]);
		}

		Arrays.sort(personComparables);

		System.out.println("\n compared on age\n");

		for (int i = 0; i < 5; i++) {
			System.out.println("PersonComparables " + i + " : " + personComparables[i]);
		}

		List<PersonComparableSortByAsc> personComparablesList = new ArrayList<PersonComparableSortByAsc>();
		PersonComparableSortByAsc personComparable = new PersonComparableSortByAsc();
		personComparable.setFirstName("Elvis");
		personComparable.setLastName("Goodyear");
		personComparable.setAge(8);
		personComparablesList.add(personComparable);

		personComparable = new PersonComparableSortByAsc();
		personComparable.setFirstName("Elvis");
		personComparable.setLastName("Goodyear");
		personComparable.setAge(8);
		personComparablesList.add(personComparable);

		personComparable = new PersonComparableSortByAsc();
		personComparable.setFirstName("Stanley");
		personComparable.setLastName("Clark");
		personComparable.setAge(8);
		personComparablesList.add(personComparable);

		personComparable = new PersonComparableSortByAsc();
		personComparable.setFirstName("Jane");
		personComparable.setLastName("Graff");
		personComparable.setAge(16);
		personComparablesList.add(personComparable);

		personComparable = new PersonComparableSortByAsc();
		personComparable.setFirstName("Nancy");
		personComparable.setLastName("Goodyear");
		personComparable.setAge(69);
		personComparablesList.add(personComparable);

		personComparable = new PersonComparableSortByAsc();
		personComparable.setFirstName("Nancy");
		personComparable.setLastName("Goodyear");
		personComparable.setAge(69);
		personComparablesList.add(personComparable);

		System.out.println("\nbefore filter "+personComparablesList.size());

		Set<PersonComparableSortByAsc> filteredList = new HashSet<PersonComparableSortByAsc>(personComparablesList);

		System.out.println("after filter "+filteredList.size());
		
		
		
		List<PersonComparableSortByDesc> personComparablesDescList = new ArrayList<PersonComparableSortByDesc>();
		PersonComparableSortByDesc personComparableByDescByDesc = new PersonComparableSortByDesc();
		personComparableByDescByDesc.setFirstName("Elvis");
		personComparableByDescByDesc.setLastName("Goodyear");
		personComparableByDescByDesc.setAge(8);
		personComparablesDescList.add(personComparableByDescByDesc);

		personComparableByDescByDesc = new PersonComparableSortByDesc();
		personComparableByDescByDesc.setFirstName("Elvis");
		personComparableByDescByDesc.setLastName("Goodyear");
		personComparableByDescByDesc.setAge(8);
		personComparablesDescList.add(personComparableByDescByDesc);

		personComparableByDescByDesc = new PersonComparableSortByDesc();
		personComparableByDescByDesc.setFirstName("Stanley");
		personComparableByDescByDesc.setLastName("Clark");
		personComparableByDescByDesc.setAge(8);
		personComparablesDescList.add(personComparableByDescByDesc);

		personComparableByDescByDesc = new PersonComparableSortByDesc();
		personComparableByDescByDesc.setFirstName("Jane");
		personComparableByDescByDesc.setLastName("Graff");
		personComparableByDescByDesc.setAge(16);
		personComparablesDescList.add(personComparableByDescByDesc);

		personComparableByDescByDesc = new PersonComparableSortByDesc();
		personComparableByDescByDesc.setFirstName("Nancy");
		personComparableByDescByDesc.setLastName("Goodyear");
		personComparableByDescByDesc.setAge(69);
		personComparablesDescList.add(personComparableByDescByDesc);

		personComparableByDescByDesc = new PersonComparableSortByDesc();
		personComparableByDescByDesc.setFirstName("Nancy");
		personComparableByDescByDesc.setLastName("Goodyear");
		personComparableByDescByDesc.setAge(69);
		personComparablesDescList.add(personComparableByDescByDesc);

		System.out.println("\nbefore filter "+personComparablesDescList.size());

		Set<PersonComparableSortByDesc> filteredListDesc = new HashSet<PersonComparableSortByDesc>(personComparablesDescList);

		System.out.println("after filter "+filteredListDesc.size());
	}

}
