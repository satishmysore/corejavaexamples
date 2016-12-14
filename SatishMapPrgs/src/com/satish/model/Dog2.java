/**
 * 
 */
package com.satish.model;

/**
 * @author satishr
 *
 */
public class Dog2 {
	
	private Integer id;
	private String Name;
	private String breeds;
	/**
	 * @param id
	 * @param name
	 * @param breeds
	 */
	public Dog2(Integer id, String name, String breeds) {
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((breeds == null) ? 0 : breeds.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog2 other = (Dog2) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (breeds == null) {
			if (other.breeds != null)
				return false;
		} else if (!breeds.equals(other.breeds))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		

}
