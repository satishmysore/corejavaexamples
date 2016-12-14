/**
 * 
 */
package com.satish.hashmapcustom;

import java.util.HashMap;

/**
 * @author satishr
 *
 */
public class SatishHashMapCustom {
	
	
	private void test1(){
		HashMap<String,String> testMap = new HashMap<String,String>();
		testMap.put("testMap-key-1", "testMap-value-1");
		testMap.put("testMap-key-2", "testMap-value-2");
		testMap.put("testMap-key-3", "testMap-value-3");
		testMap.put("testMap-key-1", "testMap-value-3");
		testMap.put("testMap-key-1", "testMap-value-4");
		testMap.put("testMap-key-3", "testMap-value-1");
		
	}
	
	
	
	private void test2(){
		HashMap<String, String> testMap1 = new HashMap<>(20);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SatishHashMapCustom satishHashMapCustom = new SatishHashMapCustom();
		satishHashMapCustom.test1();
	

	}

}
