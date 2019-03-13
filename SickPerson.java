/**
 * Class representing a SickPerson.
 * 
 * @author johny
 * @version 2019-03-12
 * 
 */
public class SickPerson extends Person {
	
	private int severity;
	
	/**
	 * Stores information about the SickPerson.
	 * 
	 * @param name The SickPerson's name.
	 * @param age The SickPerson's age.
	 * @param severity The SickPerson's injury's level of severity.
	 */
	public SickPerson(String name, int age, int severity) {
		
		super(name, age);
		this.severity = severity;
	}
	
	/**
	 * Compares SickPerson objects by level of severity.
	 * 
	 * @param p The person being compared to.
	 * @return Standard Comparable values:
	 * 	(1) Severity is higher than p: negative number
	 *  (2) Severity is less than p: positive number
	 *  (3) Severities are the same: 0
	 */
	
	protected int compareToImpl(Person p) {
		
		if (p instanceof SickPerson) {
			SickPerson p2 = (SickPerson) p;
			return p2.severity - severity;
		}
		return 0;
	}
	
	/**
	 * States the SickPerson and his/her severity.
	 * 
	 * @return The string containing "SickPerson, a age-year old. Severity level severity".
	 */
	@Override
	public String toString() {
		
		return String.format("%s Severity level %d", super.toString(), severity);
	}
}
