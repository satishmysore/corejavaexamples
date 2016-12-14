/**
 * 
 */
package com.satish.objectcomparetest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author satishr
 *
 */
public class HashSetExampl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intSetList = new ArrayList<Integer>();
		intSetList.add(1);
		intSetList.add(1);
		intSetList.add(3);
		intSetList.add(4);
		intSetList.add(5);
		intSetList.add(6);

		for (Integer i : intSetList) {
			System.out.println(i);
		}
		System.out.println("\n after filter \n");
		Set<Integer> filterSet = new HashSet<Integer>(intSetList);
		for (Integer i : filterSet) {
			System.out.println(i);
		}
		
		System.out.println("max value :--- "+Math.max((int) (50/.75f) + 1, 16));
		
		
		List intSetList1 = new ArrayList();
		intSetList1.add(1);
		intSetList1.add(1);
		intSetList1.add(3);
		intSetList1.add(4);
		intSetList1.add(5);
		intSetList1.add(6);
		
		System.out.println("\n after filter with no type \n");
		Set filterSet1 = new HashSet(intSetList1);
		for (Object i : filterSet1) {
			System.out.println(i);
		}
		
		Map mapFilterSet1 = (Map) new HashSet(intSetList1);
		
		Set mapFilterSet1It = mapFilterSet1.entrySet();
		
		Set<Integer> filterSet2 = new HashSet<Integer>();
		for (Integer i : intSetList) {
			filterSet2.add(i);
		}
		
		Set<Integer> filterSet3 = new HashSet<Integer>(3,0.50f);
		for (Integer i : intSetList) {
			System.out.println("hashcode : ---- "+i);
			filterSet3.add(i);
		}
		
	
	}

}
