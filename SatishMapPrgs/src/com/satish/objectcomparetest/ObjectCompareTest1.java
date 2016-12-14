/**
 * 
 */
package com.satish.objectcomparetest;

import com.satish.model.Dog;
import com.satish.model.Dog2;

/**
 * @author satishr
 *
 */
public class ObjectCompareTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d1 = new Dog(1,"Bulldog","Purebred");
		Dog d2 = new Dog(2,"Beagle","Purebred");
		Dog d3 = new Dog(1,"Bulldog","Purebred");
		//Dog d4 = new Dog();
		
		System.out.println("d1.equals(d2):--- "+d1.equals(d2));
		System.out.println("d2.equals(d3):--- "+d2.equals(d3));
		System.out.println("d1.equals(d3):--- "+d1.equals(d3));
		
		System.out.println("\n new class with hashcode equal override\n");
		
		Dog2 d4 = new Dog2(1,"Bulldog","Purebred");
		Dog2 d5 = new Dog2(2,"Beagle","Purebred");
		Dog2 d6 = new Dog2(1,"Bulldog","Purebred");
		//Dog d4 = new Dog();
		
		System.out.println("d4.equals(d5):--- "+d4.equals(d5));
		System.out.println("d5.equals(d6):--- "+d5.equals(d6));
		System.out.println("d4.equals(d6):--- "+d4.equals(d6));

	}

}
