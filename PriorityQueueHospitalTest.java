import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Testing PriorityQueueHospital Class.
 * 
 * @author johny
 * @version 2019-03-12
 *
 */

public class PriorityQueueHospitalTest
{
	/**
	 * Tests addPatient method
	 */
	@Test
	public void addPatientTest()
	{
		
		ArrayList<SickPerson> patients = new ArrayList<SickPerson>();
		SickPerson sickPerson = new SickPerson("Ben", 10, 10);
		
		patients.add(sickPerson);
		
		SickPerson actual = patients.get(0);
		SickPerson expected = sickPerson;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests nextPatient() method.
	 */
	@Test
	public void nextPatientTest()
	{
		
		/**
		 * Testing SickPerson
		 */
		PriorityQueueHospital<Person> stackHos = new PriorityQueueHospital<Person>();
		
		SickPerson sickPerson = new SickPerson("Ben", 10, 10);
		SickPerson sickPerson2 = new SickPerson("John", 24, 24);
		SickPerson sickPerson3 = new SickPerson("Kim", 16, 16);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		Person actual = stackHos.nextPatient();
		Person expected = sickPerson2;
		
		Assert.assertEquals(expected, actual);
		
		/**
		 * Testing HealthyPerson
		 */
		PriorityQueueHospital<Person> stackHos2 = new PriorityQueueHospital<Person>();
		
		HealthyPerson healthyPerson = new HealthyPerson("Kim", 10, "Broken leg");
		HealthyPerson healthyPerson2 = new HealthyPerson("John", 24, "Poison Ivy");
		HealthyPerson healthyPerson3 = new HealthyPerson("Ben", 16, "Cold");
		HealthyPerson healthyPerson4 = new HealthyPerson("Liam", 6, "Cough");
		
		stackHos2.addPatient(healthyPerson);
		stackHos2.addPatient(healthyPerson2);
		stackHos2.addPatient(healthyPerson3);
		stackHos2.addPatient(healthyPerson4);
		
		Person actual2 = stackHos2.nextPatient();
		Person expected2 = healthyPerson3;
		
		Assert.assertEquals(expected2, actual2);
		
		/**
		 * Testing Animal
		 */
		PriorityQueueHospital<Animal> stackHos3 = new PriorityQueueHospital<Animal>();
		
		Animal animal = new Animal("Dog", 30);
		Animal animal2 = new Animal("Cat", 15);
		Animal animal3 = new Animal("Lizard", 36);
		
		stackHos3.addPatient(animal);
		stackHos3.addPatient(animal2);
		stackHos3.addPatient(animal3);
		
		Animal actual3 = stackHos3.nextPatient();
		Animal expected3 = animal3;
		
		Assert.assertEquals(expected3, actual3);
		
		String actual4 = animal.toString();
		String expected4 = "A 30-year old Dog.";
		
		Assert.assertEquals(expected4, actual4);
	}
	
	/**
	 * Tests treatNextPatient method.
	 */
	@Test
	public void treatNextPatientTest()
	{
		
		PriorityQueueHospital<Person> stackHos = new PriorityQueueHospital<Person>();
		
		SickPerson sickPerson = new SickPerson("Ben", 10, 10);
		SickPerson sickPerson2 = new SickPerson("John", 24, 24);
		SickPerson sickPerson3 = new SickPerson("Kim", 16, 16);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		Person actual = stackHos.treatNextPatient();
		Person expected = sickPerson2;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests numPatients method.
	 */
	@Test
	public void numPatientsTest()
	{
		
		PriorityQueueHospital<Person> stackHos = new PriorityQueueHospital<Person>();
		
		SickPerson sickPerson = new SickPerson("Ben", 10, 10);
		SickPerson sickPerson2 = new SickPerson("John", 24, 24);
		SickPerson sickPerson3 = new SickPerson("Kim", 16, 16);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		int actual = stackHos.numPatients();
		int expected = 3;
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests hospitalType method.
	 */
	@Test
	public void hospitalTypeTest() {
		
		PriorityQueueHospital<Person> stackHos = new PriorityQueueHospital<Person>();
		
		String actual = stackHos.hospitalType();
		String expected = "PriorityQueueHospital";
		
		Assert.assertEquals(expected, actual);
	}
	
	/**
	 * Tests allPatientInfo method.
	 */
	@Test
	public void allPatientInfoTest()
	{
		
		PriorityQueueHospital<Person> stackHos = new PriorityQueueHospital<Person>();
		
		SickPerson sickPerson = new SickPerson("Ben", 10, 10);
		SickPerson sickPerson2 = new SickPerson("John", 20, 20);
		SickPerson sickPerson3 = new SickPerson("Kim", 6, 6);
		
		stackHos.addPatient(sickPerson);
		stackHos.addPatient(sickPerson2);
		stackHos.addPatient(sickPerson3);
		
		String actual = stackHos.allPatientInfo();
		String expected = "Ben, a 10-year old. Severity level 10John, a 20-year old. Severity level 20Kim, a 6-year old. Severity level 6";
		
		Assert.assertEquals(expected, actual);
		
		String actual2 = stackHos.toString();
		String expected2 = "A PriorityQueueHospital-type hospital with 3 patients.";
		
		Assert.assertEquals(expected2, actual2);
	}
}
