package fixcode;

/**
 * Contains student name and id
 * @author Pawat Nakpiphatkul
 */
public class Student extends Person {
        /** Student's id */
	private long id;
	
	/**
         * Initialize a new Student object.
         * @param name is the name of student
         * @param id is id of student
         */
        
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student. 
         * @return the student's information as string
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

        /**
         * Compare two students are same or not
         * Two students are equal if name and id are same
         * @param other is another Student object
         * @return true is two students are same, else return false
         */
        
	public boolean equals(Student other) {
		if(other == null)
                    return false;
                if(this == other)
                    return true;
                if(this.getClass() != other.getClass())
                    return false;
                other = (Student) other;
                return this.getName().equals(other.getName()) && this.getId()==other.getId();
	}
        
        // NO NEED to create getName and setName because it can be use from super class

        /**
         * Get Student's id
         * @return Student's id
         */
        public long getId(){
            return id;
        }
        /**
         * Set new id to Student
         * @param id is new id of the Student
         */
        public void setId(long id){
            this.id = id;
        }
}
