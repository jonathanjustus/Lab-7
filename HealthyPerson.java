/**
 * HealthyPerson Class
 * 
 * @author johny
 * @version 2019-03-12
 *
 */
public class HealthyPerson extends Person
{
	
	private String reason;
	
	/**
	 * HealthyPerson constructor
	 * 
	 * @param HealthyPerson's name
	 * @param HealthyPerson's age
	 * @param HealthyPerson's reason 
	 */
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
	}
	
	/**
	 * Gets reason
	 * 
	 * @return reason.
	 */
	public String getReason()
	{
		return reason;
	}
	
	
	@Override
	protected int compareToImpl(Person p)
	{
		if (!(p instanceof HealthyPerson))
		{
			return 0;
		}
		
		return getName().compareTo(p.getName());
	}
	
	/**
	 * toString()
	 * 
	 * @return The string containing "HealthyPerson, a age-year old. In for reason".
	 */
	@Override
	public String toString()
	{
		return String.format("%s In for %s", super.toString(), reason);
	}
}
