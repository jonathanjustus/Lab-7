import org.junit.Assert;
import org.junit.Test;

/**
 * Testing StackHospital class.
 * 
 * @author johny
 * @version 2019-03-12
 *
 */
public class QueueHospitalTest
{
	
	/**
	 * Test addPatient
	 */
	@Test
	public void addPatientTest()
	{
		
		QueueHospital<SickPerson> patients = new QueueHospital<SickPerson>();
		SickPerson sickPerson = new SickPerson("Ben", 10, 10);
		
		patients.addPatient(sickPerson);
		
		SickPerson actual = patients.nextPatient();
		SickPerson expected = sickPerson;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test nextPatient
	 */
	@Test
	public void nextPatientTest()
	{
		
		QueueHospital<SickPerson> stackHos = new QueueHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Joe", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kate", 2, 2);
		
		stackHos.addPatient (sickPerson);
		stackHos.addPatient (sickPerson2);
		stackHos.addPatient (sickPerson3);
		
		SickPerson actual = stackHos.nextPatient();
		SickPerson expected = sickPerson;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the treatNextPatient method.
	 */
	@Test
	public void treatNextPatientTest()
	{
		
		QueueHospital<SickPerson> stackHos = new QueueHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Joe", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kate", 2, 2);
		
		stackHos.addPatient (sickPerson);
		stackHos.addPatient (sickPerson2);
		stackHos.addPatient (sickPerson3);
		
		SickPerson actual = stackHos.treatNextPatient();
		SickPerson expected = sickPerson;
		
		Assert.assertEquals(expected, actual);
	}
	/**
	 * Tests the numPatients method.
	 */
	@Test
	public void numPatientsTest()
	{
		
		QueueHospital<SickPerson> stackHos = new QueueHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Joe", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kate", 2, 2);
		
		stackHos.addPatient (sickPerson);
		stackHos.addPatient (sickPerson2);
		stackHos.addPatient (sickPerson3);
		
		int actual = stackHos.numPatients();
		int expected = 3;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the hospitalType method.
	 */
	@Test
	public void hospitalTypeTest()
	{
		
		QueueHospital<SickPerson> stackHos = new QueueHospital<SickPerson>();
		
		String actual = stackHos.hospitalType();
		String expected = "QueueHospital";
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests the allPatientInfo method.
	 */
	@Test
	public void allPatientInfoTest()
	{
		
		QueueHospital<SickPerson> stackHos = new QueueHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Ben", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Jill", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kim", 2, 2);
		
		stackHos.addPatient (sickPerson);
		stackHos.addPatient (sickPerson2);
		stackHos.addPatient (sickPerson3);
		
		String actual = stackHos.allPatientInfo();
		String expected = "Ben, a 5-year old. Severity level 5Jill, a 10-year old. Severity level 10Kim, a 2-year old. Severity level 2";
		
		Assert.assertEquals(expected, actual);
	}
}
