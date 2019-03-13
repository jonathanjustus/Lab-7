import org.junit.Assert;
import org.junit.Test;

/**
 * Testing StackHospital class.
 * 
 * @author johny
 * @version 2019-03-12
 *
 */
public class StackHospitalTest
{
	
	/**
	 * Test addPatient 
	 */
	@Test
	public void addPatientTest()
	{
		
		StackHospital<SickPerson> patients = new StackHospital<SickPerson>();
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		
		patients.addPatient(sickPerson);
		
		SickPerson actual = patients.nextPatient();
		SickPerson expected = sickPerson;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Test nextPatient
	 * 
	 * 	 
	 */
	@Test
	public void nextPatientTest() {
		
		StackHospital<SickPerson> stackHos = new StackHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Joe", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kate", 2, 2);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		SickPerson actual = stackHos.nextPatient();
		SickPerson expected = sickPerson3;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests treatNextPatient 
	 */
	@Test
	public void treatNextPatientTest()
	{
		
		StackHospital<SickPerson> stackHos = new StackHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Joe", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kate", 2, 2);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		SickPerson actual = stackHos.treatNextPatient();
		SickPerson expected = sickPerson3;
		
		Assert.assertEquals(expected, actual);
	}
	/**
	 * Tests numPatients 
	 */
	@Test
	public void numPatientsTest()
	{
		
		StackHospital<SickPerson> stackHos = new StackHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Joe", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kate", 2, 2);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		int actual = stackHos.numPatients();
		int expected = 3;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests hospitalType
	 */
	@Test
	public void hospitalTypeTest()
	{
		
		StackHospital<SickPerson> stackHos = new StackHospital<SickPerson>();
		
		String actual = stackHos.hospitalType();
		String expected = "StackHospital";
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests allPatientInfo
	 */
	@Test
	public void allPatientInfoTest()
	{
		
		StackHospital<SickPerson> stackHos = new StackHospital<SickPerson>();
		
		SickPerson sickPerson = new SickPerson("Bob", 5, 5);
		SickPerson sickPerson2 = new SickPerson("Joe", 10, 10);
		SickPerson sickPerson3 = new SickPerson("Kate", 2, 2);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		String actual = stackHos.allPatientInfo();
		String expected = "Bob, a 5-year old. Severity level 5Joe, a 10-year old. Severity level 10Kate, a 2-year old. Severity level 2";
		
		Assert.assertEquals(expected, actual);
	}
}
