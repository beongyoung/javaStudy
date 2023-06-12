/**
 * The Bicycle class implements an application that
 * simply displays bike's owner based on the multiple classes
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-13
 */

public class Bicycle {

	/** 
	 *  Data member for owner's name (String)
	 */
	protected String ownerName;

	/**
	 *  Constructor: Initialzes the data member
	 */
	
	public Bicycle() {
		this("Unknown");
	}
	
	/**
	 * Constructor of Bicycle class
	 * 
	 * @param ownerName will be set on the data member
	 */
	public Bicycle(String ownerName) {
		this.ownerName = ownerName;
	}
	
	/** 
	 * Returns the name of this bicycle's owner
	 * @return ownerName
	 */
	public String getOwnerName() {

		return ownerName;
	}

	/** 
	 * Assigns the name of this bicycle's owner
	 * @param name set the owner's name into data member
	 */
	public void setOwnerName(String name) {

		ownerName = name;
	}
}