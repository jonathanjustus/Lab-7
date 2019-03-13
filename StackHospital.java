import java.util.ArrayList;

/**
 * Class representing the StackHospital.
 * 
 * @author johny
 * @version 2019-03-12
 * @param <PatientType> The generic type that the hospital accepts.
 * 
 */
public class StackHospital<PatientType> extends Hospital<PatientType>
{
	
	private ArrayList<PatientType> patients;
	
	
	public StackHospital()
	{
		
		patients = new ArrayList<PatientType>();
	}
	
	/**
	 * Adds the patient
	 * 
	 * @param patient The patient being added.
	 */
	public void addPatient(PatientType patient) 
	{
		
		patients.add(patient);
	}
	
	/**
	 * Finds next patient
	 * 
	 * @return The patient next in line or null if none.
	 */
	public PatientType nextPatient()
	{	

		return patients.get(patients.size()-1);
	}
	
	/**
	 * Treats the next patient
	 * 
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
	 * @return The number of patients still in line
	 */
	public int numPatients()
	{
		
		return patients.size();
	}
	
	/**
	 * States which Hospital this class is.
	 * 
	 * @return The String of this class's name.
	 */
	public String hospitalType()
	{
		
		return "StackHospital";
	}
	
	/**
	 * Concatenates all the patients 
	 * 
	 * @return A string containing all the patients, concatenated.
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
