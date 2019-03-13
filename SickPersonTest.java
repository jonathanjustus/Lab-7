import org.junit.Assert;
import org.junit.Test;

/**
 * SickPerson Class
 * 
 * @author johny
 * @version 2019-03-10
 * 
 */
public class SickPersonTest
{
	
	/**
	 * Tests severities
	 */
	@Test
	public void compareToImplTest()
	{

    	SickPerson sickPerson = new SickPerson("Bob", 12, 2);
    	Person sickPerson2 = new SickPerson("Joe", 15, 5);
    	SickPerson sickPerson3 = new SickPerson("Dale", 15, 5);
    	Person sickPerson4 = new HealthyPerson("Jackson", 9, "Sick");
    	
    	int actual = sickPerson.compareToImpl(sickPerson2);
    	int expected = 3;
    	
    	int actual2 = sickPerson2.compareToImpl(sickPerson);
    	int expected2 = -3;
    	
    	int actual3 = sickPerson2.compareToImpl(sickPerson3);
    	int expected3 = 0;
    	
    	int actual4 = sickPerson2.compareToImpl(sickPerson4);
    	int expected4 = 0;
    	
    	int actual5 = sickPerson.compareToImpl(sickPerson4);
    	int expected5 = 0;
    	
    	Assert.assertEquals(expected, actual);
    	Assert.assertEquals(expected2, actual2);
    	Assert.assertEquals(expected3, actual3);
    	Assert.assertEquals(expected4, actual4);
    	Assert.assertEquals(expected5, actual5);
	}
	
	/**
	 * Tests toString
	 */
	@Test
	public void toStringTest()
	{
		
    	SickPerson sickPerson = new SickPerson("Bob", 12, 2);
    	String actual = sickPerson.toString();
    	String expected = "Bob, a 12-year old. Severity level 2";
    	
    	Assert.assertEquals(expected, actual);
	}
}
