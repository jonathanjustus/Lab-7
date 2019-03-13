import org.junit.Assert;
import org.junit.Test;

/**
 * Testing HealthyPerson Class.
 * 
 * @author johny
 * @version 2019-03-10
 * 
 */
public class HealthyPersonTest
{
	
	/**
	 * Tests age comparison
	 */
	@Test
	public void compareToImplTest()
	{

    	HealthyPerson healthyPerson = new HealthyPerson("Bob", 12, "Broken leg");
    	Person healthyPerson2 = new HealthyPerson("Joe", 15, "Stung by a bee");
    	HealthyPerson healthyPerson3 = new HealthyPerson("Joe", 13, "Flu");
    	Person person = new SickPerson("Jim", 5, 5);
    	
    	boolean actual = healthyPerson.compareToImpl(healthyPerson2) < 0;
    	boolean expected = true;
    	
    	boolean actual2 = healthyPerson2.compareToImpl(healthyPerson) > 0;
    	boolean expected2 = true;
    	
    	boolean actual3 = healthyPerson2.compareToImpl(healthyPerson3) == 0;
    	boolean expected3 = true;
    	
    	boolean actual4 = healthyPerson2.compareToImpl(person) == 0;
    	boolean expected4 = true;
    	
    	Assert.assertEquals(expected, actual);
    	Assert.assertEquals(expected2, actual2);
    	Assert.assertEquals(expected3, actual3);
    	Assert.assertEquals(expected4, actual4);
	}
	
	/**
	 * Tests toString
	 */
	@Test
	public void toStringTest()
	{
		
    	HealthyPerson healthyPerson = new HealthyPerson("Ben", 15, "Broken leg");
    	
    	String actual = healthyPerson.toString();
    	String expected = "Ben, a 15-year old. In for Broken leg";
    	
    	Assert.assertEquals(expected, actual);
	}
}
