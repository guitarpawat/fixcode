package fixcode;
/**
 * A simple model for a person with a name.
 * 
 * @author Pawat Nakpiphatkul
 */

public class Person {
	/** the person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object.
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Get the person's name.
         * @return person's name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * Set or change the person's name.
         * @param newname is the new name of the Person
	 */
	public void setname(String newname) {
		this.name = newname;
	}
	
	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Person other) {
		if(other == null)
                    return false;
                if(this == other)
                    return true;
                if(this.getClass() != other.getClass())
                    return false;
                other = (Person) other;
                return this.getName().equals(other.getName());
	}
	
	/**
	 * Get a string representation of this Person.
         * @return the string of person information
	 */
	public String toString() {
		return "Person " + name;
	}
}
