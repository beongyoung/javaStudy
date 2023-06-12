/**
 * Bicycle class for Chap7Program1
 * Usage of Multiple Classes 
 * 
 * @author	Beongyoung Park
 * @version	v0.1
 * @since	2023-04-05
 */

public class Bicycle {

	// Data Member
	private String ownerName;

	// Constructor: Initialzes the data member
	public Bicycle() {
		ownerName = "Unknown";
	}

	// Returns the name of this bicycle's owner
	public String getOwnerName() {

		return ownerName;
	}

	// Assigns the name of this bicycle's owner
	public void setOwnerName(String name) {

		ownerName = name;
	}

}
