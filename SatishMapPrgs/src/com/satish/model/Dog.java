/**
 * 
 */
package com.satish.model;

/**
 * @author satishr
 *
 */
public class Dog {
	
	private Integer id;
	private String Name;
	private String breeds;
	/**
	 * @param id
	 * @param name
	 * @param breeds
	 */
	public Dog(Integer id, String name, String breeds) {
		super();
		this.id = id;
		Name = name;
		this.breeds = breeds;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the breeds
	 */
	public String getBreeds() {
		return breeds;
	}
	/**
	 * @param breeds the breeds to set
	 */
	public void setBreeds(String breeds) {
		this.breeds = breeds;
	}

}
