import java.util.ArrayList;

/**
 * Class representing the QueueHospital.
 * 
 * @author johny
 * @version 2019-03-12
 * @param <PatientType> The generic type that the hospital accepts.
 * 
 */
public class QueueHospital<PatientType> extends Hospital<PatientType>
{
	
	private ArrayList<PatientType> patients;
	
	
	public QueueHospital()
	{
		
		patients = new ArrayList<PatientType>();
	}
	
	/**
	 * Adds a patient
	 */
	public void addPatient(PatientType patient)
	{
		
		patients.add(patient);
	}
	
	/**
	 * Finds next patient 
	 * 
	 * @return The patient next in line.
	 */
	public PatientType nextPatient()
	{
		
		return patients.get(0);
	}
	
	/**
	 * Treats the next patient, removing it from the patients ArrayList.
	 * @return The patient being treated and removed.
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
	 * @return The number of patients.
	 */
	public int numPatients()
	{
	
		return patients.size();
	}
	
	/**
	 * Class's name.
	 * 
	 * @return The name of this class.
	 */
	public String hospitalType()
	{
		
		return "QueueHospital";
	}
	
	/**
	 * toString of all patients
	 * 
	 * @return The String containing all the patients, concatenated.
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
