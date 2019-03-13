import java.util.ArrayList;
import java.util.Collections;

/**
 * PriorityQueueHospital Class
 * 
 * @author johny
 * @version 2019-03-10
 * @param <PatientType> The generic type that the hospital accepts.
 * 
 */
public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType> {
	
	private ArrayList<PatientType> patients;
	
	/**
	 * PriorityQueueHospital constructor
	 */
	public PriorityQueueHospital()
	{
		
		patients = new ArrayList<PatientType>();
	}
	
	/**
	 * Adds the patient into ArrayList.
	 * 
	 * @param patient The patient being added.
	 */
	public void addPatient(PatientType patient)
	{
		
		patients.add(patient);
	}
	
	/**
	 * Finds patient next in line.
	 * 
	 * @return The patient next in line.
	 */
	public PatientType nextPatient()
	{
		
		Collections.sort(patients);
		return patients.get(0);
	}
	
	/**
	 * Treat next patient
	 * 
	 * @return The next patient in line to be treated.
	 */
	public PatientType treatNextPatient()
	{
		
		PatientType treatedPat = nextPatient();
		patients.remove(treatedPat);
		
		return treatedPat;
	}
	
	/**
	 * Finds the number of patients
	 * 
	 * @return The number of patients still in line.
	 */
	public int numPatients()
	{
		
		return patients.size();
	}
	
	/**
	 * This class's name.
	 * 
	 * @return The String containing the class's name.
	 */
	public String hospitalType()
	{
		
		return "PriorityQueueHospital";
	}
	
	/**
	 * States all the patients still in line to be treated.
	 * 
	 * @return A string containing all of the patients, concatenated.
	 */
	public String allPatientInfo()
	{
		
		String allPatients = "";
		
		for (int i = 0; i < patients.size(); ++i)
		{
			
			allPatients += patients.get(i);
		}
		
		return allPatients;
	}
}